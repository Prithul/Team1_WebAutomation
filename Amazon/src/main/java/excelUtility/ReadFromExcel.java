package excelUtility;

import base.CommonAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import essentialUtility.SearchPage;

public class ReadFromExcel extends CommonAPI {

    public static final String SAMPLE_XLSX_FILE_PATH = "C:\\ExcelData\\data.xlsx";

    public static void excelReader()throws IOException, InvalidFormatException {

        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook Has Sheet: " + workbook.getNumberOfSheets());
        System.out.print("Sheet Name: ");
        for(Sheet sheet: workbook) {
            System.out.println(sheet.getSheetName());
        }
        // Getting the Sheet at index zero
        Sheet sheet = workbook.getSheetAt(0);
        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();
        System.out.println("Excel file contains items as below:\n");
        for (Row row: sheet) {
            for(Cell cell: row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
                //typeOnElementNEnter("#twotabsearchtextbox", cellValue);
                //navigateBack();
            }
            System.out.println();
        }
        workbook.close();
    }
}