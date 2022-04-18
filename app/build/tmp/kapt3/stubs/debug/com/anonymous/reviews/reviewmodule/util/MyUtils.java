package com.anonymous.reviews.reviewmodule.util;

import java.lang.System;

/**
 * To keep the common utils as singleton in one place
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/anonymous/reviews/reviewmodule/util/MyUtils;", "", "()V", "GetContextDrawableOfProfileImage", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "ToggleVisibility", "", "view", "Landroid/view/View;", "visibility", "", "app_debug"})
public final class MyUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.anonymous.reviews.reviewmodule.util.MyUtils INSTANCE = null;
    
    private MyUtils() {
        super();
    }
    
    /**
     * To toggle the visibility VISIBLE -> GONE & GONE -> VISIBLE depending on view's current state
     */
    public final void ToggleVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean visibility) {
    }
    
    /**
     * To combine two distinct layers(drawables) into a single layer
     */
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable GetContextDrawableOfProfileImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}