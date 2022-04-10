package com.anonymous.reviews.reviewmodule.model;

import java.lang.System;

/**
 * View model of the architecture that handles the operations
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/anonymous/reviews/reviewmodule/model/ReviewsViewModel;", "Landroidx/lifecycle/ViewModel;", "reviewsRepository", "Lcom/anonymous/reviews/reviewmodule/util/RepositoryInterface;", "(Lcom/anonymous/reviews/reviewmodule/util/RepositoryInterface;)V", "_reviewsData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/anonymous/reviews/model/Review;", "_reviewsError", "", "kotlin.jvm.PlatformType", "hasLastPageReached", "", "getHasLastPageReached", "()Z", "setHasLastPageReached", "(Z)V", "reviewsData", "Landroidx/lifecycle/LiveData;", "getReviewsData", "()Landroidx/lifecycle/LiveData;", "reviewsError", "getReviewsError", "reviewsUseCase", "Lcom/anonymous/reviews/reviewmodule/GetReviewsUseCase;", "getReviewDocs", "", "queryMap", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ReviewsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.anonymous.reviews.model.Review>> _reviewsData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.anonymous.reviews.model.Review>> reviewsData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _reviewsError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> reviewsError = null;
    private boolean hasLastPageReached = false;
    private final com.anonymous.reviews.reviewmodule.GetReviewsUseCase reviewsUseCase = null;
    
    @javax.inject.Inject()
    public ReviewsViewModel(@org.jetbrains.annotations.NotNull()
    com.anonymous.reviews.reviewmodule.util.RepositoryInterface reviewsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.anonymous.reviews.model.Review>> getReviewsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getReviewsError() {
        return null;
    }
    
    public final boolean getHasLastPageReached() {
        return false;
    }
    
    public final void setHasLastPageReached(boolean p0) {
    }
    
    /**
     * Make REST API request and wait for the response
     * Updates state to loading then Success/Error once available
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getReviewDocs(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queryMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}