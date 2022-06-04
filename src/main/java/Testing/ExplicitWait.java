package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\IntelliJ-BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(5000);

        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]"));
        System.out.println(dropdown2.getText());

       WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.
               elementToBeClickable(By.xpath("//*[@id=\"dropdown\"]/option[2]")));

        dropdown2.click();
        driver.quit();




    }
}
