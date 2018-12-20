package com.guoyasoft.gyautotest.ui.testCase.test.gouya.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 15:13
 **/
public class SearchInterview extends BaseUI {
  @FindBy(xpath = "//input[@name=\"custmerName\"]")
  private WebElement studentNameInput;

  @FindBy(xpath = "//button[contains(text(),'查询')]")
  private WebElement searchButton;


  public void sendKeysStudentNameInput(String studentName){
    sendKeys(studentNameInput,studentName);
  }
  public void clickSearchButton(){

    click(searchButton);
  }
}
