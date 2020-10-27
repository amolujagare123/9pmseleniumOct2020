package TestNGDemo.demos;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsSites {
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
    public void mymethod2() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

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
    }
}
