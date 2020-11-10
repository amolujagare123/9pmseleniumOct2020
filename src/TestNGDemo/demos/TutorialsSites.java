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

public class TutorialsSites extends BeforeAfterTestMethod {


    @Test (priority = 2)
    public void scriptingLogic()
    {
        driver.get("https://scriptinglogic.com");
    }

    @Test (priority = 1)
    public void tutorialsPoint()
    {
        driver.get("https://www.tutorialspoint.com/");
    }

    @Test (priority = 3)
    public void javatpoint()
    {
        driver.get("https://www.javatpoint.com/");

        Assert.assertEquals(true,false, "this test is failed");
    }
}
