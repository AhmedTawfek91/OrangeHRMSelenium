package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By userNameField = By.xpath("//input[@placeholder='Username']");
    By passwordField = By.xpath("//input[@placeholder='Password']");
    By loginBtn = By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button");

    public void fillUserNameField(String UN)
    {
        waitForVisibility(userNameField);
        driver.findElement(userNameField).sendKeys(UN);
    }

    public void fillPasswordField(String PW)
    {
        waitForVisibility(passwordField);
        driver.findElement(passwordField).sendKeys(PW);
    }

    public void clickLoginBtn()
    {
        waitForVisibility(loginBtn);
        driver.findElement(loginBtn).click();
    }

}
