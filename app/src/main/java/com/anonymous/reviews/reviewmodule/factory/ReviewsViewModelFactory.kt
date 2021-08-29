package com.anonymous.reviews.reviewmodule.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anonymous.reviews.model.ReviewsViewModel
import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation
import com.anonymous.reviews.reviewmodule.repository.ReviewsRepository

/**
 * It is needed to send parameters to the viewModel
 */
class ReviewsViewModelFactory constructor(
              val reviewsAPIServiceImplementation: ReviewsApiServiceImplementation)
        : ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ReviewsViewModel::class.java)) {
            return ReviewsViewModel(ReviewsRepository(reviewsAPIServiceImplementation)) as T
        }

        throw IllegalArgumentException("Call name is unknown")
    }
}