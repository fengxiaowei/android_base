package com.study.layout.constraint.constraintlayoutdemo;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bigkoo.alertview.AlertView;
import com.orhanobut.hawk.Hawk;
import com.study.layout.constraint.constraintlayoutdemo.com.study.layout.constraint.constraintlayoutdemo.http.HttpAPI;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import fengxiaowei.baselibrary.activity.BaseActivity;
import fengxiaowei.baselibrary.image.BaseImageView;

public class MainActivity extends BaseActivity {

  private BaseImageView mImageViewMy;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initView();
    testFresco();
    testRetrofit();
  }

  @Override
  public int getLayoutID() {
    return R.layout.activity_main;
  }

  @Override
  public void initBind() {
    if (dataBinding == null)
      return;
  }

  private void initView() {
    mImageViewMy = findViewById(R.id.my_image_view);
    mImageViewMy.setOnClickListener(this);
  }


  private void testRetrofit() {
    HttpAPI.getCities(new HttpAPI.HttpCallBack<Repo>() {
      @Override
      public void finish(Repo repo) {
        if (repo != null) {}
      }
    });
  }


  private void testFresco() {
    Uri uri =
        Uri.parse(
            "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3591923496,3928241138&fm=11&gp=0.jpg");
    BaseImageView draweeView = findViewById(R.id.my_image_view);
    draweeView.setImageURI(uri);


    // 图片按照比例显示比例
    BaseImageView simpleDraweeView1 = findViewById(R.id.simpleDraweeView1);
    simpleDraweeView1.setImageURI(uri);


    // 图片圆形
    BaseImageView simpleDraweeView2 = findViewById(R.id.simpleDraweeView2);
    simpleDraweeView2.setImageURI(uri);


    uri = Uri.parse(
        "https://timg.ffan.com/convert/resize/url_T1MoC_BbLv1RCvBVdK/width_314/height_439/tfs/xxx.webp");
    // 图片圆形
    BaseImageView simpleDraweeView3 = findViewById(R.id.simpleDraweeView3);
    simpleDraweeView3.setImageURI(uri);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.my_image_view:
        MsgEvent.Msg1 msg1 = new MsgEvent.Msg1();
        Hawk.put("111", msg1);
        EventBus.getDefault().post(msg1);
        break;
      default:
        break;
    }
  }


  @Subscribe(threadMode = ThreadMode.MAIN)
  public void onMessageEvent(MsgEvent.Msg1 event) {
    Toast.makeText(this, "哈哈哈哈", Toast.LENGTH_SHORT).show();
    MsgEvent.Msg1 msg1 = Hawk.get("111");
    System.out.println(msg1);
    System.out.println(event);
    testAlert();
  }



  private void testAlert() {
    new AlertView("标题", "内容", null, new String[] {"确定"}, null, this,
        AlertView.Style.Alert, null).show();
  }

}
