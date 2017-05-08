package tech.jiangtao.admin.model;

/**
 * @class: Result </br>
 * @description: 全局结果类 </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 08/05/2017 15:42</br>
 * @version: 0.0.1 </br>
 **/
public class Result {

  private int statusCode;
  private String result;
  private String info;

  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}
