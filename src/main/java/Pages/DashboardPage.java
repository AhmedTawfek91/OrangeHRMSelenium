package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DashboardPage extends PageBase{
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    By sideMenuItems = By.className("oxd-main-menu-item");



    public void clickAdminBtn()
    {
        waitForVisibility(sideMenuItems);
        List<WebElement> menuList = driver.findElements(sideMenuItems);
        if(!menuList.isEmpty())
        {
            Actions action = new Actions(driver);
            action.moveToElement(menuList.get(0)).build().perform();
            menuList.get(0).click();
        }
    }
}
