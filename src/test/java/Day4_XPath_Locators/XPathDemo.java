package Day4_XPath_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // XPath with single attribute
//        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");

        // XPath with multiple attribute
//        driver.findElement(By.xpath("//input[@name=\"q\"][@placeholder=\"Search store\"]")).sendKeys("Mobile");


        // XPath with 'and' operator      - in 'and' operator both attribute should be correct
//        driver.findElement(By.xpath("[@name=\"q\" and @placeholder=\"Search store\"]")).sendKeys("Mobile");

        // XPath with 'or' operator       - in 'or' operator only one attribute need correct
//        driver.findElement(By.xpath("[@name=\"q\" or @placeholder=\"Search store\"]")).sendKeys("Mobile");


        // XPath with text() method -    work only with inner text and links
        // when you have inner text then you use text() method
//        driver.findElement(By.xpath("//*[text()='Computers']")).click();

//        boolean displayStatus=driver.findElement(By.xpath("//strong[.='Featured products']")).isDisplayed();
//        System.out.println(displayStatus);

//        String value=driver.findElement(By.xpath("//strong[.='Featured products']")).getText();
//        System.out.println(value);


        // XPath with contain() method

//        driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Mobile");


        // xpath with stats-with() method

//        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Mobile");



        // chained xpath
        // attribute is not available then we use attribute of parent
        // this is also relational and absolute xpath combination
        boolean imgStatus = driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
        System.out.println(imgStatus);



















    }
}
