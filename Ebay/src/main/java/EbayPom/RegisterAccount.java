package EbayPom;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class RegisterAccount extends CommonAPI {
    @FindBy(xpath ="//*[@id=\"gh-ug-flex\"]/a")
    public static WebElement register;
    @FindBy(name ="firstname")
    public static WebElement firstName;
    @FindBy(name ="lastname")
    public static WebElement lastName;
    @FindBy(name ="email")
    public static WebElement email;
    @FindBy(xpath ="//*[@id=\"ppaFormSbtBtn\"]")
    public static WebElement bttnCreateAccount;

        public void createAccountEbay(){
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            register.click();
            firstName.sendKeys("Amela", Keys.ENTER);
            lastName.sendKeys("Dervishi", Keys.ENTER);
            email.sendKeys("amela@gmail.com", Keys.ENTER);
            bttnCreateAccount.click();
        }
}
