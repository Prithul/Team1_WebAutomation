package dataDriven;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import essentialUtility.SearchPageForDB;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchPageBySql extends SearchPageForDB {

    @Test
    public void test11_searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        SearchPageForDB searchPage = PageFactory.initElements(driver, SearchPageForDB.class);
        searchPage.searchItemsAndSubmitButton();
    }
}
