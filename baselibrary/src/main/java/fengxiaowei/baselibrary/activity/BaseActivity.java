package fengxiaowei.baselibrary.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import fengxiaowei.baselibrary.model.EmptyMsg;

/**
 * Created by fengxiaowei on 17/10/31.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

  protected Activity context;
  protected ViewDataBinding dataBinding;
  protected ObservableArrayMap<String, Object> layoutData =
      new ObservableArrayMap<String, Object>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // 提供子类方便获取this的能力
    context = this;
    // 给子类，赋予EventBus消息接收能力
    EventBus.getDefault().register(this);

    // 让子类具有DataBinding能力，如果布局文件没有layout标签，这里是null，按照传统的方式走。
    dataBinding =
        DataBindingUtil.setContentView(this, getLayoutID());

    initBind();
  }

  /**
   * 钩子方法，让子类设置布局文件
   *
   * @return
   */
  public abstract int getLayoutID();

  /**
   * 钩子方法，让子类初始化DataBinding
   */
  public abstract void initBind();

  /**
   * 解决EventBus没有注册消息的异常
   *
   * @param msg
   */
  @Subscribe(threadMode = ThreadMode.MAIN)
  public void onMessageEvent(EmptyMsg msg) {

  }


  /**
   * 在基类实现OnClickListener主要是方便DataBinding的事件绑定（在布局文件中，事件的处理对象就可以是任何OnClickListener的子类了）
   *
   * @param v
   */
  @Override
  public void onClick(View v) {

  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    EventBus.getDefault().unregister(this);
  }


  public static void launchActivity(Context context, Class mClass) {
    Intent intent = new Intent(context, mClass);
    context.startActivity(intent);
  }
}
