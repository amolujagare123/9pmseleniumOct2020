package TestNGDemo.demos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SocialSites {

    WebDriver driver;
    @BeforeMethod
    // the method written below the annotation @BeforeMethod
    // runs before every test method
    public void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    // the method written below the annotation @AfterMethod
    // runs after every test method
    public void mymethod2()
    {
        driver.close();
    }

    @Test
    public void facebook()
    {
        driver.get("https://facebook.com");
    }

    @Test
    public void twitter()
    {
        driver.get("https://twitter.com");
    }

    @Test
    public void instagram()
    {
        driver.get("http://www.instagram.com/");
    }
}
