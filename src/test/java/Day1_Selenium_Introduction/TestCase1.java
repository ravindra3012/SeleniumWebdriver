package Day1_Selenium_Introduction;
/*
1) Launch browser (chrome)
2) Open URL https://demo.opencart.com/
3) Validate title should be "Your Store"
4) close browser
*/
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) {

//        1) Launch browser (chrome)

        ChromeDriver driver = new ChromeDriver();
//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new EdgeDriver();
//        WebDriver driver = new FirefoxDriver();



//        2) Open URL https://demo.opencart.com/

        driver.get("https://demo.opencart.com/");


//        3) Validate title should be "Your Store"

        String act_title = driver.getTitle();

        if (act_title.equals("Just a moment...")){
            System.out.println("Test case Passed...");
        }
        else {
            System.out.println("Test case Fail...");
        }


        //  4) Close browser

//        driver.close();
//        driver.quit();














    }
}
