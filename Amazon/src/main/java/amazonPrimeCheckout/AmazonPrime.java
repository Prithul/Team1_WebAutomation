package amazonPrimeCheckout;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class AmazonPrime extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-logo\"]/a[2]")
    public static WebElement tryPrime;
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public WebElement searchInputWebElement;
    @FindBy(how = How.CSS, using =".nav-input")
    public WebElement submitButtonWebElement;
    @FindBy(how = How.CSS, using =".s-access-image.cfMarker")
    public WebElement imageWebElement;
    @FindBy(how = How.CSS, using ="#add-to-cart-button")
    public WebElement addToCartWebElement;
    @FindBy(how = How.CSS, using ="#hlb-ptc-btn-native")
    public WebElement proceedToCheckoutWebElement;
    @FindBy(how = How.CSS, using ="#ap_email")
    public static WebElement userIdWebElement;
    @FindBy(how = How.CSS, using ="#ap_password")
    public static WebElement passWordWebElement;
    @FindBy(how = How.CSS, using ="#signInSubmit")
    public static WebElement signInWebElement;
    @FindBy(how = How.CSS, using ="#enterAddressAddressLine1")
    public WebElement addressWebElement;
    @FindBy(how = How.CSS, using ="#enterAddressCity")
    public WebElement cityWebElement;
    @FindBy(how = How.CSS, using ="#enterAddressStateOrRegion")
    public WebElement stateWebElement;
    @FindBy(how = How.CSS, using ="#enterAddressPostalCode")
    public WebElement zipWebElement;
    @FindBy(how = How.CSS, using ="#enterAddressPhoneNumber")
    public WebElement phoneWebElement;
    @FindBy(how = How.CSS, using =".a-button-text.submit-button-with-name")
    public WebElement continueWebElement;
    @FindBy(how = How.CSS, using =".a-button-text")
    public WebElement continue2WebElement;
    @FindBy(how = How.CSS, using ="#ccName")
    public WebElement nameOnCardWebElement;
    @FindBy(how = How.CSS, using ="#addCreditCardNumber")
    public WebElement creditCardNumberWebElement;
    @FindBy(how = How.CSS, using ="#ccAddCard")
    public WebElement addCartWebElement;

    public void clickOnAmazonPrime() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tryPrime.click();
        searchInputWebElement.sendKeys("8 Little Planets");
        submitButtonWebElement.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        imageWebElement.click();
        addToCartWebElement.click();
        proceedToCheckoutWebElement.click();
        // sign in
        userIdWebElement.sendKeys("pbarua2018@gmail.com");
        passWordWebElement.sendKeys("test2018");
        signInWebElement.click();
        System.out.println("Successfully Sign-In");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // info1
        addressWebElement.sendKeys("7 Lenape Lane");
        cityWebElement.sendKeys("Burlington Township");
        stateWebElement.sendKeys("NJ");
        zipWebElement.sendKeys("08016");
        phoneWebElement.sendKeys("2679942516");
        continueWebElement.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        // info2
        continue2WebElement.submit();
        nameOnCardWebElement.sendKeys("Papri Barua");
        creditCardNumberWebElement.sendKeys("1234567890");
        addCartWebElement.click();
        Thread.sleep(2000);
    }
}
