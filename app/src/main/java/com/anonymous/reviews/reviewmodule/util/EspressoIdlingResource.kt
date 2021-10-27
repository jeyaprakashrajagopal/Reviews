package com.anonymous.reviews.reviewmodule.util

import androidx.test.espresso.idling.CountingIdlingResource

object EspressoIdlingResource {
    val TAG = "GLOBAL"
    @JvmField var idlingCount = CountingIdlingResource(TAG)

    fun increment() {
        idlingCount.increment()
    }
    fun decrement() {
        if(!idlingCount.isIdleNow) {
            idlingCount.decrement()
        }
    }
}