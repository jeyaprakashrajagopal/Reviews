package com.anonymous.reviews.reviewmodule.repository;

import java.lang.System;

/**
 * Created this class to mock the repository
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0001J%\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/anonymous/reviews/reviewmodule/repository/FakeRepositorySource;", "Lcom/anonymous/reviews/reviewmodule/util/RepositoryInterface;", "()V", "REVIEW_1", "Lcom/anonymous/reviews/model/Review;", "getREVIEW_1", "()Lcom/anonymous/reviews/model/Review;", "REVIEW_2", "getREVIEW_2", "mockInput", "", "", "", "getMockInput", "()Ljava/util/Map;", "getReference", "getReviews", "Lcom/anonymous/reviews/reviewmodule/model/ReviewsData$Success;", "queryMap", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FakeRepositorySource implements com.anonymous.reviews.reviewmodule.util.RepositoryInterface {
    @org.jetbrains.annotations.NotNull()
    public static final com.anonymous.reviews.reviewmodule.repository.FakeRepositorySource INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.anonymous.reviews.model.Review REVIEW_1 = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.anonymous.reviews.model.Review REVIEW_2 = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, java.lang.Object> mockInput = null;
    
    private FakeRepositorySource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getReviews(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queryMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.anonymous.reviews.reviewmodule.model.ReviewsData.Success> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.anonymous.reviews.reviewmodule.util.RepositoryInterface getReference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.anonymous.reviews.model.Review getREVIEW_1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.anonymous.reviews.model.Review getREVIEW_2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getMockInput() {
        return null;
    }
}