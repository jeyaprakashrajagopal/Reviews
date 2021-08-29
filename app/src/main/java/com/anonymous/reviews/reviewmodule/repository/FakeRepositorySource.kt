package com.anonymous.reviews.reviewmodule.repository

import com.anonymous.reviews.model.Review
import com.anonymous.reviews.reviewmodule.model.ReviewsData
import com.anonymous.reviews.reviewmodule.util.RepositoryInterface

/**
 * Created this class to mock the repository
 */
class FakeRepositorySource : RepositoryInterface {

    override suspend fun getReviews(queryMap: Map<String, Any>) : ReviewsData {
        return ReviewsData(listOf(REVIEW_1, REVIEW_2))
    }

    fun getReference() : RepositoryInterface = this

    val REVIEW_1 = Review(message = "I love Berlin", id = 1,
                            author = Review.Author(fullName = "Anonymous",
                            country = "USA", photo = ""),
                            created ="2021-07-31T01:05:16+01:00")
    val REVIEW_2 = Review(message = "I really enjoyed the food", id = 2,
        author = Review.Author(fullName = "Anonymous",
            country = "Germany", photo = ""), created ="2020-07-31T05:05:16+01:00")
}