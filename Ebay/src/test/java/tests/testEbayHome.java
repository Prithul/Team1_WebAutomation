package tests;

import EbayPom.EbayHome;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class testEbayHome extends EbayHome {
    EbayHome frontPage;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        frontPage = PageFactory.initElements(driver, EbayHome.class); }

        @Test
    public void test41() throws InterruptedException {
        searchMenu();
        }
    @Test
    public void test42() {
        clickOnHomeTab();
    }
    @Test
    public void test43(){
        clickOnSavedTab();
    }
    @Test
    public void test44(){
        clickOnMotorsTab();
    }
    @Test
    public void test45(){
        clickOnFashionTab();
    }
    @Test
    public void test46(){
        clickOnElectronicsTab();
    }
    @Test
    public void test47(){
        clickOnCollectandArtTab();
    }
    @Test
    public void test48(){
        clickOnHomeandGardenTab();
    }
    @Test
    public void test49(){
        isLogoDisplayed();
    }
    @Test
    public void test50(){
        findHelp();
    }
    @Test
    public void test51(){
        AlertNotification();
    }
    @Test
    public void test52(){
        dailyDealsTab();
    }
    @Test
    public void test53(){
        FAQBox();
    }
}
