package com.bbvad.whatshot.test;

import com.study.layout.constraint.constraintlayoutdemo.R;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import cn.jzvd.JZVideoPlayerStandard;
import fengxiaowei.baselibrary.activity.BaseActivity;
import fengxiaowei.baselibrary.video.BaseVideoView;

public class VideoActivity extends BaseActivity implements View.OnClickListener {


  private BaseVideoView mVideoView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initView();
  }

  @Override
  public int getLayoutID() {
    return R.layout.activity_video;
  }

  private void initView() {
    mVideoView = findViewById(R.id.videoView);

    mVideoView.setUp(
        "http://jzvd.nathen.cn/342a5f7ef6124a4a8faf00e738b8bee4/cf6d9db0bd4d41f59d09ea0a81e918fd-5287d2089db37e62345123a1be272f8b.mp4",
        JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL, "饺子快长大");

    mVideoView.thumbImageView.setImageURI(
        Uri.parse("http://jzvd-pic.nathen.cn/jzvd-pic/1bb2ebbe-140d-4e2e-abd2-9e7e564f71ac.png"));
  }

  @Override
  public void onBackPressed() {
    if (mVideoView.backPress()) {
      return;
    }
    super.onBackPressed();
  }

  @Override
  protected void onPause() {
    super.onPause();
    mVideoView.releaseAllVideos();
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      default:
        break;
    }
  }
}
