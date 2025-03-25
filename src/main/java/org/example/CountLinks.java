package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CountLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriyashreeT\\Downloads\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        WebElement footer= driver.findElement(By.id("gf-BIG"));  //descoping
        System.out.println(footer.findElements(By.tagName("a")).size());

        WebElement column= footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println( column.findElements(By.tagName("a")).size());
        //click on links

        for(int i=0; i<column.findElements(By.tagName("a")).size();i++){

            String clickOnTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
            column.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
            Thread.sleep(2000);
        }

      Set<String> windows =  driver.getWindowHandles();
        Iterator <String>iterator = windows.iterator();
        while(iterator.hasNext()){
           driver.switchTo().window( iterator.next());
            String title = driver.getTitle();
            System.out.println(title);
        }



    }


}
