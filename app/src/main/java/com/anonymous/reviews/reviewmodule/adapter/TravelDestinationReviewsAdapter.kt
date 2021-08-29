package com.anonymous.reviews.adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anonymous.reviews.databinding.LayoutReviewItemBinding
import com.anonymous.reviews.model.Review
import com.anonymous.reviews.reviewmodule.apiservice.ReviewInterface
import com.anonymous.reviews.reviewmodule.util.constants
import com.anonymous.reviews.reviewmodule.util.constants.FROM_TRANS
import com.anonymous.reviews.reviewmodule.util.constants.TO_OPAQUE

/**
 * List view adapter with all the reviews retrieved from the URL
 * ListAdapter is used to take advantage of the diffutil feature
 */
class TravelDestinationReviewsAdapter : ListAdapter<Review, TravelDestinationReviewsAdapter.ReviewsViewHolder>(DiffCallback()){
    companion object {
        // interface object to communicate with the fragment
        lateinit var reviewInterface: ReviewInterface

    }
    /**
     * View holder that holds the view of each list item with the following
     * Basic etc.
     */
    class ReviewsViewHolder (val context: Context, val binding: LayoutReviewItemBinding)
        : RecyclerView.ViewHolder(binding.root) {

        @RequiresApi(Build.VERSION_CODES.M)
        fun bindData(position: Int, review: Review) {
            // Setting the model data to the view
            binding.reviewItem = review
            // Event listener to actually notify the event that the item is clicked
            binding.reviewItemContainer.setOnClickListener {
                reviewInterface.onReviewSelection(position)
            }
        }
    }

    /**
     * Basically creating the interface
     */
    fun setReviewInterface(reviewInterfaceIn: ReviewInterface) {
        reviewInterface = reviewInterfaceIn
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewsViewHolder {
        // Returns the viewholder object
        return ReviewsViewHolder(parent.context, LayoutReviewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: ReviewsViewHolder, position: Int) {
        holder.bindData(position, getItem(position))
        setAnimation(holder.itemView)
    }

    /**
     * Sets basic animation where recycler view items appear slowly in the span of 1 second
     */
    private fun setAnimation(view: View) {
        val animation = AlphaAnimation(FROM_TRANS, TO_OPAQUE)
        animation.duration = constants.DURATION
        view.startAnimation(animation)
    }

    class DiffCallback : DiffUtil.ItemCallback<Review>() {
        override fun areItemsTheSame(oldItem: Review, newItem: Review): Boolean = oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Review, newItem: Review): Boolean = oldItem == newItem

    }
}