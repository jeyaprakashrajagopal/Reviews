package com.anonymous.reviews.reviewmodule.model

import com.anonymous.reviews.BaseUnitTest
import com.anonymous.reviews.model.Review
import com.anonymous.reviews.reviewmodule.repository.FakeRepositorySource
import com.anonymous.reviews.reviewmodule.repository.FakeRepositorySource.mockInput
import com.anonymous.reviews.reviewmodule.repository.ReviewsRepository
import com.anonymous.reviews.utils.getValueForTest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class ReviewsViewModelTest: BaseUnitTest() {
    // region constants
    // endregion constants

    // region instances declaration
    @Mock
    private lateinit var repository: ReviewsRepository
    private lateinit var sut: ReviewsViewModel
    private val test = TestCoroutineDispatcher()
    // endregion variable declaration and mock init

    @Before
    fun setUp() {
        Dispatchers.setMain(test)
        sut = ReviewsViewModel(repository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun reviewsViewModel_networkError_networkErrorReturned() = runBlocking {
        val mockError = ReviewsData.Error("Nw error")

        `when`(repository.getReviews(mockInput)).thenReturn(mockError)
        sut.getReviewDocs(mockInput)

        verify(repository, times(1)).getReviews(mockInput)
        MatcherAssert.assertThat(mockError.error, `is`(sut.reviewsError.getValueForTest()))
    }

    @Test
    fun reviewsViewModel_success_singleReviewDocumentReturned() = runBlocking {
        val mockData = ReviewsData.Success(listOf(Review()))

        `when`(repository.getReviews(mockInput)).thenReturn(mockData)
        sut.getReviewDocs(mockInput)

        verify(repository, times(1)).getReviews(mockInput)
        MatcherAssert.assertThat(mockData.reviews, `is`(sut.reviewsData.getValueForTest()))
    }

    @Test
    fun reviewsViewModel_success_multipleReviewsReturned() = runBlocking {
        val mockData = FakeRepositorySource.getReviews(mockInput)

        `when`(repository.getReviews(mockInput)).thenReturn(mockData)
        sut.getReviewDocs(mockInput)

        verify(repository, times(1)).getReviews(mockInput)
        MatcherAssert.assertThat(mockData.reviews, `is`(sut.reviewsData.getValueForTest()))
    }
}