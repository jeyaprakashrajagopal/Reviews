package com.anonymous.reviews.reviewmodule.util

import com.anonymous.reviews.reviewmodule.model.ReviewsData

/**
 * Interface that makes testing easier
 */
interface RepositoryInterface {
    suspend fun getReviews(queryMap: Map<String, Any>) : ReviewsData
}