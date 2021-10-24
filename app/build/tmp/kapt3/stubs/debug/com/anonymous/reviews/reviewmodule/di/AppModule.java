package com.anonymous.reviews.reviewmodule.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/anonymous/reviews/reviewmodule/di/AppModule;", "", "()V", "provideAPIService", "Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewsApiService;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofitModule", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.anonymous.reviews.reviewmodule.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofitModule() {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiService provideAPIService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}