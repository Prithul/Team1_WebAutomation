package pageModelObject;

import essentialUtility.SearchOnSearchBox;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;

public class TestSearchOnSearchBox extends essentialUtility.SearchOnSearchBox {

    @Test
    public void test11_searchOnSearchBox()throws Exception, IOException, SQLException, ClassNotFoundException {
        SearchOnSearchBox searchBox = PageFactory.initElements(driver, SearchOnSearchBox.class);
        searchBox.searchItemsAndSubmitButton();
    }
}
