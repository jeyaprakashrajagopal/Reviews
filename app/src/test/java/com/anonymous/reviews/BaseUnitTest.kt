package com.anonymous.reviews

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Rule

open class BaseUnitTest {
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()


}