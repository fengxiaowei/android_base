package com.bbvad.whatshot.test;

import com.study.layout.constraint.constraintlayoutdemo.R;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;
import fengxiaowei.baselibrary.activity.BaseActivity;

public class ToastActivity extends BaseActivity implements View.OnClickListener {


  private TextView mTvError;
  private TextView mTvSuccess;
  private TextView mTvInfo;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initView();
  }

  @Override
  public int getLayoutID() {
    return R.layout.activity_toast;
  }

  private void initView() {
    mTvError = (TextView) findViewById(R.id.tv_error);
    mTvError.setOnClickListener(this);
    mTvSuccess = (TextView) findViewById(R.id.tv_success);
    mTvSuccess.setOnClickListener(this);
    mTvInfo = (TextView) findViewById(R.id.tv_info);
    mTvInfo.setOnClickListener(this);
  }


  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.tv_error:
        Toasty.error(context, "This is an error toast.", Toast.LENGTH_SHORT, false).show();
        break;
      case R.id.tv_success:
        Toasty.success(context, "Success!", Toast.LENGTH_SHORT, true).show();
        break;
      case R.id.tv_info:
        Toasty.info(context, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
        break;
      default:
        break;
    }
  }
}
