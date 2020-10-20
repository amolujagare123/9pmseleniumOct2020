import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://scriptinglogic.org");

        List<WebElement> elements = driver.findElements(By.className("elementor-button-wrapper"));

        System.out.println(elements.size());

        for(int i=0; i<elements.size();i++ )
         System.out.println(elements.get(i).getText());

    }
}
