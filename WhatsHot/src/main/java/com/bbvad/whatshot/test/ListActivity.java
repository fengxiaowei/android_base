package com.bbvad.whatshot.test;

import com.jaychang.srv.SimpleRecyclerView;
import com.study.layout.constraint.constraintlayoutdemo.R;

import android.os.Bundle;

import fengxiaowei.baselibrary.activity.BaseActivity;

public class ListActivity extends BaseActivity {

  private SimpleRecyclerView listUI;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initView();
  }

  @Override
  public int getLayoutID() {
    return R.layout.activity_list;
  }

  private void initView() {
    listUI = findViewById(R.id.listUI);
  }



}
