// Generated by view binder compiler. Do not edit!
package com.example.quickfix.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.quickfix.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView allCategoryImage;

  @NonNull
  public final RecyclerView categoryRecycler;

  @NonNull
  public final RecyclerView discountedRecycler;

  @NonNull
  public final RecyclerView recentlyItem;

  @NonNull
  public final SearchView searchBar;

  @NonNull
  public final RecyclerView searchRecycler;

  @NonNull
  public final ImageView setting;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView6;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView allCategoryImage, @NonNull RecyclerView categoryRecycler,
      @NonNull RecyclerView discountedRecycler, @NonNull RecyclerView recentlyItem,
      @NonNull SearchView searchBar, @NonNull RecyclerView searchRecycler,
      @NonNull ImageView setting, @NonNull TextView textView, @NonNull TextView textView3,
      @NonNull TextView textView4, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.allCategoryImage = allCategoryImage;
    this.categoryRecycler = categoryRecycler;
    this.discountedRecycler = discountedRecycler;
    this.recentlyItem = recentlyItem;
    this.searchBar = searchBar;
    this.searchRecycler = searchRecycler;
    this.setting = setting;
    this.textView = textView;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.allCategoryImage;
      TextView allCategoryImage = ViewBindings.findChildViewById(rootView, id);
      if (allCategoryImage == null) {
        break missingId;
      }

      id = R.id.categoryRecycler;
      RecyclerView categoryRecycler = ViewBindings.findChildViewById(rootView, id);
      if (categoryRecycler == null) {
        break missingId;
      }

      id = R.id.discountedRecycler;
      RecyclerView discountedRecycler = ViewBindings.findChildViewById(rootView, id);
      if (discountedRecycler == null) {
        break missingId;
      }

      id = R.id.recently_item;
      RecyclerView recentlyItem = ViewBindings.findChildViewById(rootView, id);
      if (recentlyItem == null) {
        break missingId;
      }

      id = R.id.search_bar;
      SearchView searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.searchRecycler;
      RecyclerView searchRecycler = ViewBindings.findChildViewById(rootView, id);
      if (searchRecycler == null) {
        break missingId;
      }

      id = R.id.setting;
      ImageView setting = ViewBindings.findChildViewById(rootView, id);
      if (setting == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, allCategoryImage,
          categoryRecycler, discountedRecycler, recentlyItem, searchBar, searchRecycler, setting,
          textView, textView3, textView4, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
