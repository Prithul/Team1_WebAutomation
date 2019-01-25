package pageModelObject;

import essentialUtility.AllLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestAllLinks extends essentialUtility.AllLinks {
    @Test
    public void checkAllLinksURL()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AllLinks allLinks = PageFactory.initElements(driver, AllLinks.class);
        allLinks.getUrlForallLinks();
    }
    @Test
    public void checkAllLinksText()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AllLinks allLinks = PageFactory.initElements(driver, AllLinks.class);
        allLinks.getTextForallLinks();
    }
}
