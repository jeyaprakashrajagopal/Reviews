package com.anonymous.reviews.reviewmodule.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation
import com.anonymous.reviews.reviewmodule.model.ReviewsViewModel
import com.anonymous.reviews.reviewmodule.repository.ReviewsRepository
import javax.inject.Inject

/**
 * It is needed to send parameters to the viewModel
 */
class ReviewsViewModelFactory @Inject constructor(
    private val reviewsAPIServiceImplementation: ReviewsApiServiceImplementation)
        : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ReviewsViewModel::class.java)) {

            return ReviewsViewModel(ReviewsRepository(reviewsAPIServiceImplementation)) as T
        }

        throw IllegalArgumentException("Call name is unknown")
    }
}