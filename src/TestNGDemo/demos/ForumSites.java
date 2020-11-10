package TestNGDemo.demos;

import ExtentReportDemo.ScreenShotsDemo.BeforeAfterTestMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ForumSites extends BeforeAfterTestMethod {


    @Test
    public void quora()
    {
        driver.get("https://quora.com");

        Assert.assertEquals(true,false,"this test is failed");
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
