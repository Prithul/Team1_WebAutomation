package dataDriven;

import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchByGoogleSheet extends util.GoogleSheetReader {

    @Test
    public void searchItemsByGoogle()throws Exception, IOException, SQLException, ClassNotFoundException {
        getValues();
    }
}
