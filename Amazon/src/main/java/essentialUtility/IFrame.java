package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IFrame extends CommonAPI {
    @FindBy(how = How.ID, using = "ape_Gateway_right-2_desktop_iframe")
    public WebElement find;
    @FindBy(how = How.XPATH, using = "//*[@id='div-gpt-ad']")
    public WebElement pic;

    public void getIframeContent() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.switchTo().frame(find);
        pic.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
        driver.switchTo().defaultContent();
    }
    public void getIframeLocation() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        for (WebElement iframe : iframes) {
            System.out.println(iframe);
            System.out.println(iframe.getLocation()); }
    }
    public void getIframeNumber() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //By executing a java script
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
        System.out.println("Number of iframes on the page:" + numberOfFrames);
        //By finding all the web elements using iframe tag
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of iframes on the page:" + iframeElements.size());
    }
}



