package com.anonymous.reviews.reviewmodule.apiservice

import com.anonymous.reviews.reviewmodule.model.ReviewsDataClass
import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * Retrofit interface for the GET request
 */
@JvmSuppressWildcards
interface ReviewsApiService {

    companion object {
        const val BASE_URL = "https://travelers-api.getyourguide.com"
    }

    @GET("activities/23776/reviews")
    suspend fun getReviews(@QueryMap queryMap: Map<String,Any>): ReviewsDataClass
}