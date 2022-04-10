package com.anonymous.reviews.reviewmodule

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.anonymous.reviews.R
import com.anonymous.reviews.reviewmodule.factory.ReviewsMainFragmentFactory
import com.anonymous.reviews.reviewmodule.model.ReviewsViewModel
import com.anonymous.reviews.reviewmodule.repository.FakeRepositorySource
import org.hamcrest.Matchers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BerlinTravelDestinationReviewsFragmentTest
{
    private lateinit var repository: FakeRepositorySource
    private lateinit var viewModel : ReviewsViewModel

    private lateinit var factory: ReviewsMainFragmentFactory

    @Before
    fun setUp() {
        factory = ReviewsMainFragmentFactory()
        repository = FakeRepositorySource()
        viewModel = ReviewsViewModel(repository.getReference())
    }

    @Test
    fun testReviews_WhenReviewsGetLoaded_IsContainerVisible() {
        launchFragmentInContainer<BerlinTravelDestinationReviews>(
            factory = factory
        )

        onView(withId(R.id.reviewsRecyclerView)).check(matches(isDisplayed()))
        onView(
            Matchers.allOf(
                withId(R.id.reviewsContainerFragment),
                withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)
            )
        )
    }

    @Test
    fun testReviews_WhenReviewsGetLoaded_areViewsVisible() {
        // Assign

        // Act - Loads fragment in activity's view container
        launchFragmentInContainer<BerlinTravelDestinationReviews>(
            factory = factory
        )

        // Assert
        // Check if the textview got an update with it's visibility check
        onView(
            Matchers.allOf(
                withId(R.id.reviewDescription),
                withId(R.id.reviewDate),
                withId(R.id.reviewRating),
                withId(R.id.reviewedBy),
                withId(R.id.reviewedByImage),
                withId(R.id.reviewedFrom)
            , withEffectiveVisibility(Visibility.VISIBLE))
        )
    }
}
