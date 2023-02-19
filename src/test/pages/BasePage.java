

public abstract class BasePage {

    private WebDriver driver;


    public BasePage(){
//        https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
        System.setProperty("WebDriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/login");
        driver.manage().window().setSize(new Dimension(1000, 800));
    }

    public void visit(String url){
        this.driver.get(url);
    }
    publi STRING getCurrentUrl(){
        return this.driver.getCurrentUrl();
    }
    public void quitWebDriver() {
//        this.driver.quit();
    }
    public WebElement findElement(By locator){
        return this.driver.findElement(locator);
    }
    public void type(String input, By locator);{
        this.driver.findElement(locator).sendKeys(input);
    }
    public boolean isDisplayed(By locator){
        try{

        } catch (NoSuchElementException e){
            return false;
        }
    }
    public void click(By locator){
        this.driver.findElement(locator).click();
    }

    public String getText(By locator){
        this.driver.findElement.(locator).getText();
    }

}