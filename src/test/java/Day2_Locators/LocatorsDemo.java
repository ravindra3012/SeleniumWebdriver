package Day2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://sauce-demo.myshopify.com/");
//        driver.manage().window().maximize();              // to maximize the screen


        // By name
//        driver.findElement(By.name("q"));


        // By id
//        driver.findElement(By.id("search-field")).sendKeys("T-shirt");            // here finding search bar and input is send by .sendKeys
//        boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
//        System.out.println(logoDisplayStatus);

        // By linkText and partialLinkText

        // BY linkText
//        driver.findElement(By.linkText("About Us")).click();

        // By partialLinkText
//        driver.findElement(By.partialLinkText("About")).click();

//        interview Q- difference between linkText and partialLinkText
//        ans ---->We prefer linkText
//        both are same but
//        In linkText we have to pass full text value and In partialLinkText we have to pass some portion of text
//        When we use partialLinkText - If there are some links and there is nothing common in those links



//        TagName and className
//        - use for capture group of elements on the webpage

        // By className
//        List<WebElement> headerLink = driver.findElements(By.className("container upper"));       here it's not working couse this className is use list item
//        System.out.println("Total number of header links: "+headerLink.size());


        // By tagName
//        List<WebElement> allLinks = driver.findElements(By.tagName("a"));               // here a is tagname of all links
//        System.out.println("Total number of links on Webpage are "+allLinks.size());

//        List<WebElement> images = driver.findElements(By.tagName("img"));               // here img is tagname of all images
//        System.out.println("Total number of images on webpage are "+images.size());







        driver.quit();






    }
}
