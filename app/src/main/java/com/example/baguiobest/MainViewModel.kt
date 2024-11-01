package com.example.baguiobest


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    private val placeData = mapOf(
        "Coffee Shops" to listOf(
            Place("Nest Coffee Roasters", R.drawable.coffee1, "Coffee Shops", "Nest Coffee Roasters in Baguio is a cozy specialty coffee shop dedicated to serving freshly roasted, high-quality coffee sourced from local farmers and international producers. Nest's inviting ambiance and skilled baristas make it an ideal spot for coffee enthusiasts and casual drinkers alike to enjoy a unique coffee experience in the heart of Baguio.", "Location: Calle Uno Food Hub, 3 Escoda Street, Corner Naguilian Rd, Baguio, 2600 Benguet"),
            Place("Tau Ceti Specialty Coffee", R.drawable.coffee2, "Coffee Shops", "Tau Ceti Specialty Coffee is a refined coffee destination that focuses on high-quality, ethically sourced beans, expertly brewed to highlight unique flavors. With a minimalist, inviting ambiance, Tau Ceti offers a serene space for coffee lovers to unwind and enjoy exceptional coffee experiences.", "Location: Ground floor, Albergo Hotel, 1 Ignacio Villamor St, Baguio, Benguet"),
            Place("Brew & Alchemy Coffeeworks", R.drawable.coffee3, "Coffee Shops", "Brew & Alchemy Coffeeworks is a specialty coffee shop known for its artisanal brewing methods and expertly sourced beans, delivering rich, flavorful coffee experiences. With a modern, cozy interior, it’s a popular spot for coffee enthusiasts to relax, work, or socialize over meticulously crafted drinks.", "Location:4th Floor Porta Vaga Mall Annex, Session Rd, Baguio, 2600 Benguet"),

            ),

        "Restaurants" to listOf(
            Place("Le Chef", R.drawable.resto1, "Restaurants", "Le Chef in Baguio is a renowned dining destination offering a delightful blend of international and local cuisine, set against the backdrop of the city's cool, mountainous atmosphere. Known for its elegant ambiance and exceptional service, the restaurant is a favorite among both locals and tourists seeking a memorable culinary experience.", "Location:2600 Loakan Rd, Baguio, Benguet"),
            Place("Canto", R.drawable.resto2, "Restaurants", "Canto is a popular eatery in Baguio known for its cozy atmosphere and delicious comfort food, particularly its mouthwatering breakfast offerings and grilled dishes. With a focus on fresh, local ingredients, this charming restaurant has become a favorite spot for both locals and tourists looking to enjoy hearty meals in a relaxed setting.", "Location:25 Kisad Rd, Baguio, 2600 Benguet"),
            Place("Lemon and Olives Greek Taverna ", R.drawable.resto3, "Restaurants", "Lemon and Olives Greek Taverna in Baguio offers a unique dining experience with its authentic Greek cuisine, featuring a wide range of traditional dishes made from fresh, locally sourced ingredients. The warm and inviting atmosphere, complemented by friendly service, makes it a perfect spot for enjoying flavorful meals and exploring the rich tastes of Greece in the heart of the mountains.", "Location:26 Outlook Dr S, Baguio, 2600 Benguet"),
        ),

        "Kid-Friendly Places" to listOf(
            Place("Valley of Colors", R.drawable.kidsplaces1, "Kid-Friendly Places", "The Valley of Colors in Baguio is a vibrant garden showcasing a stunning array of blooming flowers and colorful landscapes, attracting visitors with its picturesque views and lively atmosphere. Ideal for photography enthusiasts and nature lovers, this enchanting destination offers a serene escape while celebrating the beauty of nature amidst the cool mountain air.", "Location: Leonard Wood Road, Baguio City"),
            Place("Igorot Stone Kingdom Inc.", R.drawable.kidplaces4, "Kid-Friendly Places", "Igorot Stone Kingdom Inc. is a remarkable cultural and artistic site in Baguio, showcasing intricately crafted stone sculptures and structures that celebrate the heritage of the Igorot people. This unique destination not only highlights the artistic talent of local artisans but also serves as an educational experience, allowing visitors to appreciate the rich history and traditions of the Igorot culture.", "Location:Long Long Benguet Rd, Baguio, Benguet"),
            Place("Sky Ranch Baguio", R.drawable.kidsplaces3, "Kid-Friendly Places", "Sky Ranch Baguio is an exhilarating amusement park set against the breathtaking backdrop of the Cordillera mountains, offering a variety of rides and attractions for visitors of all ages. With its stunning views, vibrant atmosphere, and family-friendly activities, it has become a popular destination for both locals and tourists seeking fun and adventure in the cool mountain air.", "Location: Luneta Hill, Upper Session Rd, Baguio, 2600 Benguet"),

            ),

        "Parks" to listOf(
            Place("Burnham Park", R.drawable.park1, "Parks", "Burnham Park is a scenic urban park in Baguio, known for its lush gardens, tranquil lakes, and various recreational activities that invite both relaxation and exploration. Popular among locals and tourists alike, the park features bike rentals, paddle boats, and picnic areas, making it a perfect spot to enjoy the city's cool climate and natural beauty.", "Location:ose Abad Santos Dr, Baguio, 2600 Benguet"),
            Place("Wright Park", R.drawable.park2, "Parks", "Wright Park is a charming recreational area in Baguio, famous for its picturesque pool of pine trees and a vibrant riding arena that showcases the city's equestrian culture. Visitors can enjoy horseback riding, leisurely strolls along the scenic pathways, and the refreshing ambiance, making it a beloved destination for families and nature lovers alike.", "Location:The Mansion, Romulo Dr, Baguio, Benguet"),
            Place("Mirador Heritage and Eco Park", R.drawable.park3, "Parks", "Mirador Heritage and Eco Park in Baguio offers a serene escape into nature, featuring lush landscapes, walking trails, and stunning views of the surrounding mountains. This eco-friendly park also serves as a cultural hub, showcasing the history and heritage of the region through its educational exhibits and community events.", "Location:15 St Theresa Ext., Baguio, Benguet"),
        ),


        "Shopping Centers" to listOf(
            Place("SM City Baguio", R.drawable.shop1, "Shopping Centers", "SM Baguio is a premier shopping destination that combines a wide array of retail stores, dining options, and entertainment facilities, all set in a unique, open-air environment. Known for its cool climate and stunning views of the city, the mall provides a vibrant atmosphere for locals and tourists to enjoy shopping, leisure, and dining experiences year-round.", "Location: Luneta Hill, Upper Session Road, Baguio City, Benguet."),
            Place("Porta Vaga Mall", R.drawable.shop2, "Shopping Centers", "Porta Vaga Mall is a bustling shopping center in Baguio City, offering a diverse selection of retail stores, dining options, and entertainment facilities. Its central location makes it a popular destination for locals and tourists alike, providing a vibrant atmosphere and easy access to various services and amenities.", "Location: Upper Session Road, Baguio City, Benguet."),
            Place("Abanao Square", R.drawable.shop3, "Shopping Centers", "Abanao Square is a lively shopping complex in Baguio City, known for its eclectic mix of retail shops, food stalls, and entertainment options that cater to a diverse clientele. With its convenient location and vibrant atmosphere, the mall serves as a popular hub for both locals and visitors, making it a great spot to shop, dine, and enjoy the local culture.", "Location: Abanao corner Zandu Eta Street, Baguio City, Benguet."),
        )


    )


    fun loadPlaces(category: String) {
        // Load places based on the provided category
        _places.value = placeData[category] ?: emptyList()
    }
}