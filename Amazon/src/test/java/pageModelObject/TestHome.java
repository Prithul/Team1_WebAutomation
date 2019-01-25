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
    public void HomePageUrlCheck()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI cp = PageFactory.initElements(driver, CommonAPI.class);
        cp.getCurrentURL();
    }
    @Test
    public void HomePageTitleCheck()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI cp = PageFactory.initElements(driver, CommonAPI.class);
        cp.getPageTitle();
    }
    @Test
    public void ScrollDownToHomePage()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Test
    public void ScrollUpToHomePage()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("window.scrollBy(0,-250)", "");
    }
}
