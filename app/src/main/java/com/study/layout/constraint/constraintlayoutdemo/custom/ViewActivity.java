package com.study.layout.constraint.constraintlayoutdemo.custom;

import android.os.Bundle;

import com.study.layout.constraint.constraintlayoutdemo.R;

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
