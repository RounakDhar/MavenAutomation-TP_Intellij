package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\IntelliJ-BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(5000);

        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]"));
        System.out.println(dropdown2.getText());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        dropdown2.click();
        driver.quit();




    }
}
