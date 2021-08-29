package com.anonymous.reviews.reviewmodule.factory

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.anonymous.reviews.BerlinTravelDestinationReviews

/**
 * It is needed to send parameters to the fragments via factory class
 */
class ReviewsMainFragmentFactory: FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className) {
            BerlinTravelDestinationReviews::class.java.name -> {
                BerlinTravelDestinationReviews()
            }
            else -> super.instantiate(classLoader, className)
        }
    }
}