package com.anonymous.reviews

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.anonymous.reviews.model.Review
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class BerlinTravelDestinationReviewDetailsArgs(
  public val selectedReview: Review
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Review::class.java)) {
      result.putParcelable("selectedReview", this.selectedReview as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Review::class.java)) {
      result.putSerializable("selectedReview", this.selectedReview as Serializable)
    } else {
      throw UnsupportedOperationException(Review::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): BerlinTravelDestinationReviewDetailsArgs {
      bundle.setClassLoader(BerlinTravelDestinationReviewDetailsArgs::class.java.classLoader)
      val __selectedReview : Review?
      if (bundle.containsKey("selectedReview")) {
        if (Parcelable::class.java.isAssignableFrom(Review::class.java) ||
            Serializable::class.java.isAssignableFrom(Review::class.java)) {
          __selectedReview = bundle.get("selectedReview") as Review?
        } else {
          throw UnsupportedOperationException(Review::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__selectedReview == null) {
          throw IllegalArgumentException("Argument \"selectedReview\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selectedReview\" is missing and does not have an android:defaultValue")
      }
      return BerlinTravelDestinationReviewDetailsArgs(__selectedReview)
    }
  }
}
