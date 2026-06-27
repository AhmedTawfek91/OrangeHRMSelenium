package StepDefinitions;

import Pages.DashboardPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Objects;

import static Utils.Utils.*;

public class DashboardTest extends TestBase {

    DashboardPage dashboardPage;

    @When("User click on Admin link from side menu")
    public void Click_Admin_Link_POSITIVE()
    {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.clickAdminBtn();
    }

    @Then("User navigate to Admin screen")
    public void ASSERT_Navigation_To_AdminScreen()
    {
        softAssert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("admin/viewSystemUsers"));
    }
}
