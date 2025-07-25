package Day2_Locators;

/*
Assignment-
-----------
Open application https://demo.nopcommerce.com/

1) Total number of links
2) Total number of images
3) Click on any product link using linkText/partialLinkText
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators_Assignment {
    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        List<WebElement> linkCount = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links in webpage: "+linkCount.size());


        List<WebElement> imgCount = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images on webpage: "+imgCount.size());

        driver.findElement(By.linkText("Apple MacBook Pro")).click();











    }
}
