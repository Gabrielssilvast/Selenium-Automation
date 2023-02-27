import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPageTest extends LoginPage {
    private LoginPageTest loginPage;
    WebDriver driver = new ChromeDriver();
    private boolean tagMyAccountLocator;
    private final String url = "https://automationexercise.com/login";

    @BeforeEach
        void setUp() {
        this.loginPage = new LoginPageTest();
        this.loginPage.visit(this.url);
    }
    @AfterEach
        void tearDown() {
        this.loginPage.quitWebDriver();
    }
    @Test void test() {

//      When
        this.loginPage.signin();

//      Then
        Assertions.assertTrue(this.loginPage.tagMyAccountLocator().equals("Login to your account"));
        Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.url));
    }
    private Object tagMyAccountLocator() {
        return null;
    }
}
