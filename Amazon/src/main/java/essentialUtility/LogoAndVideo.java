package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class LogoAndVideo extends CommonAPI {
    @FindBy(how = How.CSS, using ="#nav-your-amazon")
    public static WebElement yourAmazon;
    @FindBy(how = How.XPATH, using ="//*[@id=\"a-page\"]/div[1]/div[1]/div/a")
    public WebElement amazonLogo;
    @FindBy(how = How.ID, using ="expand-player-button")
    public static WebElement liveVideOn;
    @FindBy(how = How.CSS, using =".amznlv-react-expandable-view-close")
    public static WebElement liveVideoOff;
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[2]")
    public static WebElement todayDeal;
    @FindBy(how = How.CSS, using =".nav-logo-base.nav-sprite")
    public static WebElement todayDealAmazonLogo;

    public void logoTest() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        yourAmazon.click();
        amazonLogo.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void logoTest2() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDeal.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        todayDealAmazonLogo.click();
    }
//    public void liveVideo() throws Exception, IOException, SQLException, ClassNotFoundException{
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        liveVideOn.click();
//        Thread.sleep(2000);
//        liveVideoOff.click();
//    }
}
