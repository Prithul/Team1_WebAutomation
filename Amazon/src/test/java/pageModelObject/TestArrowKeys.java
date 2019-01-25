package pageModelObject;

import essentialUtility.ArrowKeys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestArrowKeys extends essentialUtility.ArrowKeys {
    @Test
    public void arrowKey1()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrowKeys arrowKeys = PageFactory.initElements(driver, ArrowKeys.class);
        arrowKeys.getArrowKey1();
    }
    @Test
    public void arrowKey2()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrowKeys arrowKeys = PageFactory.initElements(driver, ArrowKeys.class);
        arrowKeys.getArrowKey2();
    }
}
