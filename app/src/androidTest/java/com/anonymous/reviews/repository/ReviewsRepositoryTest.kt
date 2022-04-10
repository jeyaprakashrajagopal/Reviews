package com.anonymous.reviews.repository

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.anonymous.reviews.reviewmodule.repository.FakeRepositorySource
import com.anonymous.reviews.reviewmodule.util.constants
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ReviewsRepositoryTest {
    lateinit var repository : FakeRepositorySource

    @Before
    fun setUp() {
        repository = FakeRepositorySource()
    }

    @Test
    fun testReviewsRepository_WhenDataGetsRetrieved_isMessageMatching() = runBlocking {
        val reviews = repository.getReviews(constants.QUERYMAP)
        assert(reviews.reviews[0].message == "I love Berlin")
    }

    @Test
    fun testReviewsRepository_WhenDataGetsRetrieved_retrievedDataSizeMatches() = runBlocking {
        val reviews = repository.getReviews(constants.QUERYMAP)
        assert(reviews.reviews.size == 2)
    }
}