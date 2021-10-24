package com.anonymous.reviews.databinding;
import com.anonymous.reviews.R;
import com.anonymous.reviews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutReviewItemBindingImpl extends LayoutReviewItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.reviewItemCL, 6);
        sViewsWithIds.put(R.id.reviewedBy, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutReviewItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private LayoutReviewItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RatingBar) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.reviewDate.setTag(null);
        this.reviewDescription.setTag(null);
        this.reviewItemContainer.setTag(null);
        this.reviewRating.setTag(null);
        this.reviewedByImage.setTag(null);
        this.reviewedFrom.setTag(null);
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
        if (BR.reviewItem == variableId) {
            setReviewItem((com.anonymous.reviews.model.Review) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReviewItem(@Nullable com.anonymous.reviews.model.Review ReviewItem) {
        this.mReviewItem = ReviewItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.reviewItem);
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
        java.lang.String reviewItemMessage = null;
        java.lang.String reviewItemAuthorPhoto = null;
        java.lang.String reviewItemAuthorFullName = null;
        java.lang.String reviewItemAuthorFullNameJavaLangStringReviewItemAuthorCountry = null;
        java.lang.String reviewItemAuthorCountry = null;
        float reviewItemRating = 0f;
        java.lang.String reviewItemAuthorFullNameJavaLangString = null;
        com.anonymous.reviews.model.Review.Author reviewItemAuthor = null;
        java.lang.String reviewItemGetCreated = null;
        com.anonymous.reviews.model.Review reviewItem = mReviewItem;

        if ((dirtyFlags & 0x3L) != 0) {



                if (reviewItem != null) {
                    // read reviewItem.message
                    reviewItemMessage = reviewItem.getMessage();
                    // read reviewItem.rating
                    reviewItemRating = reviewItem.getRating();
                    // read reviewItem.Author
                    reviewItemAuthor = reviewItem.getAuthor();
                    // read reviewItem.getCreated
                    reviewItemGetCreated = reviewItem.getGetCreated();
                }


                if (reviewItemAuthor != null) {
                    // read reviewItem.Author.photo
                    reviewItemAuthorPhoto = reviewItemAuthor.getPhoto();
                    // read reviewItem.Author.fullName
                    reviewItemAuthorFullName = reviewItemAuthor.getFullName();
                    // read reviewItem.Author.country
                    reviewItemAuthorCountry = reviewItemAuthor.getCountry();
                }


                // read (reviewItem.Author.fullName) + ("-")
                reviewItemAuthorFullNameJavaLangString = (reviewItemAuthorFullName) + ("-");


                // read ((reviewItem.Author.fullName) + ("-")) + (reviewItem.Author.country)
                reviewItemAuthorFullNameJavaLangStringReviewItemAuthorCountry = (reviewItemAuthorFullNameJavaLangString) + (reviewItemAuthorCountry);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reviewDate, reviewItemGetCreated);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reviewDescription, reviewItemMessage);
            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.reviewRating, reviewItemRating);
            com.anonymous.reviews.reviewmodule.adapter.ReviewsImageViewBindingAdapter.loadImage(this.reviewedByImage, reviewItemAuthorPhoto);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reviewedFrom, reviewItemAuthorFullNameJavaLangStringReviewItemAuthorCountry);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reviewItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}