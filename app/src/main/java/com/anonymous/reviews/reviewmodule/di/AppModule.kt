package com.anonymous.reviews.reviewmodule.di

import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideRetrofitModule() = Retrofit.Builder()
        .baseUrl(ReviewsApiService.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okhttp3.OkHttpClient())
        .build()

    @Provides
    @Singleton
    fun provideAPIService(retrofit: Retrofit) = retrofit.create(ReviewsApiService::class.java)
}