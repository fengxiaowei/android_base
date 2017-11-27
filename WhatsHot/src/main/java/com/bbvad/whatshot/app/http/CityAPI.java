package com.bbvad.whatshot.app.http;

import com.bbvad.whatshot.test.Repo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by fengxiaowei on 17/10/30.
 */

public interface CityAPI {
  @GET("ffan/v3/cities")
  Call<Repo> cities();
}
