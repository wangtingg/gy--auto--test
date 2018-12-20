package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 13:00
 **/
public class TaoBaoHome extends BaseUI {

  // 通过findby定位页面元素
//  @FindBy(xpath = "//a[contains(text(),'亲，请登录')]")
//  定位到的元素存到变量中
//   private WebElement loginLink;
  // 通过findby定位页面元素
//  @FindBy(xpath = "//input[@id=\"q\" ]")
  //定位到的元素存到变量中
//  private WebElement searchInput;
  // 通过findby定位页面元素
//  @FindBy(xpath = "//button[contains(text(),\"搜索\") ]")
  //定位到的元素存到变量中
//  private WebElement searchButton;
  @FindBy(xpath = "//li[@aria-label=\"查看更多\" ]/a[contains(text(),\"手机\")]")
  private WebElement loginShuoJi;
  //把定位到的元素封装成一个方法
//  public void search(String text) {
//    sendKeys(searchInput, text);
//    click(searchButton);
//  }

  // public void clickSearchButton() {
  //   click(searchButton);
//}
//  public void sendKeysHome(String inputName) {
//    sendKeys(searchInput, inputName);
  //}
// public void clickLoginLink(){
//   click(loginLink);
// }
public void clikloginShuoJi(){
  click(loginShuoJi);

}
}


