package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
    @Test
    public void test () {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.quit();

    }


}
