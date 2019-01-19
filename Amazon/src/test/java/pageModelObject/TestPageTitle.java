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
    public void test1_urlForYourAmazon()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck1();
    }
    @Test
    public void test2_urlForTodayDeal()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck2();
    }
    @Test
    public void test3_urlForGiftCards()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck3();
    }
    @Test
    public void test4_urlForWholeFoods()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck4();
    }
    @Test
    public void test5_urlForRegistry()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck5();
    }
    @Test
    public void test6_urlForSell()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.titleCheck6();
    }
    @Test
    public void test7_urlForHelp()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        URL url = PageFactory.initElements(driver, URL.class);
        url.urlCheck7();
    }
}
