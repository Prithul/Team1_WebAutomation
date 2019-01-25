package dataDriven;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import essentialUtility.SearchPageForDB;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestSearchPageBySql extends SearchPageForDB {
    @Test
    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPageForDB searchPage = PageFactory.initElements(driver, SearchPageForDB.class);
        searchPage.searchItemsAndSubmitButton();
    }
}
