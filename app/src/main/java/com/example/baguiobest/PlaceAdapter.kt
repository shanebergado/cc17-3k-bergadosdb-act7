package com.example.baguiobest


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baguiobest.databinding.ItemPlaceBinding

class PlaceAdapter(
    private val places: List<Place>,
    private val onClick: (Place) -> Unit
) : RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val binding = ItemPlaceBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return PlaceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(places[position], onClick)
    }

    override fun getItemCount(): Int = places.size

    inner class PlaceViewHolder(private val binding: ItemPlaceBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(place: Place, onClick: (Place) -> Unit) {
            binding.placeName.text = place.name // Ensuring this ID matches the TextView in item_place.xml
            binding.root.setOnClickListener { onClick(place) }
        }
    }
}
