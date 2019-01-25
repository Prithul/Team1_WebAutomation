package testNavPages;

import navPages.Registry;
import navPages.Sell;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestSell extends navPages.Sell {
    @Test
    public void startSelling()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Sell sell = PageFactory.initElements(driver, Sell.class);
        sell.sell();
    }
}
