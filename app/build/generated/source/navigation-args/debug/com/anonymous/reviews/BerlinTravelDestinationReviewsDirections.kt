package com.anonymous.reviews

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.anonymous.reviews.model.Review
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class BerlinTravelDestinationReviewsDirections private constructor() {
  private data class ActionReviewsFragmentToReviewDetailsFragment(
    public val selectedReview: Review
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.actionReviewsFragmentToReviewDetailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionReviewsFragmentToReviewDetailsFragment(selectedReview: Review): NavDirections =
        ActionReviewsFragmentToReviewDetailsFragment(selectedReview)
  }
}
