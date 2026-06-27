package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver)
    {
        this.driver=driver;
    }

    public void waitForVisibility(By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void takeScreenShot(String fileName, String timeStamp)
    {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        String filePath = "src/main/resources/ScreenShots/" + "_" + fileName + "_" + timeStamp;
        try{
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(filePath);
            FileUtils.copyFile(source, destination);
            System.out.println("File saved in: " + filePath);
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
