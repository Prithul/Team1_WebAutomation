package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class GiftCards extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[3]")
    public static WebElement giftCards;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Print-at-Home')]")
    public static WebElement printAtHome;
    @FindBy(how = How.CSS, using ="#gc-customization-type-button-Upload")
    public static WebElement yourPhoto;
    @FindBy(how = How.LINK_TEXT, using ="Reload your balance")
    public static WebElement reload;
    @FindBy(how = How.CSS, using ="#asv-manual-reload-amount")
    public static WebElement reloadAmount;
    @FindBy(how = How.CSS, using ="#a-autoid-1-announce")
    public static WebElement reloadFifty;
    @FindBy(how = How.CSS, using ="#a-autoid-2-announce")
    public static WebElement reloadHundred;
    @FindBy(how = How.CSS, using ="#a-autoid-3-announce")
    public static WebElement reloadTwoHundred;
    @FindBy(how = How.CSS, using ="#a-autoid-5-announce")
    public static WebElement reloadFiveHundred;

    public void buyGiftCard() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giftCards.click();
        printAtHome.click();
        yourPhoto.click();
    }
    public void reload() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giftCards.click();
        reload.click();
        reloadFifty.click();
        reloadHundred.click();
        reloadTwoHundred.click();
        reloadFiveHundred.click();
    }
    public void reloadBalance() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giftCards.click();
        reload.click();
        reloadFifty.click();
        reloadAmount.sendKeys("300.00");
    }
}
