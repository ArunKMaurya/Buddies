// Generated by view binder compiler. Do not edit!
package com.shivam.new_buddy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.shivam.new_buddy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView and;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final ImageView blankHeart;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView likedBy;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView others;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final TextView username;

  private FragmentHomeBinding(@NonNull FrameLayout rootView, @NonNull TextView and,
      @NonNull ImageView backBtn, @NonNull ImageView blankHeart, @NonNull ImageView imageView,
      @NonNull TextView likedBy, @NonNull LinearLayout linearLayout,
      @NonNull LinearLayout linearLayout2, @NonNull TextView name, @NonNull TextView others,
      @NonNull RelativeLayout relativeLayout, @NonNull TextView username) {
    this.rootView = rootView;
    this.and = and;
    this.backBtn = backBtn;
    this.blankHeart = blankHeart;
    this.imageView = imageView;
    this.likedBy = likedBy;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.name = name;
    this.others = others;
    this.relativeLayout = relativeLayout;
    this.username = username;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.and;
      TextView and = ViewBindings.findChildViewById(rootView, id);
      if (and == null) {
        break missingId;
      }

      id = R.id.back_btn;
      ImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.blank_heart;
      ImageView blankHeart = ViewBindings.findChildViewById(rootView, id);
      if (blankHeart == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.liked_by;
      TextView likedBy = ViewBindings.findChildViewById(rootView, id);
      if (likedBy == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.others;
      TextView others = ViewBindings.findChildViewById(rootView, id);
      if (others == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      RelativeLayout relativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.username;
      TextView username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new FragmentHomeBinding((FrameLayout) rootView, and, backBtn, blankHeart, imageView,
          likedBy, linearLayout, linearLayout2, name, others, relativeLayout, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}