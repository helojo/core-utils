package com.joy.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

public class ViewUtil {

    public static void showImageView(ImageView v, int imageResId) {
        if (v == null) {
            return;
        }
        if (imageResId > 0) {
            v.setImageResource(imageResId);
        } else {
            v.setImageDrawable(null);
        }
        if (v.getVisibility() != View.VISIBLE) {
            v.setVisibility(View.VISIBLE);
        }
    }

    public static void showImageView(ImageView v, Drawable drawable) {
        if (v == null) {
            return;
        }
        v.setImageDrawable(drawable);
        if (v.getVisibility() != View.VISIBLE) {
            v.setVisibility(View.VISIBLE);
        }
    }

    public static void hideImageView(ImageView v) {
        if (v == null) {
            return;
        }
        if (v.getVisibility() != View.INVISIBLE) {
            v.setVisibility(View.INVISIBLE);
        }
        v.setImageDrawable(null);
    }

    public static void goneImageView(ImageView v) {
        if (v == null) {
            return;
        }
        if (v.getVisibility() != View.GONE) {
            v.setVisibility(View.GONE);
        }
        v.setImageDrawable(null);
    }

    public static void showView(View... views) {
        if (CollectionUtil.isNotEmpty(views)) {
            for (View v : views) {
                if (v != null && v.getVisibility() != View.VISIBLE) {
                    v.setVisibility(View.VISIBLE);
                }
            }
        }
    }

    public static void hideView(View... views) {
        if (CollectionUtil.isNotEmpty(views)) {
            for (View v : views) {
                if (v != null && v.getVisibility() != View.INVISIBLE) {
                    v.setVisibility(View.INVISIBLE);
                }
            }
        }
    }

    public static void goneView(View... views) {
        if (CollectionUtil.isNotEmpty(views)) {
            for (View v : views) {
                if (v != null && v.getVisibility() != View.GONE) {
                    v.setVisibility(View.GONE);
                }
            }
        }
    }

    public static boolean isVisible(View view) {
        return view != null && view.getVisibility() == View.VISIBLE;
    }

    public static boolean isInvisible(View view) {
        return !isVisible(view);
    }

    public static boolean isGone(View view) {
        return view != null && view.getVisibility() == View.GONE;
    }
}
