package com.anonymous.reviews.reviewmodule.apiservice

/**
 * Interface to communicate click events from adapter to the fragment
 */
interface ReviewInterface {
    fun onReviewSelection(position: Int)
}