package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()=\"Multiple Windows\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parent = it.next();
        String child = it.next();
         driver.switchTo().window(child);
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.tagName("h3")).getText());


    }


}
