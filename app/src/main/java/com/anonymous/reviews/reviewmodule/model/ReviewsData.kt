package com.anonymous.reviews.reviewmodule.model

import com.anonymous.reviews.model.Review

/**
 * Actual response model from DB
 */
sealed class ReviewsData
{
    data class Success(val reviews: List<Review>): ReviewsData()
    data class Error(val error: String): ReviewsData()
    object Loading : ReviewsData()
}
