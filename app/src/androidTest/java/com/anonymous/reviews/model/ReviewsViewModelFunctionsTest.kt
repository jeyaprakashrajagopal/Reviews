package com.anonymous.reviews.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.anonymous.reviews.getOrAwaitValue
import com.anonymous.reviews.reviewmodule.model.ReviewsData
import com.anonymous.reviews.reviewmodule.repository.FakeRepositorySource
import com.anonymous.reviews.reviewmodule.util.constants

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ReviewsViewModelFunctionsTest {
    // Launching the main activity before the test begins and destroys it after the test
    lateinit var repository: FakeRepositorySource
    lateinit var viewModel : ReviewsViewModel

    @Before
    fun setUp() {
        repository = FakeRepositorySource()
        viewModel = ReviewsViewModel(repository)
    }

    @Test
    fun testReviewsViewModel_WhenReviewsRequested_RetrieveReviewsAndSizeMatch() {
        val reviewData = viewModel.getReviewDocs(constants.QUERYMAP).getOrAwaitValue() as ReviewsData
        assert(reviewData.reviews.size == 2)
    }

    @Test
    fun testReviewsViewModel_WhenReviewsRequested_RetrieveReviews() {
        val reviewData = viewModel.getReviewDocs(constants.QUERYMAP).getOrAwaitValue() as ReviewsData
        assert(reviewData.reviews.get(0).message.equals("I love Berlin"))
    }
}