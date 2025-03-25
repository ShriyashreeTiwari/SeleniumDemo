package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//div[@class=\"form-group\"]/input[@name=\"name\"]")).sendKeys("Shriya");
        driver.findElement(By.xpath("//div[@class=\"form-group\"]/input[@name=\"email\"]")).sendKeys("xyx@email.com");
        driver.findElement(By.xpath("//div[@class=\"form-group\"]/input[@id=\"exampleInputPassword1\"]")).sendKeys("XYz1234@");
        driver.findElement(By.xpath("//input[@id=\"exampleCheck1\"]")).click();
        Select item = new Select( driver.findElement(By.id("exampleFormControlSelect1")));
        item.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio2")).click();
        Assert.assertTrue(driver.findElement(By.id("inlineRadio2")).isSelected());
        driver.findElement(By.cssSelector("input[name=\"bday\"]")).sendKeys("01-01-1998");
        driver.findElement(By.cssSelector("input.btn.btn-success")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText());




    }
}
