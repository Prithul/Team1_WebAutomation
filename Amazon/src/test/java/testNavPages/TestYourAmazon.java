package testNavPages;

import base.CommonAPI;
import navPages.YourAmazon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;


public class TestYourAmazon extends navPages.YourAmazon {

    @Test
    public void test21_clickOnDetails()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        YourAmazon yourAmazon = PageFactory.initElements(driver, YourAmazon.class);
        yourAmazon.clickOndetails();
    }

    @Test
    public void test22_createAmazonAccount()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        YourAmazon yourAmazon = PageFactory.initElements(driver, YourAmazon.class);
        yourAmazon.createAmazonAccount();
    }
}
