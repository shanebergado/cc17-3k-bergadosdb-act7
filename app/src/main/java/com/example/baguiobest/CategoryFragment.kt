package com.example.baguiobest


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.baguiobest.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {
    private lateinit var binding: FragmentCategoryBinding
    private val viewModel: MainViewModel by viewModels()
    private val args: CategoryFragmentArgs by navArgs() // Using Safe Args for navigation arguments

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Setting up the category title from the navigation argument
        binding.categoryTitle.text = args.category
        binding.placesRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Observing places from the ViewModel and setting the adapter
        viewModel.loadPlaces(args.category)
        viewModel.places.observe(viewLifecycleOwner) { places ->
            binding.placesRecyclerView.adapter = PlaceAdapter(places) { place ->
                val action = CategoryFragmentDirections
                    .actionCategoryFragmentToDetailsFragment(place) // `place` is now passed correctly
                findNavController().navigate(action)
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.placesRecyclerView.adapter = null // Prevents memory leaks
    }
}
