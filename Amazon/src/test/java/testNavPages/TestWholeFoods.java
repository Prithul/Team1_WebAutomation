package testNavPages;

import navPages.TodayDeal;
import navPages.WholeFoods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestWholeFoods extends navPages.WholeFoods {

    @Test
    public void alexaSearch()throws Exception, IOException, SQLException, ClassNotFoundException {
        WholeFoods wholeFoods = PageFactory.initElements(driver, WholeFoods.class);
        wholeFoods.alexa();
    }
}
