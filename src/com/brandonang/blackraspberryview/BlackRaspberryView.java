package com.brandonang.blackraspberryview;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.view.View;
import android.widget.FrameLayout;

public class BlackRaspberryView extends AndroidNonvisibleComponent {

  public BlackRaspberryView(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public void CreateBlackRaspberryView(AndroidViewComponent layout, int color, int padding){
     View view = layout.getView();
     FrameLayout frameLayout = (FrameLayout) view;
     frameLayout.setBackgroundColor(color);
     view.setPadding(padding, 0, padding, 0);
   }  

  @SimpleFunction
  public void CreateGradientBlackRaspberryView(AndroidViewComponent layout, int color, int color2, int padding){
     View view = layout.getView();
     FrameLayout frameLayout = (FrameLayout) view;
     GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] {color, color2});
     frameLayout.setBackground(gradientDrawable);
     view.setPadding(padding, 0, padding, 0);
  }

  @SimpleFunction
  public int SetBlackRaspberryPadding(int padding){
    return padding;
  }
}
