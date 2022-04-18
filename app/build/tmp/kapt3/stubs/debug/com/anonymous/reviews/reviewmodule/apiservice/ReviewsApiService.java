package com.anonymous.reviews.reviewmodule.apiservice;

import java.lang.System;

/**
 * Retrofit interface for the GET request
 */
@kotlin.jvm.JvmSuppressWildcards()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\'\u0010\u0002\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewsApiService;", "", "getReviews", "Lcom/anonymous/reviews/reviewmodule/model/ReviewsDataClass;", "queryMap", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ReviewsApiService {
    @org.jetbrains.annotations.NotNull()
    public static final com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://travelers-api.getyourguide.com";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "activities/23776/reviews")
    public abstract java.lang.Object getReviews(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.Object> queryMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<com.anonymous.reviews.reviewmodule.model.ReviewsDataClass> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewsApiService$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://travelers-api.getyourguide.com";
        
        private Companion() {
            super();
        }
    }
}