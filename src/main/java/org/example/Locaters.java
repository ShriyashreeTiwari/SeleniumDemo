package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Locaters {
    public static void main(String[] args) throws InterruptedException {

        String name ="rahul";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        String password= getPassword(driver);

        driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,\"submit\")]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(  driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();

    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        String passText= driver.findElement(By.cssSelector("form p")).getText();
        //passText= Please use temporary password 'rahulshettyacademy' to Login.
        String pass[]= passText.split("'");
        return pass[1];

    }


}
