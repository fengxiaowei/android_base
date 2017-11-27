package fengxiaowei.baselibrary.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gyf.barlibrary.ImmersionBar;

/**
 * Created by fengxiaowei on 17/10/31.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

  protected Activity context;
  protected ImmersionBar mImmersionBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // 提供子类方便获取this的能力
    context = this;

    setContentView(getLayoutID());
    // 侵入式状态栏
    mImmersionBar = ImmersionBar.with(this);
    mImmersionBar.init();
  }

  /**
   * 钩子方法，让子类设置布局文件
   *
   * @return
   */
  public abstract int getLayoutID();


  @Override
  public void onClick(View v) {

  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    if (mImmersionBar != null)
      mImmersionBar.destroy();
  }


  public static void launchActivity(Context context, Class mClass) {
    Intent intent = new Intent(context, mClass);
    context.startActivity(intent);
  }
}
