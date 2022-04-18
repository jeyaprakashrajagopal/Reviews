package com.anonymous.reviews.reviewmodule.apiservice;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ReviewsApiServiceImplementation_Factory implements Factory<ReviewsApiServiceImplementation> {
  private final Provider<ReviewsApiService> apiServiceProvider;

  public ReviewsApiServiceImplementation_Factory(Provider<ReviewsApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ReviewsApiServiceImplementation get() {
    return newInstance(apiServiceProvider.get());
  }

  public static ReviewsApiServiceImplementation_Factory create(
      Provider<ReviewsApiService> apiServiceProvider) {
    return new ReviewsApiServiceImplementation_Factory(apiServiceProvider);
  }

  public static ReviewsApiServiceImplementation newInstance(ReviewsApiService apiService) {
    return new ReviewsApiServiceImplementation(apiService);
  }
}
