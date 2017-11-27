package com.bbvad.whatshot.app.custom;

import com.study.layout.constraint.constraintlayoutdemo.R;

import android.os.Bundle;

import fengxiaowei.baselibrary.activity.BaseActivity;

/**
 * 自定义View测试
 */
public class ViewActivity extends BaseActivity {



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    initView();
  }

  @Override
  public int getLayoutID() {
    return R.layout.activity_view;
  }

  private void initView() {}

}
