package com.anonymous.reviews.reviewmodule.model;

import com.anonymous.reviews.reviewmodule.util.RepositoryInterface;
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
public final class ReviewsViewModel_Factory implements Factory<ReviewsViewModel> {
  private final Provider<RepositoryInterface> reviewsRepositoryProvider;

  public ReviewsViewModel_Factory(Provider<RepositoryInterface> reviewsRepositoryProvider) {
    this.reviewsRepositoryProvider = reviewsRepositoryProvider;
  }

  @Override
  public ReviewsViewModel get() {
    return newInstance(reviewsRepositoryProvider.get());
  }

  public static ReviewsViewModel_Factory create(
      Provider<RepositoryInterface> reviewsRepositoryProvider) {
    return new ReviewsViewModel_Factory(reviewsRepositoryProvider);
  }

  public static ReviewsViewModel newInstance(RepositoryInterface reviewsRepository) {
    return new ReviewsViewModel(reviewsRepository);
  }
}
