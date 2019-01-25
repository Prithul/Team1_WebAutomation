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

public class HiddenButton extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//img[@alt='9 Love Bites Chocolate Covered Strawberries (Fun Size)']")
    public static WebElement item1;
    @FindBy(how = How.XPATH, using ="//*[@id='gw-quick-look-btn']")
    public static WebElement quickLook;
    @FindBy(how = How.CSS, using ="#a-autoid-1-announce")
    public static WebElement productDetail;

    public void valentineItem() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(item1).perform();
        quickLook.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
        productDetail.click();
    }
}
