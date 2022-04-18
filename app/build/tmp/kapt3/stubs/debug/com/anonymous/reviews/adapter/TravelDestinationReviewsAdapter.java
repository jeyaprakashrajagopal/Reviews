package com.anonymous.reviews.adapter;

import java.lang.System;

/**
 * List view adapter with all the reviews retrieved from the URL
 * ListAdapter is used to take advantage of the diffutil feature
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0014\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013\u00a8\u0006\u0017"}, d2 = {"Lcom/anonymous/reviews/adapter/TravelDestinationReviewsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/anonymous/reviews/model/Review;", "Lcom/anonymous/reviews/adapter/TravelDestinationReviewsAdapter$ReviewsViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAnimation", "view", "Landroid/view/View;", "setReviewInterface", "reviewInterfaceIn", "Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewInterface;", "Companion", "DiffCallback", "ReviewsViewHolder", "app_debug"})
public final class TravelDestinationReviewsAdapter extends androidx.recyclerview.widget.ListAdapter<com.anonymous.reviews.model.Review, com.anonymous.reviews.adapter.TravelDestinationReviewsAdapter.ReviewsViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final com.anonymous.reviews.adapter.TravelDestinationReviewsAdapter.Companion Companion = null;
    public static com.anonymous.reviews.reviewmodule.apiservice.ReviewInterface reviewInterface;
    
    public TravelDestinationReviewsAdapter() {
        super(null);
    }
    
    /**
     * Basically creating the interface
     */
    public final void setReviewInterface(@org.jetbrains.annotations.NotNull()
    com.anonymous.reviews.reviewmodule.apiservice.ReviewInterface reviewInterfaceIn) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.anonymous.reviews.adapter.TravelDestinationReviewsAdapter.ReviewsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.anonymous.reviews.adapter.TravelDestinationReviewsAdapter.ReviewsViewHolder holder, int position) {
    }
    
    /**
     * Sets basic animation where recycler view items appear slowly in the span of 1 second
     */
    private final void setAnimation(android.view.View view) {
    }
    
    /**
     * View holder that holds the view of each list item with the following
     * Basic etc.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/anonymous/reviews/adapter/TravelDestinationReviewsAdapter$ReviewsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "binding", "Lcom/anonymous/reviews/databinding/LayoutReviewItemBinding;", "(Landroid/content/Context;Lcom/anonymous/reviews/databinding/LayoutReviewItemBinding;)V", "getBinding", "()Lcom/anonymous/reviews/databinding/LayoutReviewItemBinding;", "getContext", "()Landroid/content/Context;", "bindData", "", "position", "", "review", "Lcom/anonymous/reviews/model/Review;", "app_debug"})
    public static final class ReviewsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final com.anonymous.reviews.databinding.LayoutReviewItemBinding binding = null;
        
        public ReviewsViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.anonymous.reviews.databinding.LayoutReviewItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.anonymous.reviews.databinding.LayoutReviewItemBinding getBinding() {
            return null;
        }
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
        public final void bindData(int position, @org.jetbrains.annotations.NotNull()
        com.anonymous.reviews.model.Review review) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/anonymous/reviews/adapter/TravelDestinationReviewsAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/anonymous/reviews/model/Review;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.anonymous.reviews.model.Review> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.anonymous.reviews.model.Review oldItem, @org.jetbrains.annotations.NotNull()
        com.anonymous.reviews.model.Review newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.anonymous.reviews.model.Review oldItem, @org.jetbrains.annotations.NotNull()
        com.anonymous.reviews.model.Review newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/anonymous/reviews/adapter/TravelDestinationReviewsAdapter$Companion;", "", "()V", "reviewInterface", "Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewInterface;", "getReviewInterface", "()Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewInterface;", "setReviewInterface", "(Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewInterface;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.anonymous.reviews.reviewmodule.apiservice.ReviewInterface getReviewInterface() {
            return null;
        }
        
        public final void setReviewInterface(@org.jetbrains.annotations.NotNull()
        com.anonymous.reviews.reviewmodule.apiservice.ReviewInterface p0) {
        }
    }
}