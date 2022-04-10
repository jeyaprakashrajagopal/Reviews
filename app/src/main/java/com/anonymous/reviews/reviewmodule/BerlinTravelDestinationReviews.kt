package com.anonymous.reviews.reviewmodule

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anonymous.reviews.R
import com.anonymous.reviews.adapter.TravelDestinationReviewsAdapter
import com.anonymous.reviews.databinding.FragmentBerlinTravelDestinationReviewsBinding
import com.anonymous.reviews.reviewmodule.apiservice.ReviewInterface
import com.anonymous.reviews.reviewmodule.factory.ReviewsViewModelFactory
import com.anonymous.reviews.reviewmodule.model.ReviewsViewModel
import com.anonymous.reviews.reviewmodule.util.MyUtils.ToggleVisibility
import com.anonymous.reviews.reviewmodule.util.SortingType
import com.anonymous.reviews.reviewmodule.util.constants
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * This fragment displays all the reviews collected from the remote source
 * based on pagination
 */
@AndroidEntryPoint
class BerlinTravelDestinationReviews :
        Fragment(R.layout.fragment_berlin_travel_destination_reviews), ReviewInterface {

    @Inject
    lateinit var factory: ReviewsViewModelFactory
    // View model instantiation
    private val reviewsViewModel: ReviewsViewModel by activityViewModels() {
        factory
    }
    // Is review already loading
    private var isLoading: Boolean = false

    // Initializing Data Binding implementation component
    private lateinit var bindingBerlinDestinationReviews : FragmentBerlinTravelDestinationReviewsBinding

    // Recyclerview declaration
    private lateinit var travelDestinationReviewsAdapter: TravelDestinationReviewsAdapter

    /**
     * When view gets created bind the view and initialize the view and model components
     * We don't have to inflate the view as it's already done
     *
     * @return -
     */
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Bind the view to the binding module as the view got initialized since layout file has
        // already been sent to Fragment class
        bindingBerlinDestinationReviews = FragmentBerlinTravelDestinationReviewsBinding.bind(view)

        // Initialize Views
        initialize()
        // Create recyclerView
        createRecyclerView()
        // Initialize Nested scrollview
        initializeNestedSV()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun initializeNestedSV() {

        // Setting scroll view listener to get the reviews from the remote repository when user scrolls
        bindingBerlinDestinationReviews.reviewsRecyclerView.addOnScrollListener(object: RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if(!isLoading) {
                    if (!recyclerView.canScrollVertically(1) &&
                            !reviewsViewModel.hasLastPageReached) {
                        isLoading = true
                        fetchReviewsData()
                        ToggleVisibility(
                            bindingBerlinDestinationReviews.progressGetReviewItems,
                            true
                        )
                    }
                }
            }
        })
    }

    /**
     * Fetches Review data and handle live data results from remote source
     *
     * @param -
     * @return -
     */
    private fun fetchReviewsData() {
        // input is designed to accommodate the pagination which will offset previously loaded data
        val queryMap = mapOf("offset" to (reviewsViewModel.reviewsData.value?.size ?: 0), "limit" to constants.LIMIT,
            "sort" to SortingType.DESCDATE.method)

        reviewsViewModel.reviewsError.observe(viewLifecycleOwner) {
            isLoading = false
            // If get review docs result in error or with the data
            ToggleVisibility(bindingBerlinDestinationReviews.progressGetReviewItems, false)
        }
        reviewsViewModel.reviewsData.observe(viewLifecycleOwner) {
            // If get review docs result in error or with the data
            ToggleVisibility(bindingBerlinDestinationReviews.progressGetReviewItems, false)

            if(it.isNotEmpty()) {
                // Render reviews on the recycler view adapter
                renderList()
            }
            isLoading = false
        }
        lifecycleScope.launchWhenStarted {
            reviewsViewModel.getReviewDocs(queryMap)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun renderList() {
        travelDestinationReviewsAdapter.submitList(reviewsViewModel.reviewsData.value)
    }

    /**
     * Creates recycler view adapter and sets the recycler view
     * Setting an interface context for list item clicks
     *
     * @param -
     * @return -
     */
    private fun createRecyclerView() {
        bindingBerlinDestinationReviews.reviewsRecyclerView.apply {
            adapter = travelDestinationReviewsAdapter
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }

        travelDestinationReviewsAdapter.setReviewInterface(this)
    }

    /**
     * Initializes the view model and sets up intent listener for different intents defined
     * (only one intent is used in this app)
     * @param -
     * @return -
     */
    private fun initialize() {
        travelDestinationReviewsAdapter = TravelDestinationReviewsAdapter()

        if (reviewsViewModel.reviewsData.value?.isEmpty() == true) {
            // Fetched live data observer
            fetchReviewsData()
        }
        else {
            reviewsViewModel.reviewsData.value.let { renderList() }
        }
    }

    /**
     * Getting item position from the adapter and navigate to display the review item details
     *
     * @param position
     * @return -
     */
    override fun onReviewSelection(position: Int) {
        val action = reviewsViewModel.reviewsData.value?.get(position)?.let {
            BerlinTravelDestinationReviewsDirections.actionReviewsFragmentToReviewDetailsFragment(
                it
            )
        }

        if (action != null) {
            findNavController().navigate(action)
        }
    }
}