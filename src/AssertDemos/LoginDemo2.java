package AssertDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginDemo2 {

    WebDriver driver;


    @BeforeMethod
    // the method written below the annotation @BeforeMethod
    // runs before every test method
    public void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
        txtUser.sendKeys("admin");

        WebElement txtPassword =  driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    // the method written below the annotation @AfterMethod
    // runs after every test method
    public void mymethod2()
    {
       // driver.close();
    }


    @Test
    public  void test1() {

       driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();


        String customerName="Amol12346";

        WebElement txtName = driver.findElement(By.xpath("//input[@id='name']"));
        txtName.sendKeys(customerName);

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']"));
        txtAddress.sendKeys("pune , Maharastra");

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@id='buyingrate']"));
        txtContact1.sendKeys("54545");

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@id='sellingrate']"));
        txtContact2.sendKeys("54545");


        WebElement btnSubmit = driver.findElement(By.xpath("//input[@value='Add']")); 
        btnSubmit.click();


        String expected = "[ "+customerName+" ] Customer Details Added !";
        String actual ="";

        try{
        WebElement msgBox = driver.findElement(By.xpath("//div[contains(@class,'box')]"));
        actual  = msgBox.getText();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("expected:"+expected);

        System.out.println("actual:"+actual);

        Assert.assertEquals(actual,expected,"wrong message");
    }


    @Test
    public  void test2() {

        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();


        String customerName="Amol12347";

        WebElement txtName = driver.findElement(By.xpath("//input[@id='name']"));
        txtName.sendKeys(customerName);

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']"));
        txtAddress.sendKeys("pune , Maharastra");

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@id='buyingrate']"));
        txtContact1.sendKeys("54545");

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@id='sellingrate']"));
        txtContact2.sendKeys("54545");


        WebElement btnSubmit = driver.findElement(By.xpath("//input[@value='Add']"));
        btnSubmit.click();


        String expected = "Customer Details Added";
        String actual ="";

        try{
            WebElement msgBox = driver.findElement(By.xpath("//div[contains(@class,'box')]"));
            actual  = msgBox.getText();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("expected:"+expected);

        System.out.println("actual:"+actual);


        boolean result = actual.contains(expected);

        Assert.assertTrue(result,"wrong message");

    }


    @Test
    public  void test3() {

        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();


        String customerName="Amol12346";

        WebElement txtName = driver.findElement(By.xpath("//input[@id='name']"));
        txtName.sendKeys(customerName);

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']"));
        txtAddress.sendKeys("pune , Maharastra");

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@id='buyingrate']"));
        txtContact1.sendKeys("54545");

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@id='sellingrate']"));
        txtContact2.sendKeys("54545");


        WebElement btnSubmit = driver.findElement(By.xpath("//input[@value='Add']"));
        btnSubmit.click();


        String expected = "Dublicat Entry. Please Verify";
        String actual ="";

        try{
            WebElement msgBox = driver.findElement(By.xpath("//div[contains(@class,'box')]"));
            actual  = msgBox.getText();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("expected:"+expected);

        System.out.println("actual:"+actual);

        Assert.assertEquals(actual,expected,"wrong message");
    }



}
