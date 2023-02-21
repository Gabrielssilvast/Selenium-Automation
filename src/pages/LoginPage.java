//Refatorando e encapsulando o projeto
public class LoginPage extends BasePage {
//    Locators
    private By emailAddressLocator = By.name("email");
    private By passwordLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    private By tagMyAccountLocator = By.tagName("h1");

    public void signin() {
        if(super.isDisplayed(emailAddressLocator)) {
            super.type("gabrielssilvast@gmail.com", emailAddressLocator);
            super.type("123456", passwordLocator);
            super.type.click(submitBtnLocator);
        }
            else {
                System.out.println("Email textbox was not present");
            }
        public String getMyAccountMessege() {
            return super.getText(tagMyAccountLocator);
            }
    }

}