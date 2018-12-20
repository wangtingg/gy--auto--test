package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 12:59
 **/
public class TaoBaoLogin extends BaseUI {
  // 通过findby定位页面元素
 @FindBy(xpath = "//i[@id=\"J_Quick2Static\"]")
//  定位到的元素存到变量中
 private WebElement loginIcon;
  // 通过findby定位页面元素
 @FindBy(xpath = "//input[@id=\"TPL_username_1\" ]")
//  定位到的元素存到变量中
  private WebElement loginUserName;
  // 通过findby定位页面元素
  @FindBy(xpath = "//input[@id=\"TPL_password_1\" ]")
  //定位到的元素存到变量中
 private WebElement loginPassword;
  // 通过findby定位页面元素
 @FindBy(xpath = "//button[@id=\"J_SubmitStatic\" ]")
  //定位到的元素存到变量中
 private WebElement loginButton;
  //把定位到的元素封装成一个方法
  public void clickLoginIcon(){
    click(loginIcon);   }
  public void sendKeysLoginUserName(String userName){
    sendKeys(loginUserName,userName);
  }
  public void sendKeysLoginPassword(String password){
    sendKeys(loginPassword,password);   }
    public void clickLoginButton(){
    click(loginButton);
   }
//  private WebElement
}
