package com.study.layout.constraint.constraintlayoutdemo.com.study.layout.constraint.constraintlayoutdemo.http;

import com.study.layout.constraint.constraintlayoutdemo.Repo;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by fengxiaowei on 17/10/31.
 */

public class HttpAPI {



  public static void getCities(final HttpCallBack<Repo> httpCallBack) {
    Call<Repo> call = HTTPHelper.cityAPI.cities();

    call.enqueue(new CommonCallBack<Repo>() {
      @Override
      public void onResponse(Call<Repo> call, Response<Repo> response) {
        if (httpCallBack != null) {
          httpCallBack.finish(response.body());
        }
      }
    });
  }


  /**
   * 对retrofit2的回调，做一个统一的过滤处理
   * 
   * @param <T>
   */
  public static class CommonCallBack<T> implements retrofit2.Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {

    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
      t.printStackTrace();
    }
  }


  /**
   * 应用层数据回调接口
   * 
   * @param <T>
   */
  public interface HttpCallBack<T> {
    void finish(T t);
  }



}
