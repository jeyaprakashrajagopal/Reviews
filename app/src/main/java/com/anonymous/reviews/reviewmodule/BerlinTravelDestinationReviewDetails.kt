package com.anonymous.reviews

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.anonymous.reviews.databinding.FragmentReviewDetailsBinding
import com.anonymous.reviews.model.Review

/**
 * This fragment displays the review details that got selected by the user
 */
class BerlinTravelDestinationReviewDetails : Fragment(R.layout.fragment_review_details) {
    // To hold the binding component that basically gets created (binding of the given layout)
    private lateinit var fragmentReviewDetailsBinding: FragmentReviewDetailsBinding
    // To receive arguments from the navigation component which is parcelled from the parent
    // fragment
    private val args: BerlinTravelDestinationReviewDetailsArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Binding the view since it got inflated already
        fragmentReviewDetailsBinding = FragmentReviewDetailsBinding.bind(view)
        // Initialize the view with data
        Initialize()
    }

    /**
     * Initializes view with
     */
    private fun Initialize() {
        // Getting review
        val review : Review = args.selectedReview
        // To display review details on the view
        fragmentReviewDetailsBinding.reviewDetailsItem = review
    }


}