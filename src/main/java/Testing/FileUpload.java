package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\IntelliJ-BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        Thread.sleep(3000);

        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\ASUS\\Pictures\\Screenshots\\Screenshot (130).png");
        Thread.sleep(3000);

        driver.findElement(By.id("file-submit")).click();

        driver.quit();



    }
}
