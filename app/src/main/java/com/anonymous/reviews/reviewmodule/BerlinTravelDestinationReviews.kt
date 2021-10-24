package com.anonymous.reviews

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anonymous.reviews.adapter.TravelDestinationReviewsAdapter
import com.anonymous.reviews.databinding.FragmentBerlinTravelDestinationReviewsBinding
import com.anonymous.reviews.model.Review
import com.anonymous.reviews.model.ReviewsViewModel
import com.anonymous.reviews.reviewmodule.apiservice.ReviewInterface
import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation
import com.anonymous.reviews.reviewmodule.factory.ReviewsViewModelFactory
import com.anonymous.reviews.reviewmodule.model.ReviewsData
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
     * @param reviewsViewModel.state
     * @return -
     */
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Bind the view to the binding module as the view got initialized since layout file has
        // already been sent to Fragment class
        bindingBerlinDestinationReviews = FragmentBerlinTravelDestinationReviewsBinding.bind(view)

        // Intialize Views
        Initialize()
        // Create recyclerView
        CreateRecyclerView()
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
                        FetchReviewsData()
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
    private fun FetchReviewsData() {
        // input is designed to accommodate the pagination which will offset previously loaded data
        val QUERYMAP = mapOf("offset" to reviewsViewModel.reviewsData.size, "limit" to constants.LIMIT,
            "sort" to SortingType.DESCDATE.method)

        reviewsViewModel.getReviewDocs(QUERYMAP).observe(viewLifecycleOwner, Observer {
            // If get review docs result in error or with the data
            if(it is HashMap<*, *>) {
                Toast.makeText(requireContext(), it.get("error").toString(), Toast.LENGTH_SHORT).show()
                ToggleVisibility(bindingBerlinDestinationReviews.progressGetReviewItems, false)
                isLoading = false
            }
            else if(it is ReviewsData) {
                ToggleVisibility(bindingBerlinDestinationReviews.progressGetReviewItems, false)

                if(it.reviews.size != 0) {
                    // Render reviews on the recycler view adapter
                    renderList(it.reviews)
                } else {
                    // if there is no more reviews
                    if (it.reviews.size < constants.LIMIT) {
                        reviewsViewModel.hasLastPageReached = true
                    }
                }
                isLoading = false
            }
        })
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun renderList(reviewsData: List<Review>) {
        // To avoid duplicates when configuration gets changed
        reviewsData.filter { !reviewsViewModel.reviewsData.contains(it) }.forEach {
            reviewsViewModel.reviewsData.add(it)
        }
        // If recyclerview list is empty submit the reviews otherwise just notify
        if(travelDestinationReviewsAdapter.currentList.isEmpty()){
            travelDestinationReviewsAdapter.submitList(reviewsViewModel.reviewsData)
        }
        else {
            travelDestinationReviewsAdapter.notifyDataSetChanged()
        }
    }

    /**
     * Creates recycler view adapter and sets the recycler view
     * Setting an interface context for listitem clicks
     *
     * @param -
     * @return -
     */
    private fun CreateRecyclerView() {
        bindingBerlinDestinationReviews.reviewsRecyclerView.apply {
            adapter = travelDestinationReviewsAdapter
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }

        travelDestinationReviewsAdapter.setReviewInterface(this)
    }

    /**
     * Initializes the viewmodel and sets up intent listener for different intents defined
     * (only one intent is used in this app)
     * @param -
     * @return -
     */
    private fun Initialize() {
        travelDestinationReviewsAdapter = TravelDestinationReviewsAdapter()

        if (reviewsViewModel.reviewsData.isEmpty()) {
            // Fetched live data observer
            FetchReviewsData()
        }
        else {
            renderList(reviewsViewModel.reviewsData)
        }
    }

    /**
     * Getting item position from the adapter and navigate to display the review item details
     *
     * @param position
     * @return -
     */
    override fun onReviewSelection(position: Int) {
        val action = BerlinTravelDestinationReviewsDirections.
            actionReviewsFragmentToReviewDetailsFragment(reviewsViewModel.reviewsData.get(position)
        )

        findNavController().navigate(action)
    }

}