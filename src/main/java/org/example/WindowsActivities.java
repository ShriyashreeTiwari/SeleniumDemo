package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");

        driver.navigate().to("https://rahulshettyacademy.com");

        driver.navigate().back();

        driver.navigate().forward();

    }
    
}
