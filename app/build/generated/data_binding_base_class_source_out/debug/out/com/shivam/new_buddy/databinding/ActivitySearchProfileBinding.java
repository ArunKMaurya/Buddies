// Generated by view binder compiler. Do not edit!
package com.shivam.new_buddy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.shivam.new_buddy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySearchProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton ibSearch;

  @NonNull
  public final RelativeLayout rlBack;

  @NonNull
  public final RelativeLayout rlLayout;

  @NonNull
  public final RelativeLayout searchBar;

  @NonNull
  public final RelativeLayout searchBox;

  private ActivitySearchProfileBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageButton ibSearch, @NonNull RelativeLayout rlBack,
      @NonNull RelativeLayout rlLayout, @NonNull RelativeLayout searchBar,
      @NonNull RelativeLayout searchBox) {
    this.rootView = rootView;
    this.ibSearch = ibSearch;
    this.rlBack = rlBack;
    this.rlLayout = rlLayout;
    this.searchBar = searchBar;
    this.searchBox = searchBox;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySearchProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySearchProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_search_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySearchProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ib_search;
      ImageButton ibSearch = ViewBindings.findChildViewById(rootView, id);
      if (ibSearch == null) {
        break missingId;
      }

      id = R.id.rl_back;
      RelativeLayout rlBack = ViewBindings.findChildViewById(rootView, id);
      if (rlBack == null) {
        break missingId;
      }

      id = R.id.rl_layout;
      RelativeLayout rlLayout = ViewBindings.findChildViewById(rootView, id);
      if (rlLayout == null) {
        break missingId;
      }

      id = R.id.search_bar;
      RelativeLayout searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.search_box;
      RelativeLayout searchBox = ViewBindings.findChildViewById(rootView, id);
      if (searchBox == null) {
        break missingId;
      }

      return new ActivitySearchProfileBinding((RelativeLayout) rootView, ibSearch, rlBack, rlLayout,
          searchBar, searchBox);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
