package com.anonymous.reviews.reviewmodule.model

import com.anonymous.reviews.model.Review

/**
 * Actual response model from DB
 */
data class ReviewsData
(
    val reviews: List<Review>
)