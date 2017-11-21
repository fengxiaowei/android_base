package com.study.layout.constraint.constraintlayoutdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.study.layout.constraint.constraintlayoutdemo.custom.ViewActivity;

import fengxiaowei.baselibrary.activity.BaseActivity;

public class TestActivity extends BaseActivity implements View.OnClickListener {

  private Button btn_bind;
  private Button btn_more;
  private Button mBtnToast;
  private Button btn_custom_view;
  private Button btnVideo;

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
    btn_custom_view = findViewById(R.id.btn_custom_view);
    btnVideo = findViewById(R.id.btnVideo);
    btn_bind.setOnClickListener(this);
    btn_more.setOnClickListener(this);
    mBtnToast.setOnClickListener(this);
    btn_custom_view.setOnClickListener(this);
    btnVideo.setOnClickListener(this);
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
      case R.id.btn_custom_view:
        launchActivity(context, ViewActivity.class);
        break;
      case R.id.btnVideo:
        launchActivity(context, VideoActivity.class);
        break;
      default:
        break;
    }
  }
}
