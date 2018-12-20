package com.guoyasoft.gyautotest.ui.testCase.test.gouya.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.gouya.pages.GuoYaHome;
import com.guoyasoft.gyautotest.ui.testCase.test.gouya.pages.SearchInterview;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 15:14
 **/
public class TestGuoYa extends BaseUI {
  @Test
  public void testSearchInterview2(){
    driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
    GuoYaHome guoYaHome = PageFactory.initElements(driver, GuoYaHome.class);
    guoYaHome.clickSearchInterviewLink();
    guoYaHome.switchToIframe(driver);
    SearchInterview searchInterview = PageFactory.initElements(driver, SearchInterview.class);
    searchInterview.sendKeysStudentNameInput("张继成");
//        searchInterview.clickSearchButton();
    sleep(3);
  }

  @Test
  public void testSearchInterview1(){
    driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
    addScreenshot2Allure("果芽首页");
    GuoYaHome guoYaHome = PageFactory.initElements(driver, GuoYaHome.class);
    guoYaHome.clickSearchInterviewLink();
    guoYaHome.switchToIframe(driver);
    SearchInterview searchInterview = PageFactory.initElements(driver, SearchInterview.class);
    System.out.println("搜索姓名：王鹏");
    addScreenshot2Allure("查询面试");
    searchInterview.sendKeysStudentNameInput("王鹏");
    addScreenshot2Allure("王鹏查询信息");
//        searchInterview.clickSearchButton();
    sleep(3);
  }


}
