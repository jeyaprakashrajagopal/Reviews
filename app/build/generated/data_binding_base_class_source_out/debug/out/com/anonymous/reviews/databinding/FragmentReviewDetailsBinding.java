// Generated by data binding compiler. Do not edit!
package com.anonymous.reviews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.anonymous.reviews.R;
import com.anonymous.reviews.model.Review;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentReviewDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView reviewDetailsCountry;

  @NonNull
  public final AppCompatTextView reviewDetailsDate;

  @NonNull
  public final ConstraintLayout reviewDetailsFragmentContainer;

  @NonNull
  public final AppCompatTextView reviewDetailsMessage;

  @NonNull
  public final AppCompatTextView reviewDetailsName;

  @NonNull
  public final RatingBar reviewDetailsRating;

  @NonNull
  public final ShapeableImageView reviewDetailsUserImage;

  @Bindable
  protected Review mReviewDetailsItem;

  protected FragmentReviewDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView reviewDetailsCountry, AppCompatTextView reviewDetailsDate,
      ConstraintLayout reviewDetailsFragmentContainer, AppCompatTextView reviewDetailsMessage,
      AppCompatTextView reviewDetailsName, RatingBar reviewDetailsRating,
      ShapeableImageView reviewDetailsUserImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.reviewDetailsCountry = reviewDetailsCountry;
    this.reviewDetailsDate = reviewDetailsDate;
    this.reviewDetailsFragmentContainer = reviewDetailsFragmentContainer;
    this.reviewDetailsMessage = reviewDetailsMessage;
    this.reviewDetailsName = reviewDetailsName;
    this.reviewDetailsRating = reviewDetailsRating;
    this.reviewDetailsUserImage = reviewDetailsUserImage;
  }

  public abstract void setReviewDetailsItem(@Nullable Review reviewDetailsItem);

  @Nullable
  public Review getReviewDetailsItem() {
    return mReviewDetailsItem;
  }

  @NonNull
  public static FragmentReviewDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_review_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentReviewDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentReviewDetailsBinding>inflateInternal(inflater, R.layout.fragment_review_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentReviewDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_review_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentReviewDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentReviewDetailsBinding>inflateInternal(inflater, R.layout.fragment_review_details, null, false, component);
  }

  public static FragmentReviewDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentReviewDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentReviewDetailsBinding)bind(component, view, R.layout.fragment_review_details);
  }
}
