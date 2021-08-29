package com.anonymous.reviews.reviewmodule.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.view.View
import androidx.core.content.ContextCompat
import com.anonymous.reviews.R
/**
 * To keep the common utils as singleton in one place
 */
object MyUtils {

    /**
     * To toggle the visibility VISIBLE -> GONE & GONE -> VISIBLE depending on view's current state
     */
    fun ToggleVisibility(view: View, visibility: Boolean) {
        view.visibility = if (visibility) View.VISIBLE else View.GONE
    }

    /**
     * To combine two distinct layers(drawables) into a single layer
     */
    fun GetContextDrawableOfProfileImage(context: Context) : Drawable {

        val bottom = ContextCompat.getDrawable(context, R.color.blue_50)

        val top = ContextCompat.getDrawable(context, R.drawable.ic_launcher_circle_default_img_foreground)
        val layer = LayerDrawable(arrayOf(bottom, top))
        return layer
    }

}