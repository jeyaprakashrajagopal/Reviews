package com.anonymous.reviews.reviewmodule.apiservice

import com.anonymous.reviews.reviewmodule.model.ReviewsData

/**
 * Helper implementation class for testing purposes
 */
class ReviewsApiServiceImplementation  {
    suspend fun getReviews(queryMap: Map<String, Any>): ReviewsData = ReviewAPIBuilder.reviewsApiService.getReviews(queryMap)
}