import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadio {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");


     //    select  1st & 3rd check box

        WebElement checkBox0 = driver.findElement(By.id("check0"));
        WebElement checkBox1 = driver.findElement(By.id("check1"));
        WebElement checkBox2 = driver.findElement(By.id("check2"));

        Thread.sleep(4000);

        if(!checkBox0.isSelected())
         checkBox0.click();

        if(!checkBox1.isSelected())
        checkBox1.click();

        if(!checkBox2.isSelected())
            checkBox2.click();

        // click on the checkbox which is not selected
        // 2nd radio button

        WebElement radio0 = driver.findElement(By.id("rad0"));
        WebElement radio1 = driver.findElement(By.id("rad1"));
        WebElement radio2 = driver.findElement(By.id("rad2"));

        radio1.click();




    }
}
