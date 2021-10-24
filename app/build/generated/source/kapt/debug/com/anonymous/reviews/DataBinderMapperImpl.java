package com.anonymous.reviews;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.anonymous.reviews.databinding.FragmentBerlinTravelDestinationReviewsBindingImpl;
import com.anonymous.reviews.databinding.FragmentReviewDetailsBindingImpl;
import com.anonymous.reviews.databinding.LayoutReviewItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTBERLINTRAVELDESTINATIONREVIEWS = 1;

  private static final int LAYOUT_FRAGMENTREVIEWDETAILS = 2;

  private static final int LAYOUT_LAYOUTREVIEWITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.anonymous.reviews.R.layout.fragment_berlin_travel_destination_reviews, LAYOUT_FRAGMENTBERLINTRAVELDESTINATIONREVIEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.anonymous.reviews.R.layout.fragment_review_details, LAYOUT_FRAGMENTREVIEWDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.anonymous.reviews.R.layout.layout_review_item, LAYOUT_LAYOUTREVIEWITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTBERLINTRAVELDESTINATIONREVIEWS: {
          if ("layout/fragment_berlin_travel_destination_reviews_0".equals(tag)) {
            return new FragmentBerlinTravelDestinationReviewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_berlin_travel_destination_reviews is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREVIEWDETAILS: {
          if ("layout/fragment_review_details_0".equals(tag)) {
            return new FragmentReviewDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_review_details is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTREVIEWITEM: {
          if ("layout/layout_review_item_0".equals(tag)) {
            return new LayoutReviewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_review_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "reviewDetailsItem");
      sKeys.put(2, "reviewItem");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_berlin_travel_destination_reviews_0", com.anonymous.reviews.R.layout.fragment_berlin_travel_destination_reviews);
      sKeys.put("layout/fragment_review_details_0", com.anonymous.reviews.R.layout.fragment_review_details);
      sKeys.put("layout/layout_review_item_0", com.anonymous.reviews.R.layout.layout_review_item);
    }
  }
}
