package com.anonymous.reviews.reviewmodule.repository

import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation
import com.anonymous.reviews.reviewmodule.model.ReviewsData
import com.anonymous.reviews.reviewmodule.util.RepositoryInterface

/**
 * Repository class that communicates with the API interface
 */
class ReviewsRepository (val interfaceImpl: ReviewsApiServiceImplementation) : RepositoryInterface {
     override suspend fun getReviews(queryMap: Map<String, Any>) : ReviewsData
     = interfaceImpl.getReviews(queryMap)
}