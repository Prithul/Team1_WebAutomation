package pageModelObject;

import essentialUtility.BrokenImages;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestBrokenImages extends essentialUtility.BrokenImages{
    @Test
    public void getBrokenImageLinks()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BrokenImages brokenImages = PageFactory.initElements(driver, BrokenImages.class);
        brokenImages.getImageLinks();
    }
}
