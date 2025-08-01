package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsAssignment {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        // 1) use Locators Id, name, linkText, partialLinkText, tagName, className

        //id
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");

        //linkText
//        driver.findElement(By.linkText("nav-logo-sprites")).click();

        //partialLinkText
//        driver.findElement(By.partialLinkText("Car & Motor")).click();

        //tagName
        List<WebElement> linkCount = driver.findElements(By.tagName("a"));
        System.out.println("Total links on webPage "+linkCount.size());

        //className
        List<WebElement> count = driver.findElements(By.className("nav-li"));
        System.out.println("Total count of list items "+count.size());


        //2) use CSS selector tag id, tag class, tag attribute, tag class attribute

        //tag id selector
        driver.findElement(By.cssSelector("div#nav-cart-count-container")).click();

        // tag class selector
        driver.findElement(By.cssSelector("span.navFooterBackToTopText")).click();

        // tag attribute
        driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")).sendKeys("Laptop");

        // tag class attribute
        driver.findElement(By.cssSelector("input.nav-input[value=\"Go\"]")).click();

        //3) absolute xpath
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]/a[1]/img[1]")).click();

        //4) relative xpath

        // single attribute
        driver.findElement(By.xpath("//a[@class=\"nav-a  \"]")).click();

        // multiple attribute
        driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"][@aria-label=\"Amazon.in\"]")).click();

        // xpath with or
//        driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\" or @aria-label=\"Amazon.in\"]")).click();

        // xpath with and
        driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\" and @aria-label=\"Amazon.in\"]")).click();

        // xpath with text() method
        driver.findElement(By.xpath("//div[text()=\"Back to top\"]")).click();

        //xpath with contains() method
        driver.findElement(By.xpath("//input[contains(@id,\"twotabsearchtextbox\")]")).click();

        //xpath with starts-with() method
        driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')]")).click();








    }
}
