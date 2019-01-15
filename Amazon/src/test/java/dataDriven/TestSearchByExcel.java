package dataDriven;

import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;

public class TestSearchByExcel extends excelUtility.ReadFromExcel{

    @Test
    public void test12_searchItemsByExcel()throws Exception, IOException, SQLException, ClassNotFoundException {
        excelReader();
    }
}
