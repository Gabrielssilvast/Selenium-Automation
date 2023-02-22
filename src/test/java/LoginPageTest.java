import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPageTest {
    private LoginPageTest loginPage;
    WebDriver driver = new ChromeDriver();
    private boolean tagMyAccountLocator;

    private void visit(String url){}

    @BeforeEach
        void setUp() {
        loginPage = new LoginPageTest();
        String url = "https://automationexercise.com/login";
        loginPage.visit(url);
    }

//    @AfterEach
//        void tearDown() {
//        driver.quit();
//    }

        @Test
        void test() {

//        When

//        Then
          Assertions.assertTrue(this.loginPage.tagMyAccountLocator().equals("My Account"));

        }

    }

}
