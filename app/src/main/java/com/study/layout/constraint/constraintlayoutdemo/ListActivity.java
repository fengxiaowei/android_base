package com.study.layout.constraint.constraintlayoutdemo;

import android.os.Bundle;

import com.jaychang.srv.SimpleRecyclerView;

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
