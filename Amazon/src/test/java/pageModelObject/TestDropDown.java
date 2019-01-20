package pageModelObject;

import essentialUtility.DropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestDropDown extends essentialUtility.DropDown{

    @Test
    public void test7_viewDropDown()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.viewDropDown();
    }
    @Test
    public void test9_selectDropDownItem()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.selectDropDownItem();
    }
    @Test
    public void test9_getDropDownItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched!");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.getDropDownItem();
    }
}
