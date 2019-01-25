package amex.tests;
import amex.pages.AmexHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAmexHomePage extends CommonAPI {

    @Test
    public void checkHomeTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AmexHomePage amexHomePage = new PageFactory().initElements(driver, AmexHomePage.class);
        Assert.assertEquals(driver.getTitle(), "American Express Credit Cards, Rewards, Travel and Business Services");
    }
    @Test
    public void checkHomeURL() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AmexHomePage amexHomePage = new PageFactory().initElements(driver, AmexHomePage.class);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.americanexpress.com/");
    }
    @Test
    public void checkSeachFieldOpenButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AmexHomePage amexHomePage = new PageFactory().initElements(driver, AmexHomePage.class);
         amexHomePage.openSearchField();
    }
    @Test
    public void closeSeachFieldOpenButton() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AmexHomePage amexHomePage = new PageFactory().initElements(driver, AmexHomePage.class);
        amexHomePage.openSearchField();
        sleepFor(2);
        amexHomePage.closeSearchField();
    }
}
