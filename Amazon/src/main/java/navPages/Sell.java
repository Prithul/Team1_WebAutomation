package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class Sell extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[6]")
    public static WebElement sell;
    @FindBy(how = How.LINK_TEXT, using ="Start selling")
    public static WebElement viewStory;

    public void sell() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sell.click();
        viewStory.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
}
