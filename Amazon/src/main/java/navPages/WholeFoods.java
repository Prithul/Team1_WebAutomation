package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class WholeFoods extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[4]")
    public static WebElement wholeFoods;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Ask Alexa to add organic milk to your Whole Foods cart. Learn more')]")
    public static WebElement alexa;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Check delivery availability')]")
    public static WebElement checkAvailability;
    @FindBy(how = How.CSS, using ="#lsPostalCode")
    public static WebElement enterZip;
    @FindBy(how = How.CSS, using ="#a-autoid-1")
    public static WebElement shopNow;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Weekly Deals')]")
    public static WebElement weeklyDeals;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Prime Pantry')]")
    public static WebElement primePantry;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Sign up for Prime')]")
    public static WebElement signUp;

    public void alexa() throws Exception, IOException, SQLException, ClassNotFoundException{
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       wholeFoods.click();
       alexa.click();
       checkAvailability.click();
       enterZip.sendKeys("08016");
       shopNow.click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void weeklyDeals() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        wholeFoods.click();
        weeklyDeals.click();
    }
    public void primePantry() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        wholeFoods.click();
        primePantry.click();
    }
    public void SignUpForPrime() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        wholeFoods.click();
        signUp.click();
    }
}
