package com.anonymous.reviews.databinding;
import com.anonymous.reviews.R;
import com.anonymous.reviews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReviewDetailsBindingImpl extends FragmentReviewDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.reviewDetailsFragmentContainer, 7);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReviewDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentReviewDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (android.widget.RatingBar) bindings[4]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.reviewDetailsCountry.setTag(null);
        this.reviewDetailsDate.setTag(null);
        this.reviewDetailsMessage.setTag(null);
        this.reviewDetailsName.setTag(null);
        this.reviewDetailsRating.setTag(null);
        this.reviewDetailsUserImage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.reviewDetailsItem == variableId) {
            setReviewDetailsItem((com.anonymous.reviews.model.Review) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReviewDetailsItem(@Nullable com.anonymous.reviews.model.Review ReviewDetailsItem) {
        this.mReviewDetailsItem = ReviewDetailsItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.reviewDetailsItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String reviewDetailsItemAuthorPhoto = null;
        java.lang.String reviewDetailsItemGetCreated = null;
        java.lang.String reviewDetailsItemAuthorFullName = null;
        com.anonymous.reviews.model.Review reviewDetailsItem = mReviewDetailsItem;
        java.lang.String reviewDetailsItemMessage = null;
        float reviewDetailsItemRating = 0f;
        java.lang.String reviewDetailsItemAuthorCountry = null;
        com.anonymous.reviews.model.Review.Author reviewDetailsItemAuthor = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (reviewDetailsItem != null) {
                    // read reviewDetailsItem.getCreated
                    reviewDetailsItemGetCreated = reviewDetailsItem.getGetCreated();
                    // read reviewDetailsItem.message
                    reviewDetailsItemMessage = reviewDetailsItem.getMessage();
                    // read reviewDetailsItem.rating
                    reviewDetailsItemRating = reviewDetailsItem.getRating();
                    // read reviewDetailsItem.Author
                    reviewDetailsItemAuthor = reviewDetailsItem.getAuthor();
                }


                if (reviewDetailsItemAuthor != null) {
                    // read reviewDetailsItem.Author.photo
                    reviewDetailsItemAuthorPhoto = reviewDetailsItemAuthor.getPhoto();
                    // read reviewDetailsItem.Author.fullName
                    reviewDetailsItemAuthorFullName = reviewDetailsItemAuthor.getFullName();
                    // read reviewDetailsItem.Author.country
                    reviewDetailsItemAuthorCountry = reviewDetailsItemAuthor.getCountry();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reviewDetailsCountry, reviewDetailsItemAuthorCountry);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reviewDetailsDate, reviewDetailsItemGetCreated);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reviewDetailsMessage, reviewDetailsItemMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reviewDetailsName, reviewDetailsItemAuthorFullName);
            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.reviewDetailsRating, reviewDetailsItemRating);
            com.anonymous.reviews.reviewmodule.adapter.ReviewsImageViewBindingAdapter.loadImage(this.reviewDetailsUserImage, reviewDetailsItemAuthorPhoto);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reviewDetailsItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}