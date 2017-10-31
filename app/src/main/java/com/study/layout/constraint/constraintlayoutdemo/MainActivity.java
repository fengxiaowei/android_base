package com.study.layout.constraint.constraintlayoutdemo;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.orhanobut.hawk.Hawk;
import com.study.layout.constraint.constraintlayoutdemo.com.study.layout.constraint.constraintlayoutdemo.http.HttpAPI;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import fengxiaowei.baselibrary.activity.BaseActivity;
import fengxiaowei.baselibrary.image.BaseImageView;

public class MainActivity extends BaseActivity implements View.OnClickListener {

  private BaseImageView mImageViewMy;
  private BaseImageView mSimpleDraweeView1;
  private BaseImageView mSimpleDraweeView2;
  private BaseImageView mSimpleDraweeView3;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
    testFresco();
    testRetrofit();
  }

  private void initView() {
    mImageViewMy = (BaseImageView) findViewById(R.id.my_image_view);
    mImageViewMy.setOnClickListener(this);
    mSimpleDraweeView1 = (BaseImageView) findViewById(R.id.simpleDraweeView1);
    mSimpleDraweeView2 = (BaseImageView) findViewById(R.id.simpleDraweeView2);
    mSimpleDraweeView3 = (BaseImageView) findViewById(R.id.simpleDraweeView3);
  }


  private void testRetrofit() {
    HttpAPI.getCities(new HttpAPI.HttpCallBack<Repo>() {
      @Override
      public void finish(Repo repo) {
        if (repo != null) {
        }
      }
    });
  }


  private void testFresco() {
    Uri uri =
        Uri.parse(
            "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3591923496,3928241138&fm=11&gp=0.jpg");
    BaseImageView draweeView = (BaseImageView) findViewById(R.id.my_image_view);
    draweeView.setImageURI(uri);


    // 图片按照比例显示比例
    BaseImageView simpleDraweeView1 = (BaseImageView) findViewById(R.id.simpleDraweeView1);
    simpleDraweeView1.setImageURI(uri);


    // 图片圆形
    BaseImageView simpleDraweeView2 = (BaseImageView) findViewById(R.id.simpleDraweeView2);
    simpleDraweeView2.setImageURI(uri);


    uri = Uri.parse(
        "https://timg.ffan.com/convert/resize/url_T1MoC_BbLv1RCvBVdK/width_314/height_439/tfs/xxx.webp");
    // 图片圆形
    BaseImageView simpleDraweeView3 = (BaseImageView) findViewById(R.id.simpleDraweeView3);
    simpleDraweeView3.setImageURI(uri);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.my_image_view:
        MsgEvent.Msg1 msg1 = new MsgEvent.Msg1();
        Hawk.put("111",msg1);
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
  }
}
