package cnnutility;

import base.CommonAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NavBarPage;
import reporting.TestLogger;
import util.ReadFromExcel;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static base.CommonAPI.convertToString;

public class ExcelReader extends CommonAPI {

    public void readNavItemExcel(int exlindex, int domindex) throws IOException, InvalidFormatException ,InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<WebElement> itemList = driver.findElements(By.cssSelector("#nav > div.nav__container > div.nav-menu-links > a"));
       // reading Title from excel sheet
        List<String> elist = ReadFromExcel.CnnexcelReader(1, 4, 14, 2);
        itemList.get(domindex).click();
        sleepFor(3);  // without this through error in assertion
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(),elist.get(exlindex));

        }
    }
