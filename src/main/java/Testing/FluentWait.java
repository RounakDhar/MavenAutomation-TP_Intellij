package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\IntelliJ-BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(5000);

        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]"));
        System.out.println(dropdown2.getText());

////        //Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
////                .withTimeout(Duration.ofSeconds(30))
////                .pollingEvery(Duration.ofSeconds(5))
////                .ignoring(NoSuchElementException.class);
////
////        //WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
////            public WebElement apply(WebDriver driver) {
////                return driver.findElement(By.id("foo"));
////            }
//        });


        dropdown2.click();
        driver.quit();




    }
}
