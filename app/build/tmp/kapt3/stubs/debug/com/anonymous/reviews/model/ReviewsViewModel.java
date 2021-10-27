package com.anonymous.reviews.model;

import java.lang.System;

/**
 * View model of the architecture that handles the operations
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a0\u001cR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001e"}, d2 = {"Lcom/anonymous/reviews/model/ReviewsViewModel;", "Landroidx/lifecycle/ViewModel;", "reviewsRepository", "Lcom/anonymous/reviews/reviewmodule/util/RepositoryInterface;", "(Lcom/anonymous/reviews/reviewmodule/util/RepositoryInterface;)V", "hasLastPageReached", "", "getHasLastPageReached", "()Z", "setHasLastPageReached", "(Z)V", "loader", "Landroidx/lifecycle/MutableLiveData;", "getLoader", "()Landroidx/lifecycle/MutableLiveData;", "reviewsData", "", "Lcom/anonymous/reviews/model/Review;", "getReviewsData", "()Ljava/util/List;", "setReviewsData", "(Ljava/util/List;)V", "getReviewsRepository", "()Lcom/anonymous/reviews/reviewmodule/util/RepositoryInterface;", "getReviewDocs", "Landroidx/lifecycle/LiveData;", "", "queryMap", "", "", "app_debug"})
public final class ReviewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.anonymous.reviews.reviewmodule.util.RepositoryInterface reviewsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.anonymous.reviews.model.Review> reviewsData;
    private boolean hasLastPageReached = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loader = null;
    
    @javax.inject.Inject()
    public ReviewsViewModel(@org.jetbrains.annotations.NotNull()
    com.anonymous.reviews.reviewmodule.util.RepositoryInterface reviewsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.anonymous.reviews.reviewmodule.util.RepositoryInterface getReviewsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.anonymous.reviews.model.Review> getReviewsData() {
        return null;
    }
    
    public final void setReviewsData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.anonymous.reviews.model.Review> p0) {
    }
    
    public final boolean getHasLastPageReached() {
        return false;
    }
    
    public final void setHasLastPageReached(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoader() {
        return null;
    }
    
    /**
     * Make REST API request and wait for the response
     * Updates state to loading then Success/Error once available
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Object> getReviewDocs(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> queryMap) {
        return null;
    }
}