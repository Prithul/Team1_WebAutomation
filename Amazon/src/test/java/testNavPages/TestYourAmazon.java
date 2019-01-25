package testNavPages;

import navPages.YourAmazon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestYourAmazon extends navPages.YourAmazon {
    @Test
    public void ClickOnDetails()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        YourAmazon yourAmazon = PageFactory.initElements(driver, YourAmazon.class);
        yourAmazon.clickOndetails();
    }
    @Test
    public void CreateAmazonAccount()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        YourAmazon yourAmazon = PageFactory.initElements(driver, YourAmazon.class);
        yourAmazon.createAmazonAccount();
    }
}
