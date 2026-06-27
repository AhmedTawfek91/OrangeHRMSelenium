package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static Utils.Environments.*;

import java.util.HashMap;
import java.util.Map;

public class TestBase extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeTest
            public void initiateBrowser()
    {
        ChromeOptions opt = new ChromeOptions();
        boolean isCI = System.getenv("CI") != null || System.getenv("TF_BUILD") != null;
        if(isCI)
        {
            opt.addArguments("--headless");
            opt.addArguments("--no-sandbox");
            opt.addArguments("--disable-dev-shm-usage");
            opt.addArguments("--disable-gpu");
            opt.addArguments("--window-size=1920,1080");
            opt.addArguments("--remote-debugging-port=9222");
        }
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("password_manager_enabled", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        opt.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(opt);
        System.out.println("Connecting to: " + BASE_URL);
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

//    @AfterTest
//    public void closeBrowser()
//    {
//        driver.quit();
//    }

}
