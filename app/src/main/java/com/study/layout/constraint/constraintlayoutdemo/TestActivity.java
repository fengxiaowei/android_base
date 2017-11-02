package com.study.layout.constraint.constraintlayoutdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fengxiaowei.baselibrary.activity.BaseActivity;

public class TestActivity extends BaseActivity {

  private Button btn_bind;
  private Button btn_more;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initView();
  }

  @Override
  public int getLayoutID() {
    return R.layout.activity_test;
  }

  @Override
  public void initBind() {

  }

  private void initView() {
    btn_bind = findViewById(R.id.btn_bind);
    btn_more = findViewById(R.id.btn_more);

    btn_bind.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        launchActivity(context, DataBindingActivity.class);
      }
    });
    btn_more.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        launchActivity(context, MainActivity.class);
      }
    });
  }
}
