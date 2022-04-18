package com.anonymous.reviews;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class BerlinTravelDestinationReviewDetailsDirections {
  private BerlinTravelDestinationReviewDetailsDirections() {
  }

  @NonNull
  public static NavDirections ReviewDetailsFragmentToactionReviewsFragment() {
    return new ActionOnlyNavDirections(R.id.ReviewDetailsFragmentToactionReviewsFragment);
  }
}
