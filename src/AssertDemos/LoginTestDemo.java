package AssertDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestDemo {
    WebDriver driver;


    @BeforeClass
    // the method written below the annotation @BeforeClass
    // runs before first test method of the class
    public  void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    // the method written below the annotation @AfterClass
    // runs After last test method of the class
    public  void mymethod2() throws InterruptedException {

       // Thread.sleep(4000);
       // driver.close();
    }


    @Test
    public  void test1() throws InterruptedException {

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
        txtUser.sendKeys("admin");

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
/*
       // --- using url

        String expected = "http://stock.scriptinglogic.net/dashboard.php";
        // how can i get the actual url as a string ..... ?
        String actual = driver.getCurrentUrl();

       // boolean result = expected.equalsIgnoreCase(actual);

        */

        // --- using Page title

        String expected = "POSNIC - Dashboard";

        String actual = driver.getTitle();

        System.out.println("Actual result:"+actual);

        Assert.assertEquals(actual,expected,"page title is not as expected");


    }

    @Test
    public  void test2() throws InterruptedException {

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
        txtUser.sendKeys("admin1");

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        String expected = "Dashboard";
        String actual ="";

        try {

            WebElement lblDashboard = driver.findElement(By.xpath("//a[contains(@class,'active')]"));

            //Note : while finding the element try not to use the same text in the locator,
            // when you are trying to get the text out of it for comparison
            // for example  //a[text()='Dashboard']
            // driver.findElement(By.linkText("Dashboard"));
            actual = lblDashboard.getText();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("actual="+actual);


        Assert.assertEquals(actual,expected,"the dashboard text is absent");

    }
}
