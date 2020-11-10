package DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginDemoExcel {

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
    public Object[][] getData() throws IOException {

        FileInputStream fp = new FileInputStream("Data\\mydata.xls") ;

        HSSFWorkbook workbook = new HSSFWorkbook(fp);

        HSSFSheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2];

        for(int i=0;i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

            HSSFCell username = row.getCell(0);
            data[i][0] = username.toString().trim();

            HSSFCell password = row.getCell(1);
            data[i][1] = password.toString().trim();

        }



        return  data;

    }


}
