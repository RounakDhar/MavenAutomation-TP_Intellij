package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\IntelliJ-BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        driver.get("https://the-internet.herokuapp.com/");

        JavascriptExecutor js =  (JavascriptExecutor) driver;
        Thread.sleep(3000);


        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a"));

        //js.executeScript("window.scrollBy(0,1000)");
        js.executeScript("arguments[0].scrollIntoView()",element);



    }
}
