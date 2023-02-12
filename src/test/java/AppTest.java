import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AppTest {

    @Test

    public void helloSelenium() {
        //https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
        System.setProperty("WebDriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/login");
        driver.manage().window().setSize(new Dimension(1000, 1000));


        String currentUrl = driver.getCurrentUrl();
        String expected = "https://automationexercise.com/login";

        Assertions.assertEquals(expected, currentUrl);


//        driver.quit();

    }

}