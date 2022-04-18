package com.anonymous.reviews.reviewmodule.util;

import java.lang.System;

/**
 * Interface that makes testing easier
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/anonymous/reviews/reviewmodule/util/RepositoryInterface;", "", "getReviews", "Lcom/anonymous/reviews/reviewmodule/model/ReviewsData;", "queryMap", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RepositoryInterface {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReviews(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queryMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.anonymous.reviews.reviewmodule.model.ReviewsData> continuation);
}