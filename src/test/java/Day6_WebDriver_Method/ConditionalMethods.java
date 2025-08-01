package Day6_WebDriver_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();


        // isDisplayed()
//        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"))
//        System.out.println("logo display status "+logo.isDisplayed());

        boolean logoStatus = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("logo display status "+logoStatus);


        // isEnabled()
        boolean enabledStatus = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("Enable Status "+enabledStatus);


        // isSelected()
        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Before selection......");
        System.out.println(male_rd.isSelected());       //false
        System.out.println(female_rd.isSelected());     //false

        System.out.println("After selecting male.....");
        male_rd.click();            // select radio button

        System.out.println(male_rd.isSelected());       //true
        System.out.println(female_rd.isSelected());     //false

        System.out.println("After selecting female.....");
        female_rd.click();            // select radio button

        System.out.println(male_rd.isSelected());       //false
        System.out.println(female_rd.isSelected());     //true
//  in radio button we can select single radio button


        boolean newsLetter = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
        System.out.println("news letter status: "+newsLetter);          //true (because it is already checked)








    }
}
