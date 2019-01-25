package dataDriven;

import excelUtility.ReadFromExcel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestSearchByExcel extends excelUtility.ReadFromExcel{
    @Test
    public void searchItemsByExcel()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReadFromExcel readExcel = PageFactory.initElements(driver, ReadFromExcel.class);
        readExcel.excelReader();
    }
}
