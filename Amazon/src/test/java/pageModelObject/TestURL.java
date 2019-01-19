package pageModelObject;

import base.CommonAPI;
import essentialUtility.URL;
import navPages.TodayDeal;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestURL extends essentialUtility.URL {

    @Test
    public void test1_urlForYourAmazon()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck1();
    }
    @Test
    public void test2_urlForTodayDeal()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck2();
    }
    @Test
    public void test3_urlForGiftCards()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck3();
    }
    @Test
    public void test4_urlForWholeFoods()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck4();
    }
    @Test
    public void test5_urlForRegistry()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck5();
    }
    @Test
    public void test6_urlForSell()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck6();
    }
    @Test
    public void test7_urlForHelp()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck7();
    }
}
