package Day6_WebDriver_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();  // this will open new browser window

        Thread.sleep(5000);

//        driver.close();           // close single browser window where driver is focus
        driver.quit();              // close all browser window
    }
}
