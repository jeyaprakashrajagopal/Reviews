package com.anonymous.reviews.model

import android.os.Build
import android.os.Parcelable
import androidx.annotation.RequiresApi
import kotlinx.parcelize.Parcelize
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.util.*

/**
 * Review class
 */
@Parcelize
data class Review (
    val id : Int = 0,
    val author: Author = Author(),
    val title: String = "",
    val message: String = "",
    val enjoyment: String = "",
    val isAnonymous: Boolean = true,
    val rating : Float = 4.5F,
    val created : String = "2021-08-01T13:05:16+02:00",
    val optionId : String = "",
    val activityId : String = "",
    val language: String = "",
    val travelerType: String = ""
): Parcelable{
    @Parcelize
    data class Author (
        val fullName: String = "",
        val photo: String = "",
        val country: String = ""
    ): Parcelable

    val getCreated: String

        @RequiresApi(Build.VERSION_CODES.O)
        get() {
            val createdDate = OffsetDateTime.parse(created).toInstant().toEpochMilli()
            val format = SimpleDateFormat(
                "MMM dd, yyyy", Locale.ENGLISH
            )
            return format.format(Date(createdDate)).toString()
        }
}