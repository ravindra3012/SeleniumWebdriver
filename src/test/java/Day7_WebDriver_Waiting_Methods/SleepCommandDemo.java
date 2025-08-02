package Day7_WebDriver_Waiting_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommandDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        Thread.sleep(5000);     // when you comment this statement the program is not working because of synchronization problem

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");























    }
}
