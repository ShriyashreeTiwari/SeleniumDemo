package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//label[@class=\"customradio\"]/input[@value=\"user\"]/following-sibling::span")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//div[@id=\"myModal\"]//button[@id=\"okayBtn\"]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();

        Select dropdown = new Select(driver.findElement(By.cssSelector("select.form-control")));
        dropdown.selectByVisibleText("Consultant");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"ProtoCommerce Home\"]")));
        List<WebElement> list = driver.findElements(By.xpath("//button[text()=\"Add \"]"));

        for (WebElement w: list){
            w.click();
        }

        driver.findElement(By.xpath("//a[contains(text(),\"Checkout\") ]")).click();



    }
}
