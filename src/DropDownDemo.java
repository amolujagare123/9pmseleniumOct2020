import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lifepartner.in/");

        WebElement drpStatus = driver.findElement(By.name("ms"));

        Select selStatus = new Select(drpStatus);

        //selStatus.selectByVisibleText("Never married");

       // selStatus.selectByValue("7");

        selStatus.selectByIndex(1);

    }
}
