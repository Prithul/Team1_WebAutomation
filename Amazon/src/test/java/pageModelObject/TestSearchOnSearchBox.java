package pageModelObject;

import essentialUtility.SearchOnSearchBox;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestSearchOnSearchBox extends essentialUtility.SearchOnSearchBox {
    @Test
    public void SearchOnSearchBox()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchOnSearchBox searchBox = PageFactory.initElements(driver, SearchOnSearchBox.class);
        searchBox.searchItemsAndSubmitButton();
    }
}
