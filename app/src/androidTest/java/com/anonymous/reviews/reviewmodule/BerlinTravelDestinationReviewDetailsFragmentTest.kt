package com.anonymous.reviews.reviewmodule

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.anonymous.reviews.BerlinTravelDestinationReviewDetails
import com.anonymous.reviews.R
import com.anonymous.reviews.reviewmodule.model.ReviewsViewModel
import com.anonymous.reviews.reviewmodule.repository.FakeRepositorySource
import org.hamcrest.Matchers.not
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BerlinTravelDestinationReviewDetailsFragmentTest {

    lateinit var bundle: Bundle
    lateinit var repository: FakeRepositorySource
    lateinit var viewModel: ReviewsViewModel

    @Before
    fun setUp()
    {
        repository = FakeRepositorySource()
        bundle = Bundle()
        bundle.putParcelable("selectedReview", repository.REVIEW_1)

        viewModel = ReviewsViewModel(repository)
    }

    @Test
    fun testReviewDetails_WhenReviewDetailsFragmentGetsLoaded_IsContainerAndViewVisible() {
        launchFragmentInContainer<BerlinTravelDestinationReviewDetails>(
            fragmentArgs = bundle
        )
        onView(withId(R.id.reviewDetailsFragmentContainer)).check(matches(isDisplayed()))
        onView(withId(R.id.reviewDetailsMessage)).check(matches(isDisplayed()))
    }


    @Test
    fun testReviewDetails_WhenReviewIsGivenAndSetProperlyOnView_isReviewDetailVisible() {
        // Assign

        // Act - Loads fragment in activity's view container
        launchFragmentInContainer<BerlinTravelDestinationReviewDetails>(
            fragmentArgs = bundle
        )

        // Assert
        // Check if the textview got an update with it's visibility check
        onView(withId(R.id.reviewDetailsMessage)).check(matches(isDisplayed()))
        onView(withId(R.id.reviewDetailsMessage)).check(matches(
            withText(
                repository.REVIEW_1.message
            )
        ))
    }

    @Test
    fun testReviewDetails_WhenGivenReviewDetailSetProperly_isTextMismatching() {
        launchFragmentInContainer<BerlinTravelDestinationReviewDetails>(
            fragmentArgs = bundle
        )
        onView(withId(R.id.reviewDetailsMessage)).check(matches(not(withText("testing"))))
    }

    @Test
    fun testReviewDetails_WhenGivenReviewDetailSetProperly_isTextMatching() {
        // Assign

        // Act - Loads fragment in activity's view container
        launchFragmentInContainer<BerlinTravelDestinationReviewDetails>(
            fragmentArgs = bundle
        )

        // Assert
        // Check if the textview got an update with it's visibility check
        onView(withId(R.id.reviewDetailsMessage)).check(matches(isDisplayed()))
        onView(withId(R.id.reviewDetailsMessage)).check(matches(
                ViewMatchers.withText(
                    "I love Berlin"
                )
        ))
    }
}