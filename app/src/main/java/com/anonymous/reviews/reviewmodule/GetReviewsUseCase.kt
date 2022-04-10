package com.anonymous.reviews.reviewmodule

import com.anonymous.reviews.reviewmodule.util.RepositoryInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetReviewsUseCase(val reviewsRepository: RepositoryInterface) {
    suspend fun getReviewDocs(queryMap: Map<String, Any>) = withContext(Dispatchers.IO)
    {
        reviewsRepository.getReviews(queryMap)
    }
}