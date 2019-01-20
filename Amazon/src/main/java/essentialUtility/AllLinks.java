package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AllLinks extends  CommonAPI {

    public static void getUrlForallLinks() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<WebElement> urlForAllLinks = driver.findElements(By.tagName("a"));
        for (WebElement ele : urlForAllLinks) {
            System.out.println(ele.getAttribute("href"));
        }
    }
    public static void getTextForallLinks() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<WebElement> textForAllLinks = driver.findElements(By.tagName("a"));
        for (WebElement ele : textForAllLinks) {
            System.out.println(ele.getText());
        }
    }
}

