package pageModelObject;

import essentialUtility.IFrame;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestIFrame extends essentialUtility.IFrame {
    @Test
    public void iFrameContent()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        IFrame test = PageFactory.initElements(driver, IFrame.class);
        test.getIframeContent();
    }
    @Test
    public void iFrameInfo()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        IFrame test = PageFactory.initElements(driver, IFrame.class);
        test.getIframeLocation();
    }
    @Test
    public void iFrameNumber()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        IFrame test = PageFactory.initElements(driver, IFrame.class);
        test.getIframeNumber();
    }
}
