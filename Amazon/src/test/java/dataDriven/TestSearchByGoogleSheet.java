package dataDriven;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import googleSheetUtility.GoogleSheetReader;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestSearchByGoogleSheet extends googleSheetUtility.GoogleSheetReader {
    @Test
    public void searchItemsByGoogle()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GoogleSheetReader googleSheetReader = PageFactory.initElements(driver, GoogleSheetReader.class);
        googleSheetReader.getValues();
    }
}
