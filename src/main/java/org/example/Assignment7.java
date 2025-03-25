package main.java.org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        String text =driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
        System.out.println(text);

        Select dd = new Select(driver.findElement(By.id("dropdown-class-example")));
        dd.selectByVisibleText(text);

        driver.findElement(By.name("enter-name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();

        Alert a = driver.switchTo().alert();
        Assert.assertTrue(a.getText().contains(text));







    }


}
