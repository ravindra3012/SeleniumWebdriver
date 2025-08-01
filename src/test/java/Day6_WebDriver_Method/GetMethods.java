package Day6_WebDriver_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // get(url) 9 - opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
        Thread.sleep(5000);

        // getTitle() - returns title of the page
        System.out.println(driver.getTitle());

       // getCurrentUrl() - returns the URL of the page
        System.out.println(driver.getCurrentUrl());

       // getPageSource() - returns source code of the page
        System.out.println(driver.getPageSource());

        // getWindowHandle() - returns ID of the single browser window
        String windowid = driver.getWindowHandle();
        System.out.println("window id "+windowid);


//        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();


        // getWindowHandles() - returns ID's of the multiple browser windows
        Set<String> windowids = driver.getWindowHandles();
        System.out.println("multiple windows ids "+windowids);






    }
}
