package com.study.layout.constraint.constraintlayoutdemo;

import com.study.layout.constraint.constraintlayoutdemo.com.study.layout.constraint.constraintlayoutdemo.http.HttpBaseModel;

import java.util.List;

/**
 * Created by fengxiaowei on 17/10/30.
 */

public class Repo extends HttpBaseModel {

  private DataBean data;

  public DataBean getData() {
    return data;
  }

  public void setData(DataBean data) {
    this.data = data;
  }


  public static class DataBean {
    private List<HotCityListBean> hotCityList;
    private List<CityListBean> cityList;

    public List<HotCityListBean> getHotCityList() {
      return hotCityList;
    }

    public void setHotCityList(List<HotCityListBean> hotCityList) {
      this.hotCityList = hotCityList;
    }

    public List<CityListBean> getCityList() {
      return cityList;
    }

    public void setCityList(List<CityListBean> cityList) {
      this.cityList = cityList;
    }

    public static class HotCityListBean {

      private String cityId;
      private String cityName;

      public String getCityId() {
        return cityId;
      }

      public void setCityId(String cityId) {
        this.cityId = cityId;
      }

      public String getCityName() {
        return cityName;
      }

      public void setCityName(String cityName) {
        this.cityName = cityName;
      }
    }

    public static class CityListBean {

      private String cityId;
      private String cityName;
      private String cityPinYin;

      public String getCityId() {
        return cityId;
      }

      public void setCityId(String cityId) {
        this.cityId = cityId;
      }

      public String getCityName() {
        return cityName;
      }

      public void setCityName(String cityName) {
        this.cityName = cityName;
      }

      public String getCityPinYin() {
        return cityPinYin;
      }

      public void setCityPinYin(String cityPinYin) {
        this.cityPinYin = cityPinYin;
      }
    }
  }

  @Override
  public String toString() {
    return "Repo{" +
        "status=" + status +
        ", message='" + message + '\'' +
        ", data=" + data +
        ", msg='" + msg + '\'' +
        '}';
  }
}
