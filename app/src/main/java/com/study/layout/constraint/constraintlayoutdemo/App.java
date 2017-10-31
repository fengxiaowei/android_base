package com.study.layout.constraint.constraintlayoutdemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.orhanobut.hawk.Hawk;

/**
 * Created by fengxiaowei on 17/10/25.
 */

public class App extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    init();
  }



  private void init() {
    Fresco.initialize(this);
    Hawk.init(this).build();
  }
}
