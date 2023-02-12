import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    WebDriver driver = new ChromeDriver();

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("WebDriver.chrome.driver", "drivers/chromedriver.exe");
        driver.get("https://automationexercise.com/login");
        driver.manage().window().setSize(new Dimension(1000, 1000));
    }

//    @AfterEach
//    void tearDown() throws Exception {
//        driver.quit();
//    }

    @Test
    void test() {
        WebElement emailAddressLocator = driver.findElement(By.name("email"));
//        new WebDriverWait(driver, Duration.ofSeconds(5));
        emailAddressLocator.sendKeys("gabrielssilvast@gmail.com");

        WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
        passwordElement.sendKeys("123456");

        WebElement loginLocator = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        loginLocator.click();

//        WebElement tagLogout = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
//        String ConfirmLogin = tagLogout.getText();
//
//        Assertions.assertTrue(ConfirmLogin.equals("Logout"));
    }

    }