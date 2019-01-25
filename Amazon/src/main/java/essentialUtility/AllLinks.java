package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AllLinks extends  CommonAPI {

    public void getUrlForallLinks() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> urlForAllLinks = driver.findElements(By.tagName("a"));
        for (WebElement ele : urlForAllLinks) {
            System.out.println(ele.getAttribute("href")); }
    }
    public void getTextForallLinks() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> textForAllLinks = driver.findElements(By.tagName("a"));
        for (WebElement ele : textForAllLinks) {
            System.out.println(ele.getText()); }
    }
}

