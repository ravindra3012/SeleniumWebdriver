package Day1_Selenium_Introduction;

/*
1) Launch browser (chrome)
2) Open URL https://google.com/
3) Validate title should be "Google"
4) close browser
*/

import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {
    public static void main(String[] args) {

//        1) Launch browser (chrome)

        ChromeDriver driver = new ChromeDriver();
//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new EdgeDriver();



//        2) Open URL https://google.com/

        driver.get("https://google.com");


//        3) Validate title should be "Google"

        String actTitle = driver.getTitle();
        if (actTitle.equals("Google")){
            System.out.println("Title verification Passed...");
        }
        else{
            System.out.println("Title verification Failed...");
        }



//        4) close browser

//        driver.quit();




    }
}
