//Refatorando o projeto.
public class LoginPage extends BasePage {
//    Locators
    private By emailAddressLocator = By.name("email");
    private By passwordLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");

    public void signin() {
        if(super.isDisplayed(emailAddressLocator)) {

        }

    }




}