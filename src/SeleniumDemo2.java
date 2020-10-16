import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();
    }
}
