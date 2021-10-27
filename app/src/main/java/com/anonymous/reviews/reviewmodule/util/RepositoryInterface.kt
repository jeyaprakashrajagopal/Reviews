package com.anonymous.reviews.reviewmodule.util

import com.anonymous.reviews.reviewmodule.model.ReviewsData
import kotlinx.coroutines.flow.Flow

/**
 * Interface that makes testing easier
 */
interface RepositoryInterface {
    suspend fun getReviews(queryMap: Map<String, Any>) : ReviewsData
}