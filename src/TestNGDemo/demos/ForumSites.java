package TestNGDemo.demos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForumSites {
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
    public void quora()
    {
        driver.get("https://quora.com");
    }

    @Test
    public void stackoverflow()
    {
        driver.get("https://stackoverflow.com");
    }

    @Test
    public void sqaforums()
    {
        driver.get("http://www.sqaforums.com/");
    }
}
