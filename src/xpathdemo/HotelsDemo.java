package xpathdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HotelsDemo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hotels.com");

        WebElement txtCity = driver.findElement(By.xpath("//input[@id='qf-0q-destination']"));
        String city =  "Mumbai, India";
         // txtCity.sendKeys("Mumbai, India");
        // use java script ececutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+city+"')",txtCity);

        WebElement btnsearch = driver.findElement(By.xpath("//button[@type='submit']"));
        btnsearch.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@class,'property-name')]"));

        System.out.println(elements.size());
       // System.out.println(elements);

        for (int i=0;i<elements.size();i++)
            System.out.println(elements.get(i).getText());




    }
}
