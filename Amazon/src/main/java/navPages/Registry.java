package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class Registry extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[5]")
    public static WebElement registry;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Baby Registry')]")
    public static WebElement babyRegistry;
    @FindBy(how = How.CSS, using ="#a-autoid-0-announce")
    public static WebElement getStarted;

    public void registry() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registry.click();
        babyRegistry.click();
        getStarted.click();
    }
}
