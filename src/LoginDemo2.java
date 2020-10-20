import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo2 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4/");


        WebElement txtUser = driver.findElement(By.name("uid"));
        txtUser.sendKeys("mngr291088");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("uqArajE");

        WebElement btnLogin = driver.findElement(By.name("btnLogin"));
        btnLogin.click();


        driver.findElement(By.linkText("New Customer")).click();

        driver.findElement(By.name("name")).sendKeys("Amol Ujagare");

        driver.findElement(By.name("addr")).sendKeys("Abc \nxyz \nroad pune");

        driver.findElement(By.name("city")).sendKeys("pune");

        driver.findElement(By.name("state")).sendKeys("Maharastra");

        driver.findElement(By.name("pinno")).sendKeys("545454");

        driver.findElement(By.name("telephoneno")).sendKeys("656565");

        driver.findElement(By.name("emailid")).sendKeys("amol@gmail.com");

        driver.findElement(By.name("password")).sendKeys("xyz");

        driver.findElement(By.name("sub")).click();


    }
}
