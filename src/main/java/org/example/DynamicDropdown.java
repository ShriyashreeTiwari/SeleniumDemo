package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[text()=\" Bengaluru (BLR)\"]")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        //using indexing for handling dynamic
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
     //  driver.findElement(By.xpath("(//a[text()=\" Bhopal (BHO)\"])[2]")).click();
     //improvised xpath of above element.
        driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[text()=\" Bhopal (BHO)\"]")).click();


        //AutoSuggestive
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        List<WebElement> list = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));

        for(WebElement option: list){
            if(option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }



    }
}
