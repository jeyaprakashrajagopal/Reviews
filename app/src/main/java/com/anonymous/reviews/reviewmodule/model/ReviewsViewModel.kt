package com.anonymous.reviews.reviewmodule.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anonymous.reviews.model.Review
import com.anonymous.reviews.reviewmodule.GetReviewsUseCase
import com.anonymous.reviews.reviewmodule.util.RepositoryInterface
import com.anonymous.reviews.reviewmodule.util.constants
import javax.inject.Inject

/**
 * View model of the architecture that handles the operations
 */
class ReviewsViewModel @Inject constructor(reviewsRepository: RepositoryInterface): ViewModel()
{
    // To store the retrieved API data
    private val _reviewsData = MutableLiveData<List<Review>>(listOf())
    val reviewsData : LiveData<List<Review>> = _reviewsData

    // To report the error retrieved API data
    private val _reviewsError = MutableLiveData("")
    val reviewsError : LiveData<String> = _reviewsError

    // If reviews last page reaches
    var hasLastPageReached = false

    // Singleton instance gets created once the project is adapted to clean architecture
    private val reviewsUseCase = GetReviewsUseCase(reviewsRepository)

    /**
     * Make REST API request and wait for the response
     * Updates state to loading then Success/Error once available
     */
    suspend fun getReviewDocs(queryMap: Map<String, Any>)
    {
        try {
            val data = _reviewsData.value?.toMutableList()
            when(val reviews = reviewsUseCase.getReviewDocs(queryMap)) {
                is ReviewsData.Success -> {
                    // If last page is reached
                    if(reviews.reviews.size < constants.LIMIT) hasLastPageReached = true

                    reviews.reviews.forEach {
                        if (data != null) {
                            if (!data.contains(it)) data.add(it)
                        }
                    }
                    _reviewsData.postValue(data ?: mutableListOf())
                }
                is ReviewsData.Error -> {
                    _reviewsError.postValue(reviews.error)
                }
            }
        }
        catch (e: Exception) {
            _reviewsError.postValue(e.message.toString())
        }
    }
}