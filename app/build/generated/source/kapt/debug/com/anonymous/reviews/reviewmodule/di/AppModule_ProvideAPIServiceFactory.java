package com.anonymous.reviews.reviewmodule.di;

import com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAPIServiceFactory implements Factory<ReviewsApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideAPIServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ReviewsApiService get() {
    return provideAPIService(retrofitProvider.get());
  }

  public static AppModule_ProvideAPIServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideAPIServiceFactory(retrofitProvider);
  }

  public static ReviewsApiService provideAPIService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAPIService(retrofit));
  }
}
