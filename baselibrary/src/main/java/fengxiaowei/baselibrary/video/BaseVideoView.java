package fengxiaowei.baselibrary.video;

import android.content.Context;
import android.util.AttributeSet;

import cn.jzvd.JZVideoPlayerStandard;
import fengxiaowei.baselibrary.R;

/**
 * Created by fengxiaowei on 2017/11/21.
 *
 * https://github.com/lipangit/JiaoZiVideoPlayer
 *
 * 自定义记录：
 *
 * 1：修改封面图片ImageView为BaseImageView
 */

public class BaseVideoView extends JZVideoPlayerStandard {

  public BaseVideoView(Context context) {
    super(context);
  }

  public BaseVideoView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override
  public int getLayoutId() {
    return R.layout.jz_layout_standard_base;
  }
}
