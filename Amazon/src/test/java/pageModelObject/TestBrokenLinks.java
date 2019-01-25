package pageModelObject;

import essentialUtility.BrokenLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestBrokenLinks extends essentialUtility.BrokenLinks {
    @Test
    public void getBrokenLinks()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BrokenLinks brokenLinks = PageFactory.initElements(driver, BrokenLinks.class);
        brokenLinks.getLinks();
    }
}
