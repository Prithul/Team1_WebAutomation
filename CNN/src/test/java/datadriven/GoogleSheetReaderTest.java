package datadriven;

import cnnutility.GoogleSheetReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;
import reporting.TestLogger;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

public class GoogleSheetReaderTest extends GoogleSheetReader{
    @Test
    public void testSearchItemFromGoogleSheet() throws IOException, GeneralSecurityException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //GoogleSheetReader gr = new GoogleSheetReader();
        List<String> cnnSearchList = readFromGoogleSheet();
       driver.findElement(By.cssSelector("#search-button")).click();
       for (String st : cnnSearchList){
            driver.findElement(By.cssSelector("#search-input-field")).sendKeys(st, Keys.ENTER);
            driver.findElement(By.className("cnn-search__input")).clear();
            driver.findElement(By.cssSelector(".cnn-search__clear")).click();
            navigateBack();
            driver.navigate().refresh();
        }


    }
}
