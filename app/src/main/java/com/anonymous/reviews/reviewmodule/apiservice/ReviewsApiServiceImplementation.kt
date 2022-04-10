package com.anonymous.reviews.reviewmodule.apiservice

import com.anonymous.reviews.reviewmodule.model.ReviewsData
import javax.inject.Inject

/**
 * Helper implementation class for testing purposes
 */
class ReviewsApiServiceImplementation @Inject constructor(
    private val apiService: ReviewsApiService
)  {
    suspend fun getReviews(queryMap: Map<String, Any>): ReviewsData = try {
        val result = apiService.getReviews(queryMap)
        ReviewsData.Success(result.reviews)
    }
    catch (e: Exception) {
        ReviewsData.Error(e.message.toString())
    }

}