package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class DeliverTo extends CommonAPI {
    @FindBy(how = How.CSS, using ="#nav-global-location-slot")
    public WebElement deliveryLocation;
    @FindBy(how = How.CSS, using ="#GLUXChangePostalCodeLink")
    public WebElement changeZip;
    @FindBy(how = How.CSS, using ="#GLUXZipUpdateInput")
    public WebElement zip;
    @FindBy(how = How.CSS, using ="#GLUXZipUpdate")
    public WebElement apply;

    public void delivery() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        deliveryLocation.click();
        changeZip.click();
        zip.clear();
        zip.sendKeys("19047");
        Thread.sleep(2000);
        apply.click();
    }
}
