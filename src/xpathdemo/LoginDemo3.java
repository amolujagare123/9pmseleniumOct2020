package xpathdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemo3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        txtUser.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@placeholder='Password']"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
        btnLogin.click();

 //click clients
        driver.findElement(By.xpath("//span[contains(normalize-space(),'Clients')]")).click();

//click view clients
        driver.findElement(By.xpath("//a[contains(normalize-space(),'View Clients')]")).click();

        Thread.sleep(3000);

        String clientName  ="Alex";

//click options
        driver.findElement(By.xpath("//tr[td/a[text()='"+clientName+"']]//div")).click();
        Thread.sleep(3000);
        //click edit icon
        driver.findElement(By.xpath("//tr[td/a[text()='"+clientName+"']]//i[contains(@class,'edit')]")).click();



    }
}
