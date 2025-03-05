package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumDemo {
    WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
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
   //     demo.close();


    }

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void openUrl(){
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

    }
    public void findElementandSendDetails() throws InterruptedException {
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys(("hello"));
        driver.findElement(By.className("submit")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Mira");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Xyz@example.com");
        driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
        driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9188248872");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println( driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,\"submit\")]")).click();



        // #cssSelector
        // # className -> tagname.className
        // Id-> tagname#id
        //generic cssSeclector  tagname[attribute='value']
        // parenttagname childtagname
        //---------------------------------------------------------------
        //Xpath
        //tagname[@attribute="value"]
        // //parenttagname/childtagname

    }

  public void close(){
      driver.close();
  }
}
