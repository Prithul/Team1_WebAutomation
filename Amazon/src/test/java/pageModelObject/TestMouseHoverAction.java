package pageModelObject;

import essentialUtility.MouseHoverAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestMouseHoverAction extends essentialUtility.MouseHoverAction {
    @Test
    public void checkHover()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MouseHoverAction hover = PageFactory.initElements(driver, MouseHoverAction.class);
        hover.hover();
    }
}
