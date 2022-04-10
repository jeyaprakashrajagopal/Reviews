package com.anonymous.reviews

import com.anonymous.reviews.model.Review
import com.anonymous.reviews.reviewmodule.model.ReviewsData
import com.anonymous.reviews.reviewmodule.model.ReviewsViewModel
import com.anonymous.reviews.reviewmodule.repository.ReviewsRepository
import com.anonymous.reviews.reviewmodule.util.SortingType
import com.anonymous.reviews.reviewmodule.util.constants
import com.anonymous.reviews.utils.getValueForTest
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

@ExperimentalCoroutinesApi
class ViewModelShould : BaseUnitTest(){
    private lateinit var repository: ReviewsRepository
    private lateinit var sut: ReviewsViewModel
    private val mockInput = mapOf("offset" to 10, "limit" to constants.LIMIT,
        "sort" to SortingType.DESCDATE.method)

    private val test = TestCoroutineDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(test)
        repository = mock(ReviewsRepository::class.java)
        sut = ReviewsViewModel(repository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun testDisplayLoaderWhileFetchingReviews() = runBlocking {
        val mockError = ReviewsData.Error("Nw error")

        `when`(repository.getReviews(mockInput)).thenReturn(mockError)
        sut.getReviewDocs(mockInput)

        assertEquals(mockError.error, sut.reviewsError.getValueForTest())
    }

    @Test
    fun testGetReviewDocs() = runBlocking {
        val mockData = ReviewsData.Success(listOf(Review()))

        `when`(repository.getReviews(mockInput)).thenReturn(mockData)

        sut.getReviewDocs(mockInput)

        assertEquals(mockData.reviews, sut.reviewsData.getValueForTest())
    }
}