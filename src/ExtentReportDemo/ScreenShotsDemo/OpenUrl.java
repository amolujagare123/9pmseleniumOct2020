package ExtentReportDemo.ScreenShotsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OpenUrl {

    @Test
    public  void test1() throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://instagram.com");

        // 1. create a refernce of an Interface  TakesScreenshot
        // assign the driver to it
         TakesScreenshot ts = (TakesScreenshot) driver;

         // 2. create object file using the method  getScreenshotAs
         File scrFile = ts.getScreenshotAs(OutputType.FILE);

         String timeStamp = new SimpleDateFormat("_dd_MM_yyyy_hh_mm_ss").format(new Date());

         String imageName="image"+timeStamp+".png";

        // 3. lets convert the object of file into an image (copy object into real image)
        FileUtils.copyFile(scrFile,new File("D:\\eveningbatch\\"+imageName));

    }
}
