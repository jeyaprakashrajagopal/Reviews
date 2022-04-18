package com.anonymous.reviews.reviewmodule.factory;

import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation;
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
public final class ReviewsViewModelFactory_Factory implements Factory<ReviewsViewModelFactory> {
  private final Provider<ReviewsApiServiceImplementation> reviewsAPIServiceImplementationProvider;

  public ReviewsViewModelFactory_Factory(
      Provider<ReviewsApiServiceImplementation> reviewsAPIServiceImplementationProvider) {
    this.reviewsAPIServiceImplementationProvider = reviewsAPIServiceImplementationProvider;
  }

  @Override
  public ReviewsViewModelFactory get() {
    return newInstance(reviewsAPIServiceImplementationProvider.get());
  }

  public static ReviewsViewModelFactory_Factory create(
      Provider<ReviewsApiServiceImplementation> reviewsAPIServiceImplementationProvider) {
    return new ReviewsViewModelFactory_Factory(reviewsAPIServiceImplementationProvider);
  }

  public static ReviewsViewModelFactory newInstance(
      ReviewsApiServiceImplementation reviewsAPIServiceImplementation) {
    return new ReviewsViewModelFactory(reviewsAPIServiceImplementation);
  }
}
