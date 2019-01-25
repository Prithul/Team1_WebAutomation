package pageModelObject;

import essentialUtility.NavigationTab;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestNavigation extends NavigationTab {
        @Test
        public void navigationTab()throws Exception, IOException, SQLException, ClassNotFoundException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NavigationTab navigationTab = PageFactory.initElements(driver, NavigationTab.class);
            navigationTab.navigationTabOnHomePage();
        }
}
