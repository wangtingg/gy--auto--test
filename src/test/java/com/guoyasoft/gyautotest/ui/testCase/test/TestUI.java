package com.guoyasoft.gyautotest.ui.testCase.test;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-13 10:10
 **/
public class TestUI extends BaseUI {

  @Test
  public void testTextInput() {
    //打开网址
    driver.get("https://www.taobao.com/");
    //定位页面元素
    WebElement text = driver.findElement(By.xpath("//input[@id='q']"));
    //   //清空输入框
    //   text.clear();
    //   //往输入框填值
//    text.sendKeys("手机");
    sendKeys(text, "手机");
    //等待2秒
    sleep(2);

  }

  @Test
  public void testButton() {
    //打开网址
    // testTextInput();
    //定位页面元素
    WebElement boutton = driver.findElement(By.xpath("//button[contains(text(),'搜索')]"));
    //点击
    //boutton.click();
    click(boutton);
    sleep(2);

  }

  @Test
  //点击
  public void tetLink() {
    //打开网址
    driver.get("https://www.taobao.com/");
    //定位页面元素
    WebElement link = driver
        .findElement(By.xpath("//li[@aria-label=\"查看更多\"]/a[contains(text(),'女装')]"));
    //点击
    //  link.click();
    //ctrl+点击
//创建鼠标操作对象(新建一个Actions类的实例)
    Actions actions = new Actions(driver);
    //操作
    // actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
    //shift+点击
    actions.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).perform();
    //等待2秒
    sleep(2);
  }

  @Test
  //下拉框
  public void testSelect() {
    //打开网址
    driver.get("file:///E:/softwarebak/demo(2).html");
    //定位页面元素
    WebElement select = driver.findElement(By.xpath("//select"));
    //创建鼠标操作对象
    Select selects = new Select(select);
    //选择可见的
    selects.selectByVisibleText("香蕉");
    //等待3秒
    sleep(3);
    //选择顺序，序号
    selects.selectByIndex(0);
    sleep(3);
    //
    selects.selectByValue("juzi");
    sleep(3);
  }

  @Test
  //日期
  public void testDate() {
    driver.get("file:///E:/softwarebak/demo(2).html");
    //js的格式
    String js = "var xpath = \"//input[@type='date']\";var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();element.value=\"2018-12-13\";";
    //js转换java
    JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
    jsDriver.executeScript(js);
    //等待3秒
    sleep(3);
  }

  @Test
  //时间
  public void testTime() {
    driver.get("file:///E:/softwarebak/demo(2).html");
    //js的格式
    String js = "var xpath = \"//input[@type='time']\";var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();element.value=\"18:00\";";
    //js转换java
    JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
    jsDriver.executeScript(js);
    //等待3秒
    sleep(2);
  }

  @Test
  //导航栏
  public void testNavigate() {
    //第一个网址：淘宝
    driver.get("https://www.taobao.com/");
    sleep(2);
    //第二个网址：京东
    driver.get("https://www.jd.com/");
    sleep(2);
    //后退
    driver.navigate().back();
    sleep(1);
    //前进
    driver.navigate().forward();
    sleep(1);
    //刷新
    driver.navigate().refresh();
    sleep(1);
    //跳转到百科百度
    driver.navigate().to("https://baike.baidu.com/");
    sleep(2);
  }

  @Test
  //登录
  public void guoyaLogo() {
    //打开网址
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
    //定位页面元素
    WebElement text = driver.findElement(By.xpath("//input[@id=\"userName\"]"));
    WebElement textst = driver.findElement(By.xpath("//input[@id=\"password\"]"));
    WebElement texts = driver.findElement(By.xpath("//input[@id=\"checkCode\"]"));
    WebElement buotton = driver.findElement(By.xpath("//input[@id=\"loginBtn\"]"));
    //清空输入框
    text.clear();
    //往输入框填值
    text.sendKeys("wangting");
    sleep(2);
    //清空输入框
    textst.clear();
    //往输入框填值
    textst.sendKeys("151501");
    sleep(2);
    //清空输入框
    texts.clear();
    //往输入框填值
    texts.sendKeys("12345");
    sleep(2);
    //点击
    click(buotton);
    sleep(2);
  }

  @Test
  //登录注册
  public void guoyaLogonagyn() {
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/signUp.jsp");
    WebElement text = driver.findElement(By.xpath("//input[@id=\"userName\"]"));
    WebElement texts = driver.findElement(By.xpath("//input[@id=\"realName\"]"));
    WebElement textt = driver.findElement(By.xpath("//input[@id=\"password\"]"));
    WebElement textst = driver.findElement(By.xpath("//input[@id=\"password2\"]"));
    WebElement phone = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
    WebElement age = driver.findElement(By.xpath("//input[@id=\"age\"]"));
    WebElement check = driver.findElement(By.xpath("//input[@id=\"checkCode\"]"));
    WebElement value = driver.findElement(By.xpath("//input[@value=\"注册\"]"));
    text.clear();
    //往输入框填值
    text.sendKeys("wang12");
    sleep(2);
    texts.clear();
    //往输入框填值
    texts.sendKeys("王络");
    sleep(2);
    textt.clear();
    //往输入框填值
    textt.sendKeys("wangti");
    sleep(1);
    textst.clear();
    //往输入框填值
    textst.sendKeys("wangti");
    sleep(1);
    phone.clear();
    //往输入框填值
    phone.sendKeys("13165516751");
    sleep(1);
    age.clear();
    //往输入框填值
    age.sendKeys("25");
    sleep(1);
    check.clear();
    //往输入框填值
    check.sendKeys("1234");
    sleep(1);
    click(value);
    sleep(1);
    //切换窗口至弹框
    Alert alert = driver.switchTo().alert();
    alert.accept();
    sleep(2);
  }

  @Test
  //标签窗口切换
  public void testWindowSwitch() {
    //打开网址
    driver.get("https://www.taobao.com/");
    //定位到女装并打开
    driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'女装')]")).click();
    sleep(2);
    //定位到男装并打开
    driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'男装')]")).click();
    sleep(2);
    //定位到箱包并打开
    driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'箱包')]")).click();
    sleep(2);
    //1.获取所有窗口的句柄
    Set<String> handles = driver.getWindowHandles();
    //2.使用foreach循环遍历set集合中的句柄
    for (String h : handles) {
      //3.根据句柄切换窗口
      driver.switchTo().window(h);
      sleep(2);
      //4.根据窗口标题来判断当前是哪个窗口
      if (driver.getTitle().contains("iFashion男装")) {
        //5.结束循环
        break;
      }
    }
  }

  @Test
  //数组
  public void testContainer() {
    //数组
    //声明
    String[] strings = {"11", "22", "333", "444"};
    //String[] strings1 = new String[5];
    //取用
    strings[0] = "555";
    System.out.println(strings[0]);

    String[][] str2 = {{"1", "2", "3", "4"}, {"11", "22", "33", "44"}, {"111", "222", "333", "444"},
        {"1111", "2222", "3333", "4444"}};
    String[][] str21 = new String[3][4];
    System.out.println(str2[1][2]);
    List<String> list = new ArrayList<String>();
    //
    list.add("111");
    list.add("222");
    list.add("333");
    //往容器的某个位置加东西
    list.add(1, "444");
    //根据标号取容器中的数据
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));

    //新建一个map
    Map<String, String> map = new HashMap<String, String>();
    //存(key不能重复)
    map.put("姓名", "薛鹏垒");
    map.put("性别", "男");
    map.put("年龄", "22");
    //取
    System.out.println(map.get("姓名"));
    //删
    map.remove("姓名");
    System.out.println(map.get("姓名"));

    Set<String> set = new HashSet<>();

    set.add("1111");
    set.add("1111");
    set.add("1111");
    for (String s : set) {
      System.out.println(s);
    }
  }

  @Test
  //iframe
  public void testIframe() {
    driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
    driver.findElement(By.xpath("//a[contains(text(),'查询面试')]")).click();
    sleep(3);
    WebElement iframe = driver.findElement(By.xpath("//Iframe"));
    driver.switchTo().frame(iframe);
    driver.findElement(By.xpath("//button[contains(text(),'查询')]")).click();
    sleep(3);
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//a[contains(text(),'面试统计')]")).click();
    sleep(3);
  }

  @Test
  public void testFor() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,};
