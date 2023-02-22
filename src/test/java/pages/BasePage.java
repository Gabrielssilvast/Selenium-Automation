package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.NoSuchElementException;

public abstract class BasePage {
    protected WebElement type;
    private WebDriver driver;

    public BasePage() {
//      https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
        System.setProperty("WebDriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/login");
        driver.manage().window().setSize(new Dimension(1000, 800));
    }
    public void visit(String url) {
        this.driver.get(url);
    }
    public String getCurrentUrl() {
        return this.driver.getCurrentUrl();
    }
    public void quitWebDriver() {
        this.driver.quit();
    }

    public WebElement findElement(By locator) {
        return this.driver.findElement(locator);
    }

    public void type(String input, By locator) {
        this.driver.findElement(locator).sendKeys(input);
    }

    public boolean isDisplayed(By locator) {
        try {
            return this.driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
        By locator1 = locator;
        public void click(By.ByXPath) {
            this.driver.findElement(locator).click();
        }
    }
    public String getText(By locator) {
        return this.driver.findElement(locator).getText();
    }
}