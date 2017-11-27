package com.bbvad.whatshot.app.http;

import fengxiaowei.baselibrary.https.RetrofitHelper;

/**
 * Created by fengxiaowei on 17/10/30.
 */

public class HTTPHelper {
  public static CityAPI cityAPI;
  static {
    RetrofitHelper.init("https://api.ffan.com/");
    cityAPI = RetrofitHelper.getInstance().create(CityAPI.class);
  }







}
