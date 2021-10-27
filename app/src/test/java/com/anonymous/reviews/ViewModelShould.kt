package com.anonymous.reviews

import com.anonymous.reviews.model.ReviewsViewModel
import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiService
import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation
import com.anonymous.reviews.reviewmodule.model.ReviewsData
import com.anonymous.reviews.reviewmodule.repository.ReviewsRepository
import com.anonymous.reviews.reviewmodule.util.SortingType
import com.anonymous.reviews.reviewmodule.util.constants
import com.anonymous.reviews.utils.captureValues
import com.anonymous.reviews.utils.getValueForTest
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever
import retrofit2.http.QueryMap

@ExperimentalCoroutinesApi
class ViewModelShould : BaseUnitTest(){
    val repository = mock(ReviewsRepository::class.java)
    val viewmodel = ReviewsViewModel(repository)
    val mockdata = mock<ReviewsData>()
    val mockInput = mapOf("offset" to 10, "limit" to constants.LIMIT,
        "sort" to SortingType.DESCDATE.method)

    val test= TestCoroutineDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(test)
    }

    @Test
    fun testDisplayLoaderWhileFetchingReviews() = runBlockingTest {

    }

    @Test
    fun testGetReviewDocs() = runBlockingTest {
        `when`(repository.getReviews(mockInput)).thenReturn(mockdata)

        viewmodel.getReviewDocs(mockInput).captureValues {

        }

        assertEquals(mockdata, viewmodel.getReviewDocs(mockInput).getValueForTest())
    }
}