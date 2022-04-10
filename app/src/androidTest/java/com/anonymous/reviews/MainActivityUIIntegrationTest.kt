package com.anonymous.reviews

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Lists of tests
 *
 * This class performs series of tests on the main activity
 */
@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class MainActivityUIIntegrationTest {
    // Launching the main activity before the test begins and destroys it after the test
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testMainActivity_WhenActivityLaunched_isReviewsFragmentVisible() {
        
        // Checking BerlinTravelDestinationReviewDetailsFragment's visibility
        onView(allOf(withId(R.id.reviewsFragmentContainer), withEffectiveVisibility(Visibility.VISIBLE)))

        // Check if list item container is visible
        onView(allOf(withId(R.id.reviewItemContainer), withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun testMainActivity_WhenActivityLaunched_areAllReviewItemDetailsVisible() {

        // Check if all the list item elements are Visible
        onView(allOf(withId(R.id.reviewDate), withId(R.id.reviewRating),
            withId(R.id.reviewRating), withId(R.id.reviewDescription),
            withId(R.id.reviewedByImage),
            withId(R.id.reviewDescription), withId(R.id.reviewedByImage),
            withId(R.id.reviewedBy), withId(R.id.reviewedFrom),
            withEffectiveVisibility(Visibility.VISIBLE)))
    }
}