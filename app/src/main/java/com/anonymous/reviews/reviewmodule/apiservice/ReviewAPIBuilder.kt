package com.anonymous.reviews.reviewmodule.apiservice

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ReviewAPIBuilder {

    fun getRetrofit() = Retrofit.Builder()
        .baseUrl(ReviewsApiService.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val reviewsApiService = getRetrofit().create(ReviewsApiService::class.java)
}