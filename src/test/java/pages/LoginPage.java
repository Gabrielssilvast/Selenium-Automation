package pages;

import org.openqa.selenium.By;

//Refatorando e encapsulando o projeto
public class LoginPage extends BasePage {
    private By emailAddressLocator = By.name("email");
    private By passwordLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    public By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    private By tagMyAccountLocator = By.tagName("h1");
    public java.lang.String signin() {
        if(super.isDisplayed(emailAddressLocator)) {
            super.type("gabrielssilvast@gmail.com", emailAddressLocator);
            super.type("123456", passwordLocator);
            super.type.click(submitBtnLocator);
        }else {
                System.out.println("Email textbox was not present");
            }
        public String getMyAccountMessege() {
            return super.getText(tagMyAccountLocator);
            }
    }

}