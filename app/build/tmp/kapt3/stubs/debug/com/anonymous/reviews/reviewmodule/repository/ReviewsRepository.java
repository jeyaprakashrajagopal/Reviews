package com.anonymous.reviews.reviewmodule.repository;

import java.lang.System;

/**
 * Repository class that communicates with the API interface
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/anonymous/reviews/reviewmodule/repository/ReviewsRepository;", "Lcom/anonymous/reviews/reviewmodule/util/RepositoryInterface;", "interfaceImpl", "Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewsApiServiceImplementation;", "(Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewsApiServiceImplementation;)V", "getInterfaceImpl", "()Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewsApiServiceImplementation;", "getReviews", "Lcom/anonymous/reviews/reviewmodule/model/ReviewsData;", "queryMap", "", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ReviewsRepository implements com.anonymous.reviews.reviewmodule.util.RepositoryInterface {
    @org.jetbrains.annotations.NotNull()
    private final com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation interfaceImpl = null;
    
    public ReviewsRepository(@org.jetbrains.annotations.NotNull()
    com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation interfaceImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation getInterfaceImpl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getReviews(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queryMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.anonymous.reviews.reviewmodule.model.ReviewsData> continuation) {
        return null;
    }
}