package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class ShopByCategory extends CommonAPI {
    @FindBy(how = How.CSS, using =".hm-icon.nav-sprite")
    public static WebElement catagory;
    @FindBy(how = How.CSS, using =".nav-sprite.hmenu-close-icon")
    public static WebElement crossOut;
    @FindBy(how = How.CSS, using ="#nav-cart-count")
    public static WebElement cartStatus;
    @FindBy(how = How.XPATH, using ="//*[@id='hmenu-content']/ul[32]/li[2]/a")
    public static WebElement primevideo;
    @FindBy(how = How.XPATH, using ="//*[@id='hmenu-content']/ul[32]/li[3]/a")
    public static WebElement amazonMusic;
    @FindBy(how = How.XPATH, using ="//*[@id='hmenu-content']/ul[2]/li[1]/a/div/i")
    public static WebElement backToMain;
    @FindBy(how = How.CSS, using =".nav-sprite.hmenu-arrow-prev")
    public static WebElement back;

    public void getCategory() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        catagory.click();
        Thread.sleep(3000);
        crossOut.click();
    }
    public void getPrimeVideo() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        catagory.click();
        Thread.sleep(3000);
        primevideo.click();
        Thread.sleep(3000);
        back.click();
    }
    public void getAmazonMusic() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        catagory.click();
        Thread.sleep(3000);
        amazonMusic.click();
        Thread.sleep(3000);
        backToMain.click();
    }
    public void getCartStatus() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cartStatus.click();
    }
}
