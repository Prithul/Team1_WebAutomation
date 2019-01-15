package tests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.NavPage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NavPageTest extends CommonAPI {
    NavPage navPage;

    @Test
    public void checkEachNavItem()throws InterruptedException {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        List<WebElement> list = navPage.navigationArrayList();
        for(WebElement l:list)
        {
            homePage.navPageButton.click();
            l.click();
            sleepFor(2);
            homePage.goCnn();
        }

    }
    @Test
    public void checkEachNavItemTitle
}
