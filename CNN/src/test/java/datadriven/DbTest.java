package datadriven;

import cnnutility.DBReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class DbTest extends DBReader{
    @Test
    public void testSearchKeyDB(){
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

              List<String> cnnSearchList = new ArrayList<String>();
                driver.findElement(By.cssSelector("#search-button")).click();
                try {
                    cnnSearchList = readNavListFromDb();
                }catch (Exception e) {
                    e.printStackTrace();
                }
                for (String st : cnnSearchList){
               driver.findElement(By.cssSelector("#search-input-field")).sendKeys(st,Keys.ENTER);
               driver.findElement(By.className("cnn-search__input")).clear();
               driver.findElement(By.cssSelector(".cnn-search__clear")).click();
               navigateBack();
               driver.navigate().refresh();
                }
            }
        }




