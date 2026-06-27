package StepDefinitions;

import Pages.LoginPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Objects;

import static Utils.Environments.*;
import static Utils.Utils.*;

public class LoginTest extends TestBase {

    LoginPage loginPage;

    @When("User insert user name and password and click login")
    public void Login_POSITIVE()
    {
        loginPage = new LoginPage(driver);
        loginPage.fillUserNameField(LOGIN_USER_NAME);
        loginPage.fillPasswordField(LOGIN_PASSWORD);
        loginPage.clickLoginBtn();
    }

    @Then("User should navigate to dashboard screen")
    public void ASSERT_Navigation_To_DashboardScreen()
    {
        softAssert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("dashboard"));

    }
}
