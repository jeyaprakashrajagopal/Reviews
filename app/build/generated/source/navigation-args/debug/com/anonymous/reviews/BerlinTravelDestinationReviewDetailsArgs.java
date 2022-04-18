package com.anonymous.reviews;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.anonymous.reviews.model.Review;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class BerlinTravelDestinationReviewDetailsArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private BerlinTravelDestinationReviewDetailsArgs() {
  }

  private BerlinTravelDestinationReviewDetailsArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static BerlinTravelDestinationReviewDetailsArgs fromBundle(@NonNull Bundle bundle) {
    BerlinTravelDestinationReviewDetailsArgs __result = new BerlinTravelDestinationReviewDetailsArgs();
    bundle.setClassLoader(BerlinTravelDestinationReviewDetailsArgs.class.getClassLoader());
    if (bundle.containsKey("selectedReview")) {
      Review selectedReview;
      if (Parcelable.class.isAssignableFrom(Review.class) || Serializable.class.isAssignableFrom(Review.class)) {
        selectedReview = (Review) bundle.get("selectedReview");
      } else {
        throw new UnsupportedOperationException(Review.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (selectedReview == null) {
        throw new IllegalArgumentException("Argument \"selectedReview\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("selectedReview", selectedReview);
    } else {
      throw new IllegalArgumentException("Required argument \"selectedReview\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Review getSelectedReview() {
    return (Review) arguments.get("selectedReview");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    BerlinTravelDestinationReviewDetailsArgs that = (BerlinTravelDestinationReviewDetailsArgs) object;
    if (arguments.containsKey("selectedReview") != that.arguments.containsKey("selectedReview")) {
      return false;
    }
    if (getSelectedReview() != null ? !getSelectedReview().equals(that.getSelectedReview()) : that.getSelectedReview() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSelectedReview() != null ? getSelectedReview().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "BerlinTravelDestinationReviewDetailsArgs{"
        + "selectedReview=" + getSelectedReview()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(BerlinTravelDestinationReviewDetailsArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Review selectedReview) {
      if (selectedReview == null) {
        throw new IllegalArgumentException("Argument \"selectedReview\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedReview", selectedReview);
    }

    @NonNull
    public BerlinTravelDestinationReviewDetailsArgs build() {
      BerlinTravelDestinationReviewDetailsArgs result = new BerlinTravelDestinationReviewDetailsArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setSelectedReview(@NonNull Review selectedReview) {
      if (selectedReview == null) {
        throw new IllegalArgumentException("Argument \"selectedReview\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedReview", selectedReview);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Review getSelectedReview() {
      return (Review) arguments.get("selectedReview");
    }
  }
}
