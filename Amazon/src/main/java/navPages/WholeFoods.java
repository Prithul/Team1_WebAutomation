package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;

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

    public void alexa() throws Exception, IOException, SQLException, ClassNotFoundException{
       wholeFoods.click();
       alexa.click();
       checkAvailability.click();
       enterZip.sendKeys("08016");
       shopNow.click();
       Thread.sleep(3000);
    }
}
