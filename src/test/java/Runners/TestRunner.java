package Runners;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        glue="StepDefinitions",
        features = "src/main/resources/Features",
        plugin = {"pretty",
                "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/cucumber.json"}
)
public class TestRunner extends TestBase {

    @Override
    @DataProvider(parallel = false)
    public Object [][] scenarios()
    {
        return super.scenarios();
    }
}
