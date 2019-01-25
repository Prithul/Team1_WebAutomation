package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class YourAmazon extends CommonAPI {
    @FindBy(how = How.CSS, using ="#nav-your-amazon")
    public static WebElement yourAmazon;
    @FindBy(how = How.CSS, using ="#remember_me_learn_more_link")
    public static WebElement details;
    @FindBy(how = How.XPATH, using ="//*[@id=\"createAccountSubmit\"]")
    public static WebElement createYourAmazonAccount;
    @FindBy(how = How.CLASS_NAME, using =".a-icon.a-icon-logo")
    public static WebElement amazonLogo;

    public void clickOndetails() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        yourAmazon.click();
        details.click();
    }
   public void createAmazonAccount() throws InterruptedException {
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       yourAmazon.click();
       createYourAmazonAccount.click();
    }
}
