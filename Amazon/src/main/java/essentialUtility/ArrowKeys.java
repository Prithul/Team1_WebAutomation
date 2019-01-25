package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class ArrowKeys extends CommonAPI {
    @FindBy(how = How.CSS, using = ".a-icon.a-icon-previous-rounded")
    public WebElement leftArrow1;
    @FindBy(how = How.CSS, using = ".a-icon.a-icon-next-rounded")
    public WebElement rightArrow1;
    @FindBy(how = How.CSS, using = ".feed-carousel-control.feed-left")
    public WebElement leftArrow2;
    @FindBy(how = How.CSS, using = ".feed-carousel-control.feed-right")
    public WebElement rightArrow2;

    public void getArrowKey1() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        for (int i = 0; i <= 4; i++) {
            leftArrow1.click();
            Thread.sleep(1000); }
        for (int i = 0; i <= 4; i++) {
            rightArrow1.click();
            Thread.sleep(1000); }
    }
    public void getArrowKey2() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        for (int i = 0; i <= 2; i++) {
            rightArrow2.click();
            Thread.sleep(1000); }
        for (int i = 0; i <= 2; i++) {
            leftArrow2.click();
            Thread.sleep(1000); }
    }
}



