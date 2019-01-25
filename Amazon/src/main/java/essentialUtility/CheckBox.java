package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class CheckBox extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[3]")
    public static WebElement giftCards;
    @FindBy(how = How.CSS, using =".a-label.a-checkbox-label")
    public static WebElement checkBox;

    public void ClickAllCheckboxes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giftCards.click();
        checkBox.click();
    }
}
