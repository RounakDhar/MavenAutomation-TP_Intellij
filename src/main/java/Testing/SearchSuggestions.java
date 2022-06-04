package Testing;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SearchSuggestions {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.firefox.driver","C:\\IntelliJ-BrowserDrivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\IntelliJ-BrowserDrivers\\chromedriver.exe");

        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
        Thread.sleep(2000);

        List<WebElement> suggestion_list = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[3]/div/div[2]/div[1]/span/b"));

       System.out.println(suggestion_list.size());
       Thread.sleep(2000);

       for(WebElement suggestion_name: suggestion_list){
           String suggestion_value = suggestion_name.getText();
           System.out.println(suggestion_value);
           if(suggestion_value.equalsIgnoreCase("selenium tutorial")){
               suggestion_name.click();
           }
       }



    }
}
