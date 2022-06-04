package Testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\IntelliJ\\IntelliJ-BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://jqueryui.com/droppable/");

        TakesScreenshot take_screenshot = (TakesScreenshot) driver;
        WebElement development_element = driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[5]/a"));

        //File src = take_screenshot.getScreenshotAs(OutputType.FILE);
        File dev_file = development_element.getScreenshotAs(OutputType.FILE);

        //FileHandler.copy(src,new File("C:\\IntelliJ\\screenshot\\sc1.png"));
        FileHandler.copy(dev_file,new File("C:\\IntelliJ\\screenshot\\sc2.png"));

        driver.quit();


    }
}
