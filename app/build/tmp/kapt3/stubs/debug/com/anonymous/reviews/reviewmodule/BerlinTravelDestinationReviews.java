package com.anonymous.reviews.reviewmodule;

import java.lang.System;

/**
 * This fragment displays all the reviews collected from the remote source
 * based on pagination
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0003J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\b\u0010$\u001a\u00020\u0017H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/anonymous/reviews/reviewmodule/BerlinTravelDestinationReviews;", "Landroidx/fragment/app/Fragment;", "Lcom/anonymous/reviews/reviewmodule/apiservice/ReviewInterface;", "()V", "bindingBerlinDestinationReviews", "Lcom/anonymous/reviews/databinding/FragmentBerlinTravelDestinationReviewsBinding;", "factory", "Lcom/anonymous/reviews/reviewmodule/factory/ReviewsViewModelFactory;", "getFactory", "()Lcom/anonymous/reviews/reviewmodule/factory/ReviewsViewModelFactory;", "setFactory", "(Lcom/anonymous/reviews/reviewmodule/factory/ReviewsViewModelFactory;)V", "isLoading", "", "reviewsViewModel", "Lcom/anonymous/reviews/reviewmodule/model/ReviewsViewModel;", "getReviewsViewModel", "()Lcom/anonymous/reviews/reviewmodule/model/ReviewsViewModel;", "reviewsViewModel$delegate", "Lkotlin/Lazy;", "travelDestinationReviewsAdapter", "Lcom/anonymous/reviews/adapter/TravelDestinationReviewsAdapter;", "createRecyclerView", "", "fetchReviewsData", "hideProgressBar", "initialize", "initializeNestedSV", "onReviewSelection", "position", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "renderList", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class BerlinTravelDestinationReviews extends androidx.fragment.app.Fragment implements com.anonymous.reviews.reviewmodule.apiservice.ReviewInterface {
    @javax.inject.Inject()
    public com.anonymous.reviews.reviewmodule.factory.ReviewsViewModelFactory factory;
    private final kotlin.Lazy reviewsViewModel$delegate = null;
    private boolean isLoading = false;
    private com.anonymous.reviews.databinding.FragmentBerlinTravelDestinationReviewsBinding bindingBerlinDestinationReviews;
    private com.anonymous.reviews.adapter.TravelDestinationReviewsAdapter travelDestinationReviewsAdapter;
    
    public BerlinTravelDestinationReviews() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.anonymous.reviews.reviewmodule.factory.ReviewsViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.anonymous.reviews.reviewmodule.factory.ReviewsViewModelFactory p0) {
    }
    
    private final com.anonymous.reviews.reviewmodule.model.ReviewsViewModel getReviewsViewModel() {
        return null;
    }
    
    /**
     * When view gets created bind the view and initialize the view and model components
     * We don't have to inflate the view as it's already done
     *
     * @return -
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void initializeNestedSV() {
    }
    
    /**
     * Fetches Review data and handle live data results from remote source
     *
     * @param -
     * @return -
     */
    private final void fetchReviewsData() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void renderList() {
    }
    
    /**
     * Creates recycler view adapter and sets the recycler view
     * Setting an interface context for list item clicks
     *
     * @param -
     * @return -
     */
    private final void createRecyclerView() {
    }
    
    /**
     * Initializes the view model and sets up intent listener for different intents defined
     * (only one intent is used in this app)
     * @param -
     * @return -
     */
    private final void initialize() {
    }
    
    private final void hideProgressBar() {
    }
    
    /**
     * Getting item position from the adapter and navigate to display the review item details
     *
     * @param position
     * @return -
     */
    @java.lang.Override()
    public void onReviewSelection(int position) {
    }
}