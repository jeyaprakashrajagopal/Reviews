package com.anonymous.reviews.reviewmodule.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
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
public final class AppModule_ProvideRetrofitModuleFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideRetrofitModule();
  }

  public static AppModule_ProvideRetrofitModuleFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideRetrofitModule() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRetrofitModule());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideRetrofitModuleFactory INSTANCE = new AppModule_ProvideRetrofitModuleFactory();
  }
}
