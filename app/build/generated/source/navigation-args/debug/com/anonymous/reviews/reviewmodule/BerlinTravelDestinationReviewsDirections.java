package com.anonymous.reviews.reviewmodule;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.anonymous.reviews.R;
import com.anonymous.reviews.model.Review;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class BerlinTravelDestinationReviewsDirections {
  private BerlinTravelDestinationReviewsDirections() {
  }

  @NonNull
  public static ActionReviewsFragmentToReviewDetailsFragment actionReviewsFragmentToReviewDetailsFragment(
      @NonNull Review selectedReview) {
    return new ActionReviewsFragmentToReviewDetailsFragment(selectedReview);
  }

  public static class ActionReviewsFragmentToReviewDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionReviewsFragmentToReviewDetailsFragment(@NonNull Review selectedReview) {
      if (selectedReview == null) {
        throw new IllegalArgumentException("Argument \"selectedReview\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedReview", selectedReview);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionReviewsFragmentToReviewDetailsFragment setSelectedReview(
        @NonNull Review selectedReview) {
      if (selectedReview == null) {
        throw new IllegalArgumentException("Argument \"selectedReview\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedReview", selectedReview);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("selectedReview")) {
        Review selectedReview = (Review) arguments.get("selectedReview");
        if (Parcelable.class.isAssignableFrom(Review.class) || selectedReview == null) {
          __result.putParcelable("selectedReview", Parcelable.class.cast(selectedReview));
        } else if (Serializable.class.isAssignableFrom(Review.class)) {
          __result.putSerializable("selectedReview", Serializable.class.cast(selectedReview));
        } else {
          throw new UnsupportedOperationException(Review.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.actionReviewsFragmentToReviewDetailsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Review getSelectedReview() {
      return (Review) arguments.get("selectedReview");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionReviewsFragmentToReviewDetailsFragment that = (ActionReviewsFragmentToReviewDetailsFragment) object;
      if (arguments.containsKey("selectedReview") != that.arguments.containsKey("selectedReview")) {
        return false;
      }
      if (getSelectedReview() != null ? !getSelectedReview().equals(that.getSelectedReview()) : that.getSelectedReview() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getSelectedReview() != null ? getSelectedReview().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionReviewsFragmentToReviewDetailsFragment(actionId=" + getActionId() + "){"
          + "selectedReview=" + getSelectedReview()
          + "}";
    }
  }
}
