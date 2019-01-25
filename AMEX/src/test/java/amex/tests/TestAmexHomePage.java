package amex.tests;
import amex.pages.AmexHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmexHomePage extends CommonAPI {

    @Test
    public void checkHomeTitle() {
        AmexHomePage amexHomePage = new PageFactory().initElements(driver, AmexHomePage.class);
        Assert.assertEquals(driver.getTitle(), "American Express Credit Cards, Rewards, Travel and Business Services");
    }
    @Test
    public void checkHomeURL() {
        AmexHomePage amexHomePage = new PageFactory().initElements(driver, AmexHomePage.class);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.americanexpress.com/");
    }
    @Test
    public void checkSeachFieldOpenButton() {
        AmexHomePage amexHomePage = new PageFactory().initElements(driver, AmexHomePage.class);
         amexHomePage.openSearchField();
    }
    @Test
    public void closeSeachFieldOpenButton() throws InterruptedException{
        AmexHomePage amexHomePage = new PageFactory().initElements(driver, AmexHomePage.class);
        amexHomePage.openSearchField();
        sleepFor(2);
        amexHomePage.closeSearchField();
    }
}
