package Junitdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    @Test
    public void loginTest1()
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4/");

        WebElement txtUser = driver.findElement(By.name("uid"));
        txtUser.sendKeys("mngr291088");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("uqArajE");

        WebElement btnLogin = driver.findElement(By.name("btnLogin"));
        btnLogin.click();

    }

    @Test
    public void loginTest2()
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4/");

        WebElement txtUser = driver.findElement(By.name("uid"));
        txtUser.sendKeys("hghgh");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("hgh");

        WebElement btnLogin = driver.findElement(By.name("btnLogin"));
        btnLogin.click();

    }
    @Test
    public void loginTest3()
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4/");

        WebElement txtUser = driver.findElement(By.name("uid"));
        txtUser.sendKeys("");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("btnLogin"));
        btnLogin.click();

    }

}
