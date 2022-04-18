package com.anonymous.reviews.reviewmodule;

import com.anonymous.reviews.reviewmodule.factory.ReviewsViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class BerlinTravelDestinationReviews_MembersInjector implements MembersInjector<BerlinTravelDestinationReviews> {
  private final Provider<ReviewsViewModelFactory> factoryProvider;

  public BerlinTravelDestinationReviews_MembersInjector(
      Provider<ReviewsViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<BerlinTravelDestinationReviews> create(
      Provider<ReviewsViewModelFactory> factoryProvider) {
    return new BerlinTravelDestinationReviews_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(BerlinTravelDestinationReviews instance) {
    injectFactory(instance, factoryProvider.get());
  }

  @InjectedFieldSignature("com.anonymous.reviews.reviewmodule.BerlinTravelDestinationReviews.factory")
  public static void injectFactory(BerlinTravelDestinationReviews instance,
      ReviewsViewModelFactory factory) {
    instance.factory = factory;
  }
}