//    System.out.println(arr[0]);
//    System.out.println(arr[1]);
//    System.out.println(arr[2]);
//    System.out.println(arr[3]);
//    System.out.println(arr[4]);
//    System.out.println(arr[5]);
//    System.out.println(arr[6]);
//    System.out.println(arr[7]);

//    int j =0;
//    for (int i =0;i<=7;i++){
//      System.out.println(arr[j]);
//      j++;}

//   for (int i =0;i<=7;i++){
//   System.out.println(arr[i]);
//    }

    for (int i = 0; i <= arr.length - 1; i++) {
      System.out.println(arr[i]);
    }

    for (int i : arr) {
      System.out.println(i);
    }
  }

  @Test
  public void testContainer1() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int arrLength = arr.length;
    Map map = new HashMap();
    System.out.println("数组的长度为:" + arr.length);
    for (int i = 0; i <= arrLength - 1; i++) {
      map.put(i, arr[i]);
    }
    for (Object o : map.keySet()) {
      System.out.println("map集合的键为:" + o + ",map集合中键对应的值为:" + map.get(o));
    }
  }

  @Test
  public void Mul99() {
    for(int i = 1;i <= 9; i++) {
      for(int j = 1; j <= i; j++){
        System.out.printf("%d * %d = %2d ", i, j, i*j);
        System.out.print("\t");
//        System.out.print( j + " * " + i + " = " + i*j + "\t\t");
      }
      System.out.println("");
    }
  }
  @Test
  public void jiuJiu(){
    for(int i = 1;i <= 9;i++){
      for (int j = 1;j <= i; j++ ){
        System.out.print(j + "x"+ i+"="+i*j+"\t");
      }
      System.out.println();
    }
  }
  @Test
  public void testIf(){
    int money =20;
    if (money >=12){
      System.out.println("买到本子"
      );
    }else {
      System.out.println("失败"); }
      int yuE = 350;
      int yuEBao= 2000;
      int yinHangKa =6000;
      int buy = 6050;
      if (yuE >= buy){
        System.out.println("余额扣除"+ buy);
      }
      else if (yuE >= buy){
        System.out.println("余额宝扣除"+ buy);
      }
      else if( yinHangKa >= buy){
        System.out.println("银行卡扣除"+ buy);
      }else {
        System.out.println("扣除失败");
      }
  }
  @Test
 public  void testbubbleSort(){
   int[] arr = {17,21,14,32,8,19};
   for(int i= arr.length-1;i>=1;i--) {
   //-1为了防止溢出
     for(int j=0;j <=i-1;j ++) {
       if(arr[j]>arr[j+1]) {
         int a = arr[j];
         arr[j] = arr[j + 1];

         arr[j + 1] = a;
       }
      }
    }
     for (int i:arr){
       System.out.print(i+"\t");
      }
   }
   @Test
   public void testAssert(){
    driver.get("https://www.taobao.com/");
    driver.findElement(By.xpath("//a[contains(text(),'亲，请登录')]")).click();
    driver.findElement(By.xpath("//i[@id=\"J_Quick2Static\"]")).click();
     WebElement username = driver.findElement(By.xpath("//input[@id=\"TPL_username_1\" ]"));
     username.clear();
     username.sendKeys("18103909786");
     WebElement password = driver.findElement(By.xpath("//input[@id=\"TPL_password_1\" ]"));
     password.clear();
     password.sendKeys("xue000111333");
     driver.findElement(By.xpath("//button[@id=\"J_SubmitStatic\" ]")).click();
     sleep(3);
     boolean actual = driver.getPageSource().contains("我的淘宝");
     Assert.assertEquals(actual,true);

   }
 }
