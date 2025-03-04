package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.getTitle();
        System.out.println("Chrome browser open via selenium :"+driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close(); // closes the current window.
       // driver.quit();// closes all the windows associated to the driver.

    }
}
