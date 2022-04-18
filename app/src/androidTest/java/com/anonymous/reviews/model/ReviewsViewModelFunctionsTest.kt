package com.anonymous.reviews.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.anonymous.reviews.reviewmodule.model.ReviewsViewModel
import com.anonymous.reviews.reviewmodule.repository.FakeRepositorySource
import com.anonymous.reviews.reviewmodule.util.constants
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class ReviewsViewModelFunctionsTest {
    // Launching the main activity before the test begins and destroys it after the test
    private lateinit var viewModel : ReviewsViewModel

    @Before
    fun setUp() {
        viewModel = ReviewsViewModel(FakeRepositorySource)
    }

    @Test
    fun testReviewsViewModel_WhenReviewsRequested_RetrieveReviewsAndSizeMatch() = runBlocking {
        viewModel.getReviewDocs(constants.QUERYMAP)
        assertEquals(2, viewModel.reviewsData.value?.size)
    }

    @Test
    fun testReviewsViewModel_WhenReviewsRequested_RetrieveReviews() = runBlocking {
        viewModel.getReviewDocs(constants.QUERYMAP)
        assertEquals("I love Berlin", viewModel.reviewsData.value?.get(0)?.message)
    }
}