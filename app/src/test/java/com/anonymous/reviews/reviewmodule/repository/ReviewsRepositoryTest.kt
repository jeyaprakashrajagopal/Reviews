package com.anonymous.reviews.reviewmodule.repository

import android.accounts.NetworkErrorException
import com.anonymous.reviews.BaseUnitTest
import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation
import com.anonymous.reviews.reviewmodule.repository.FakeRepositorySource.mockInput
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
@ExperimentalCoroutinesApi
class ReviewsRepositoryTest : BaseUnitTest() {
    private lateinit var SUT: ReviewsRepository
    @Mock lateinit var reviewsApiServiceImplementation: ReviewsApiServiceImplementation

    @Before
    fun setUp() {
        Dispatchers.setMain(testCoroutineDispatcher)
        SUT = ReviewsRepository(reviewsApiServiceImplementation)
    }
    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun reviewsRepository_getReviews_reviewsReturned()  {
        runBlocking {
            `when`(reviewsApiServiceImplementation.getReviews(mockInput)).thenReturn(
                FakeRepositorySource.getReviews(mockInput))

            val reviewsResult = SUT.getReviews(mockInput)

            verify(reviewsApiServiceImplementation, times(1)).getReviews(mockInput)
            assertThat(reviewsResult, `is`(FakeRepositorySource.getReviews(mockInput)))
        }
    }
}