package pageModelObject;

import essentialUtility.DeliverTo;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestDeliverTo extends DeliverTo {
    @Test
    public void deliverTo()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DeliverTo location = PageFactory.initElements(driver, DeliverTo.class);
        location.delivery();
    }
}
