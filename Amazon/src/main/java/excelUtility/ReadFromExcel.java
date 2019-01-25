package excelUtility;

import base.CommonAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import reporting.TestLogger;
import java.io.File;
import java.io.IOException;

public class ReadFromExcel extends CommonAPI {
    public final String SAMPLE_XLSX_FILE_PATH = "C:\\ExcelData\\data.xlsx";

    public void excelReader()throws IOException, InvalidFormatException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
        System.out.println("Workbook Has Sheet: " + workbook.getNumberOfSheets());
        System.out.print("Sheet Name: ");
        for(Sheet sheet: workbook) {
            System.out.println(sheet.getSheetName());
        }
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();
        System.out.println("Excel file contains items as below:\n");
        for (Row row: sheet) {
            for(Cell cell: row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
                typeOnElementNEnter("#twotabsearchtextbox", cellValue);
                driver.navigate().back(); }
            System.out.println(); }
        workbook.close();
    }
}