package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButton extends CommonAPI {
    @FindBy(how = How.CSS, using ="#icp-nav-flyout")
    public static WebElement language;
    @FindBy(how = How.CSS, using =".a-icon.a-icon-radio")
    public static WebElement buttons;
    boolean buttonValue = false;

    public void getLanguage() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        language.click();
        List<WebElement> radioButtons = driver.findElements(By.cssSelector(".a-icon.a-icon-radio"));
        buttonValue = radioButtons.get(0).isSelected();
        if(buttonValue = true){
            radioButtons.get(1).click();
        }else{
            radioButtons.get(0).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
    }
}
