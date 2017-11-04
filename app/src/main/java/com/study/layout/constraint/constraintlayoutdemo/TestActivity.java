package com.study.layout.constraint.constraintlayoutdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fengxiaowei.baselibrary.activity.BaseActivity;

public class TestActivity extends BaseActivity implements View.OnClickListener {

  private Button btn_bind;
  private Button btn_more;
  private Button mBtnToast;

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
    mBtnToast = findViewById(R.id.btn_toast);
    btn_bind.setOnClickListener(this);
    btn_more.setOnClickListener(this);

    mBtnToast.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.btn_toast:
        launchActivity(context, ToastActivity.class);
        break;
      case R.id.btn_bind:
        launchActivity(context, DataBindingActivity.class);
        break;
      case R.id.btn_more:
        launchActivity(context, MainActivity.class);
        break;
      default:
        break;
    }
  }
}
