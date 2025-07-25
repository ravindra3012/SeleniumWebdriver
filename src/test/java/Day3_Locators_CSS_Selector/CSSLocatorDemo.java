package Day3_Locators_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // By tag#id selector
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac Book Pro");
        // By #id selector
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mac Book Pro");


        // By tag.className selector
        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mac Book Pro");
        // By .className selector
        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Mac Book Pro");


        // By tag[attribute="value"] selector
        driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Mac Book Pro");
        // By [attribute="value"] selector
        driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("Mac Book Pro");


        // By  tag.class[attribute="value"]
        driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("Mac Book Pro");
        // By .class[attribute="value"]
        driver.findElement(By.cssSelector(".search-box-text[placeholder=\"Search store\"]")).sendKeys("Mac Book Pro");









    }
}
