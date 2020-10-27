package Junitdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login3 {

    static WebDriver driver;


    @BeforeClass
    // the method written below the annotation @BeforeClass
    // runs before first test method of the class
    public static void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    // the method written below the annotation @AfterClass
    // runs After last test method of the class
    public static void mymethod2() throws InterruptedException {

       Thread.sleep(4000);
        driver.close();
    }


    @Test
    public  void test1() throws InterruptedException {

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
        txtUser.sendKeys("admin");

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
       // btnLogin.click();

        Thread.sleep(2000);
    }

    @Test
    public  void test2() throws InterruptedException {


        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
        txtUser.sendKeys("gfg");

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("fgfg");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
       // btnLogin.click();

        Thread.sleep(2000);

    }


    @Test
    public  void test3() throws InterruptedException {


        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
        txtUser.sendKeys("");

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        //btnLogin.click();

        Thread.sleep(2000);

    }
}
