package testNavPages;

import navPages.Help;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestHelp extends navPages.Help {
    @Test
    public void helpSearchBox()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Help help = PageFactory.initElements(driver, Help.class);
        help.getHelpSearch();
    }
    @Test
    public void helpYourOrders()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Help help = PageFactory.initElements(driver, Help.class);
        help.help1();
    }
    @Test
    public void helpReturnsAndRefunds()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Help help = PageFactory.initElements(driver, Help.class);
        help.help2();
    }
    @Test
    public void helpDigitalAndDevice()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Help help = PageFactory.initElements(driver, Help.class);
        help.help3();
    }
    @Test
    public void helpManagePrime()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Help help = PageFactory.initElements(driver, Help.class);
        help.help4();
    }
    @Test
    public void helpPayments()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Help help = PageFactory.initElements(driver, Help.class);
        help.help5();
    }
    @Test
    public void helpAccountSettings()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Help help = PageFactory.initElements(driver, Help.class);
        help.help6();
    }
}
