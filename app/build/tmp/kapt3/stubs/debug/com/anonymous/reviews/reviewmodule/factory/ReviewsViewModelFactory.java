package com.anonymous.reviews.reviewmodule.factory;

import java.lang.System;

/**
 * It is needed to send parameters to the viewModel
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/anonymous/reviews/reviewmodule/factory/ReviewsViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "reviewsAPIServiceImplementation", "Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewsApiServiceImplementation;", "(Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewsApiServiceImplementation;)V", "getReviewsAPIServiceImplementation", "()Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewsApiServiceImplementation;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class ReviewsViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation reviewsAPIServiceImplementation = null;
    
    @javax.inject.Inject()
    public ReviewsViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation reviewsAPIServiceImplementation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.anonymous.reviews.reviewmodule.apiservice.ReviewsApiServiceImplementation getReviewsAPIServiceImplementation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}