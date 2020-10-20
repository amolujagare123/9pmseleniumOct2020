import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net");

        List<WebElement> elements = driver.findElements(By.tagName("input"));

        System.out.println(elements.size());

        elements.get(0).sendKeys("admin");
        elements.get(1).sendKeys("admin");
        elements.get(2).click();


    }
}
