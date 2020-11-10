package ExtentReportDemo.ScreenShotsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BeforeAfterTestMethod {

    public static WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    // the method written below the annotation @BeforeMethod
    // runs before every test method
    public void mymethod1(String browserName)
    {

        if(browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if(browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }


        driver.manage().window().maximize();
    }

    @AfterMethod
    // the method written below the annotation @AfterMethod
    // runs after every test method
    public void mymethod2()
    {
        driver.close();
    }
}
