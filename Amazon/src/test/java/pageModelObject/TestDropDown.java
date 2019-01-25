package pageModelObject;

import essentialUtility.DropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestDropDown extends essentialUtility.DropDown{
    @Test
    public void getViewDropDown()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.viewDropDown();
    }
    @Test
    public void getSelectDropDownItem1()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.selectDropDownItem1();
    }
    @Test
    public void getSelectDropDownItem2()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.selectDropDownItem2();
    }
    @Test
    public void getSelectDropDownItem3()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.selectDropDownItem3();
    }
    @Test
    public void getSelectDropDownItem4()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.selectDropDownItem4();
    }
    @Test
    public void getSelectDropDownItem5()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.selectDropDownItem5();
    }
    @Test
    public void getSelectDropDownItem6()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.selectDropDownItem6();
    }
    @Test
    public void getSelectDropDownItem7()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.selectDropDownItem7();
    }
    @Test
    public void getDropDownItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown dropDown = PageFactory.initElements(driver, DropDown.class);
        dropDown.getDropDownItem();
    }
}
