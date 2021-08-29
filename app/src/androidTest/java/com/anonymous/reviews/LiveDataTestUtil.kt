package com.anonymous.reviews

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import kotlinx.coroutines.*
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException

fun<T> LiveData<T>.getOrAwaitValue (): T {

    var data : T? = null

    val latch = CountDownLatch(1)

    val observer = object : Observer<T> {
        override fun onChanged(t: T) {
            data = t
            println("t = [${t}]")
            this@getOrAwaitValue.removeObserver(this)
            latch.countDown()
        }
    }
    GlobalScope.launch(Dispatchers.Main) {
        observeForever(observer)
    }

    try {
        if (!latch.await(2, TimeUnit.SECONDS)) {
            throw TimeoutException("Live data doesn't get value")
        }
    } finally {
        GlobalScope.launch(Dispatchers.Main) {
            removeObserver(observer)
        }
    }

    return data as T
}