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

public class SocialSites extends BeforeAfterTestMethod {



    @Test
    public void facebook()
    {
        driver.get("https://facebook.com");
    }

    @Test
    public void twitter()
    {
        driver.get("https://twitter.com");

        Assert.assertEquals(true,false, "this test is failed");
    }

    @Test
    public void instagram()
    {
        driver.get("http://www.instagram.com/");
    }
}
