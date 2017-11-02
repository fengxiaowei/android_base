package com.study.layout.constraint.constraintlayoutdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.study.layout.constraint.constraintlayoutdemo.databinding.ActivityBind;

import fengxiaowei.baselibrary.activity.BaseActivity;

public class DataBindingActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public int getLayoutID() {
    return R.layout.activity_data_binding;
  }


  @Override
  public void initBind() {
    if (dataBinding == null)
      return;

    ActivityBind activityBind = (ActivityBind) dataBinding;
    activityBind.setData(layoutData);
    // 绑定点击事件
    activityBind.setListener(this);
    activityBind.tvTest.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        layoutData.put("firstName", "老子被自己点击了");
      }
    });
  }

  public void onClick(View view) {
    layoutData.put("lastName", "冯小卫");
    Toast.makeText(context, "事件点击", Toast.LENGTH_SHORT).show();
  }
}
