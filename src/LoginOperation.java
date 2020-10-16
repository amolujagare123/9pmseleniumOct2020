import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOperation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net");


     WebElement txtUsername = driver.findElement(By.id("login-username"));
     txtUsername.sendKeys("admin");

     WebElement txtPass = driver.findElement(By.name("password"));
     txtPass.sendKeys("admin");

     WebElement btnLogin = driver.findElement(By.name("submit"));
     btnLogin.click();

    }
}
