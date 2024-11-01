package com.example.baguiobest


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.baguiobest.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    private val args: DetailsFragmentArgs by navArgs() // Assuming you're passing the Place object through args

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Accessing the Place object from the arguments
        val place = args.place // Ensure 'place' is of type Place
        binding.placeImage.setImageResource(place.imageResource) // Updated to use imageResource
        binding.placeDetails.text = place.details // Accessing details
        binding.placeLocation.text = place.location
    }
}
