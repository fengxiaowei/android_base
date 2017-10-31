package com.study.layout.constraint.constraintlayoutdemo.com.study.layout.constraint.constraintlayoutdemo.http;

import com.study.layout.constraint.constraintlayoutdemo.Repo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by fengxiaowei on 17/10/30.
 */

public interface CityAPI {
  @GET("ffan/v3/cities")
  Call<Repo> cities();
}
