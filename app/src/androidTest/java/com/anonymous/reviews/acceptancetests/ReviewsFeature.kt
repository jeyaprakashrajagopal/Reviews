package com.anonymous.reviews.acceptancetests

import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.anonymous.reviews.MainActivity
import com.anonymous.reviews.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.AllOf.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ReviewsFeature {

    @get:Rule
    val activityUnderTest = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCheckVisibility() {

        onView(allOf(withId(R.id.reviewsRecyclerView))).check(matches(isDisplayed()))
        /*onView(allOf(withId(R.id.reviewsRecyclerView))).perform(
            actionOnItemAtPosition<TravelDestinationReviewsAdapter.ReviewsViewHolder>(0, click())
        )
        onView(allOf(withId(R.id.reviewDetailsName))).check(matches(isDisplayed()))*/
    }

    @Test
    fun testLoadingBarVisibility() {
        onView(allOf(withId(R.id.progressGetReviewItems), withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun testLoadingBarHidden() {

        onView(allOf(withId(R.id.progressGetReviewItems), withEffectiveVisibility(Visibility.GONE)))
    }

    fun nthChildOf(parentMatcher: Matcher<View>, itemPosition: Int) : Matcher<View> {
        return object: TypeSafeMatcher<View> () {
            override fun describeTo(description: Description?) {
                description?.appendText("at position $itemPosition")
            }

            override fun matchesSafely(item: View?): Boolean {
                if(item?.parent !is ViewGroup) return false

                val parent = item.parent as ViewGroup

                return parentMatcher.matches(parent) &&
                    parent.childCount > itemPosition &&
                        parent.getChildAt(itemPosition) == item
            }

        }
    }
}