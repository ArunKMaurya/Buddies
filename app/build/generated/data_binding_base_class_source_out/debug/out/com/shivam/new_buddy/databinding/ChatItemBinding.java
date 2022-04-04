// Generated by view binder compiler. Do not edit!
package com.shivam.new_buddy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import com.shivam.new_buddy.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChatItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RoundedImageView myImgView;

  @NonNull
  public final LinearLayout myMsgSection;

  @NonNull
  public final TextView myTextMsg;

  @NonNull
  public final RoundedImageView partnerImgView;

  @NonNull
  public final LinearLayout partnerMsgSection;

  @NonNull
  public final CircleImageView partnerProfileImg;

  @NonNull
  public final TextView partnerTextMsg;

  @NonNull
  public final TextView seen;

  private ChatItemBinding(@NonNull RelativeLayout rootView, @NonNull RoundedImageView myImgView,
      @NonNull LinearLayout myMsgSection, @NonNull TextView myTextMsg,
      @NonNull RoundedImageView partnerImgView, @NonNull LinearLayout partnerMsgSection,
      @NonNull CircleImageView partnerProfileImg, @NonNull TextView partnerTextMsg,
      @NonNull TextView seen) {
    this.rootView = rootView;
    this.myImgView = myImgView;
    this.myMsgSection = myMsgSection;
    this.myTextMsg = myTextMsg;
    this.partnerImgView = partnerImgView;
    this.partnerMsgSection = partnerMsgSection;
    this.partnerProfileImg = partnerProfileImg;
    this.partnerTextMsg = partnerTextMsg;
    this.seen = seen;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChatItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChatItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.chat_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChatItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.my_imgView;
      RoundedImageView myImgView = ViewBindings.findChildViewById(rootView, id);
      if (myImgView == null) {
        break missingId;
      }

      id = R.id.my_msg_section;
      LinearLayout myMsgSection = ViewBindings.findChildViewById(rootView, id);
      if (myMsgSection == null) {
        break missingId;
      }

      id = R.id.my_text_msg;
      TextView myTextMsg = ViewBindings.findChildViewById(rootView, id);
      if (myTextMsg == null) {
        break missingId;
      }

      id = R.id.partner_imgView;
      RoundedImageView partnerImgView = ViewBindings.findChildViewById(rootView, id);
      if (partnerImgView == null) {
        break missingId;
      }

      id = R.id.partner_msg_section;
      LinearLayout partnerMsgSection = ViewBindings.findChildViewById(rootView, id);
      if (partnerMsgSection == null) {
        break missingId;
      }

      id = R.id.partner_profile_img;
      CircleImageView partnerProfileImg = ViewBindings.findChildViewById(rootView, id);
      if (partnerProfileImg == null) {
        break missingId;
      }

      id = R.id.partner_text_msg;
      TextView partnerTextMsg = ViewBindings.findChildViewById(rootView, id);
      if (partnerTextMsg == null) {
        break missingId;
      }

      id = R.id.seen;
      TextView seen = ViewBindings.findChildViewById(rootView, id);
      if (seen == null) {
        break missingId;
      }

      return new ChatItemBinding((RelativeLayout) rootView, myImgView, myMsgSection, myTextMsg,
          partnerImgView, partnerMsgSection, partnerProfileImg, partnerTextMsg, seen);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
