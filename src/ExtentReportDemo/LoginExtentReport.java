package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static ExtentReportDemo.ScreenShotsDemo.MyRepors.takescreenshot;

public class LoginExtentReport {

 WebDriver driver;
    ExtentReports extent;
    @BeforeClass
    public void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // initializing part of the extent report

        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");

        reporter.config().setReportName("All project tests");
        reporter.config().setDocumentTitle("Regression Tests");

        extent  = new ExtentReports();

        extent.attachReporter(reporter);


        extent.setSystemInfo("developers name","amol ujagare");
        extent.setSystemInfo("testers name","priyanka");
        extent.setSystemInfo("project name","billing");
        extent.setSystemInfo("Start Date","05/11/2020");

    }


    @Test
    public void loginTest() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("loginTestValid");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
        txtUser.sendKeys("admin");

        test.info("username is set");

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        test.info("password is set");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
         btnLogin.click();
        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String expected  = "http://stock.scriptinglogic.net/dashboard1.php";
        String actual= driver.getCurrentUrl();


         driver.findElement(By.xpath("//a[contains(@class,'logoff')]")).click();


         try {
             Assert.assertEquals(actual, expected, "this is not a dashboard");
             test.pass("Test is passed");
         }
         catch (AssertionError e )
         {
             test.fail(e.getMessage());

             test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));

         }

    }


    @Test
    public void loginTest1() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("loginTestInValid");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
        txtUser.sendKeys("ddsds");

        test.info("username is set");

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("dsds");

        test.info("password is set");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // driver.findElement(By.xpath("//a[contains(@class,'logoff')]")).click();


        String expected  = "http://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual= driver.getCurrentUrl();


        //driver.findElement(By.xpath("//a[contains(@class,'logoff')]")).click();


        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("Test is passed");
        }
        catch (AssertionError e )
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));

        }


    }

   @AfterClass
    public void mytestEnds()
    {
        extent.flush();
    }




}
