package fengxiaowei.baselibrary.image;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by fengxiaowei on 17/10/30.
 *
 *
 * http://frescolib.org/docs/index.html
 */

public class BaseImageView extends SimpleDraweeView {

  public BaseImageView(Context context, GenericDraweeHierarchy hierarchy) {
    super(context, hierarchy);
  }

  public BaseImageView(Context context) {
    super(context);
  }

  public BaseImageView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public BaseImageView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  public BaseImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

}
