package com.study.layout.constraint.constraintlayoutdemo.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by fengxiaowei on 2017/11/13.
 */

public class CustomView extends View {
  public CustomView(Context context) {
    super(context);
  }

  public CustomView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }


  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    customDraw(canvas);
  }



  private void customDraw(Canvas canvas) {


    //一个实心圆
    Paint paint = new Paint();
    paint.setColor(Color.parseColor("#FF0000"));
    canvas.drawCircle(100, 100, 100, paint);


    //一个圆圈
    paint.setStrokeWidth(5);
    paint.setStyle(Paint.Style.STROKE);
    paint.setAntiAlias(true);
    canvas.drawCircle(300, 100, 100, paint);

    //矩形
    canvas.drawRect(400,5,500,200,paint);


    //画点
    paint.setStrokeWidth(30);
    paint.setStrokeCap(Paint.Cap.ROUND);
    canvas.drawPoint(100,300,paint);

    //蒙板
    canvas.drawColor(Color.parseColor("#88880000"));
  }
}
