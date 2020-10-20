import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectList {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");

        WebElement multiselectList = driver.findElement(By.id("multiSel"));

        Select selMultiSelectList = new Select(multiselectList);

        selMultiSelectList.selectByIndex(0);

        Thread.sleep(4000);

        selMultiSelectList.selectByIndex(1);

        Thread.sleep(4000);
        selMultiSelectList.selectByIndex(3);

        Thread.sleep(4000);
       /* selMultiSelectList.deselectByIndex(1);
        selMultiSelectList.deselectByVisibleText("text 1");*/

        selMultiSelectList.deselectAll();


    }
}
