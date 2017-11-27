package com.bbvad.whatshot.app.http;

/**
 * Created by fengxiaowei on 17/10/31.
 */

public class HttpBaseModel {
  public int status;
  public String message;
  public String msg;

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
