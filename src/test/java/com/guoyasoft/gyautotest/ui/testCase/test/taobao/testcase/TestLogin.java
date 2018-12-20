package com.guoyasoft.gyautotest.ui.testCase.test.taobao.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 13:03
 **/
public class TestLogin extends BaseUI {
  @Test
  public void testLogin(){
    //打开网址
    driver.get("https://www.taobao.com/");
    //初始页面
    TaoBaoHome taoBaoHome = PageFactory.initElements(driver, TaoBaoHome.class);
    //调用页面元素的操作方法
//    taoBaoHome.sendKeysHome("手机");
//    taoBaoHome.clickSearchButton();
   // taoBaoHome.clikLoginLink();
    taoBaoHome.clikloginShuoJi();
//   TaoBaoLogin taoBaoLogin = PageFactory.initElements(driver, TaoBaoLogin.class);
//   taoBaoLogin.clickLoginIcon();
//   taoBaoLogin.sendKeysLoginUserName("18103909786");
//    taoBaoLogin.sendKeysLoginPassword("xue000111333");
//    taoBaoLogin.clickLoginButton();


    boolean actual = driver.getPageSource().contains("我的淘宝");
    //断言
    Assert.assertEquals(actual,true);


  }

}
