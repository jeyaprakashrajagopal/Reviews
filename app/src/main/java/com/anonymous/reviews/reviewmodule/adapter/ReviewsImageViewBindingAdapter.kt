package com.anonymous.reviews.reviewmodule.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.anonymous.reviews.reviewmodule.util.MyUtils
import com.bumptech.glide.Glide

/**
 * BindingAdapter to set the imageview with the given url string
 */
class ReviewsImageViewBindingAdapter {

    companion object {
        @BindingAdapter("holderItemImage")
        @JvmStatic
        fun loadImage(imageView: ImageView, src: String) {
            Glide.with(imageView.context).load(src).placeholder(
                MyUtils.GetContextDrawableOfProfileImage(
                    imageView.context
                )
            ).into(imageView)
        }
    }

}