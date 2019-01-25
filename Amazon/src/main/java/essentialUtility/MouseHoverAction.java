package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class MouseHoverAction extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[7]")
    public static WebElement help;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[1]/a")
    public static WebElement i1;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[2]/a")
    public static WebElement i2;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[3]/a")
    public static WebElement i3;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[4]/a")
    public static WebElement i4;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[5]/a")
    public static WebElement i5;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[6]/a")
    public static WebElement i6;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[7]/a")
    public static WebElement i7;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[8]/a")
    public static WebElement i8;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[9]/a")
    public static WebElement i9;
    @FindBy(how = How.XPATH, using ="//*[@id=\"category-section\"]/li[10]/a")
    public static WebElement i10;

    public void hover() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        Actions action = new Actions(driver);
        action.moveToElement(i1).perform();
        Thread.sleep(1000);
        action.moveToElement(i2).perform();
        Thread.sleep(1000);
        action.moveToElement(i3).perform();
        Thread.sleep(1000);
        action.moveToElement(i4).perform();
        Thread.sleep(1000);
        action.moveToElement(i5).perform();
        Thread.sleep(1000);
        action.moveToElement(i6).perform();
        Thread.sleep(1000);
        action.moveToElement(i7).perform();
        Thread.sleep(1000);
        action.moveToElement(i8).perform();
        Thread.sleep(1000);
        action.moveToElement(i9).perform();
        Thread.sleep(1000);
        action.moveToElement(i10).perform();
        Thread.sleep(1000);
    }
}
