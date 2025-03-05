package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    WebDriver driver;
    public static void main(String[] args) {
        SeleniumDemo demo = new SeleniumDemo();
        demo.setUp();
//        driver.get("https://www.google.com/");
//        driver.getTitle();
//        System.out.println("Chrome browser open via selenium :"+driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        driver.close(); // closes the current window.
//       // driver.quit();// closes all the windows associated to the driver.

        demo.openUrl();
        demo.findElementandSendDetails();


    }

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void openUrl(){
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

    }
    public void findElementandSendDetails(){
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys(("hello"));
        driver.findElement(By.className("submit")).click();

       // #cssSelector
         //      # className -> tagname.className
        // Id-> tagname#id


    }

  public void close(){
      driver.close();
  }
}
