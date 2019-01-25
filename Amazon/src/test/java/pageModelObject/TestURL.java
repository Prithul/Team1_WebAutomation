package pageModelObject;

import essentialUtility.URL;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestURL extends essentialUtility.URL {
    @Test
    public void urlForYourAmazon()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck1();
    }
    @Test
    public void urlForTodayDeal()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck2();
    }
    @Test
    public void urlForGiftCards()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck3();
    }
    @Test
    public void urlForWholeFoods()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck4();
    }
    @Test
    public void urlForRegistry()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck5();
    }
    @Test
    public void urlForSell()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck6();
    }
    @Test
    public void urlForHelp()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck7();
    }
}
