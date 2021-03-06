package com.bbvad.whatshot.test;

import com.bbvad.whatshot.app.custom.ViewActivity;
import com.study.layout.constraint.constraintlayoutdemo.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fengxiaowei.baselibrary.activity.BaseActivity;

public class TestActivity extends BaseActivity implements View.OnClickListener {

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


  private void initView() {
    btn_more = findViewById(R.id.btn_more);
    mBtnToast = findViewById(R.id.btn_toast);
    btn_custom_view = findViewById(R.id.btn_custom_view);
    btnVideo = findViewById(R.id.btnVideo);
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
