package pageModelObject;

import base.CommonAPI;
import essentialUtility.URL;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestPageTitle extends CommonAPI {
    @Test
    public void urlForYourAmazon()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck1();
    }
    @Test
    public void urlForTodayDeal()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck2();
    }
    @Test
    public void urlForGiftCards()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck3();
    }
    @Test
    public void urlForWholeFoods()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck4();
    }
    @Test
    public void urlForRegistry()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck5();
    }
    @Test
    public void urlForSell()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck6();
    }
    @Test
    public void urlForHelp()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck7();
    }
}
