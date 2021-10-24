package com.anonymous.reviews.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.anonymous.reviews.reviewmodule.util.RepositoryInterface
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

/**
 * View model of the architecture that handles the operations
 */
class ReviewsViewModel @Inject constructor(val reviewsRepository: RepositoryInterface): ViewModel()
{
    // To store the retrieved API data
    var reviewsData : MutableList<Review>
    // If reviews last page reaches
    var hasLastPageReached = false

    init {
        reviewsData = mutableListOf()
    }


    /**
     * Make REST API request and wait for the response
     * Updates state to loading then Success/Error once available
     */
    fun getReviewDocs(queryMap: Map<String, Any>) = liveData(Dispatchers.IO)
    {
        try {
            val reviews = reviewsRepository.getReviews(queryMap)
            println("reviews $reviews")
            emit(reviews)
        }
        catch (e: Exception) {
            emit(hashMapOf("error" to e.message.toString()))
        }
    }
}