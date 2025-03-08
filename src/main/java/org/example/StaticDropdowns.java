package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class StaticDropdowns {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdownElement = new Select(dropdown);
        dropdownElement.selectByIndex(3);
        Assert.assertEquals(dropdownElement.getFirstSelectedOption().getText(),"USD");
        dropdownElement.selectByValue("AED");
        dropdownElement.selectByVisibleText("INR");

        // using loop for repetitive method
        driver.findElement(By.id("divpaxinfo")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        int i=1;
        while(i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        System.out.println("Print total no. of passenger selected: "+  driver.findElement(By.id("divpaxinfo")).getText());
        driver.close();
    }



}


