package pageModelObject;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestHome extends CommonAPI {

    @Test
    public void test1_homePageUrlCheck()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI cp = PageFactory.initElements(driver, CommonAPI.class);
        cp.getCurrentURL();
    }
    @Test
    public void test2_homePageTitleCheck()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI cp = PageFactory.initElements(driver, CommonAPI.class);
        cp.getPageTitle();
    }
    @Test
    public void test18_scrollDownToHomePage()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Test
    public void test18_scrollUpToHomePage()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("window.scrollBy(0,-250)", "");
    }
}
