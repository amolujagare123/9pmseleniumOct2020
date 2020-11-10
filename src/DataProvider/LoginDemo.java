package DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDemo {

     @Test(dataProvider =  "getData")
    public void loginTest(String user,String pass) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
        txtUser.sendKeys(user);

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys(pass);

       /* WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();*/

        Thread.sleep(2500);
        driver.close();
    }

    @DataProvider
    public Object[][] getData()
    {
       Object[][] data = new Object[4][2];

        data[0][0] = "user-1";
        data[0][1] = "pass-1";

        data[1][0] = "user-2";
        data[1][1] = "pass-2";

        data[2][0] = "user-3";
        data[2][1] = "pass-3";

        data[3][0] = "user-4";
        data[3][1] = "pass-4";

        return  data;

    }


}
