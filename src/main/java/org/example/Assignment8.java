package main.java.org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment8 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)") ;

        //get rows
        List<WebElement> list = driver.findElements(By.xpath("//table[@name=\"courses\"]//tr"));
        System.out.println("No. of rows present in table : "+ list.size());
        //get columns
        List<WebElement>list2 = driver.findElements(By.xpath("//table[@name=\"courses\"]//th"));
        System.out.println("No. of column present in the table : "+ list2.size());

        WebElement secondRow = driver.findElement(By.xpath("//table[@name=\"courses\"]//tr[2]"));
        List<WebElement> elementList=  secondRow.findElements(By.tagName("td"));
        for(WebElement e : elementList)
        {
            System.out.println(e.getText());
        }




    }

}
