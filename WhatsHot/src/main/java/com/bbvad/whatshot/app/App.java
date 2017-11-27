package com.bbvad.whatshot.app;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.orhanobut.hawk.Hawk;

import android.app.Application;

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
