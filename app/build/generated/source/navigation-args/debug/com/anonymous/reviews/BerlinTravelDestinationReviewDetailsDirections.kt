package com.anonymous.reviews

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class BerlinTravelDestinationReviewDetailsDirections private constructor() {
  public companion object {
    public fun ReviewDetailsFragmentToactionReviewsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.ReviewDetailsFragmentToactionReviewsFragment)
  }
}
