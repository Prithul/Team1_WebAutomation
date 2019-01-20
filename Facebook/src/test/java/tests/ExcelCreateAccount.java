package tests;

import Excel.implementExcel;
import org.testng.annotations.Test;

public class ExcelCreateAccount extends implementExcel {
    //tests for different users trying to create an account (imported from excel file)
    @Test
    public void createFAccount()throws InterruptedException{
        getDataFromExcel();
    }
}
