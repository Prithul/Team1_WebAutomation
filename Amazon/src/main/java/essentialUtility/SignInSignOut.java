package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class SignInSignOut extends CommonAPI {
    @FindBy(how = How.ID, using ="nav-link-accountList")
    public static WebElement input1WebElement;
    @FindBy(how = How.CSS, using ="span.nav-action-inner")
    public static WebElement input2WebElement;
    @FindBy(how = How.CSS, using ="#ap_email")
    public static WebElement userIdWebElement;
    @FindBy(how = How.CSS, using ="#ap_password")
    public static WebElement passWordWebElement;
    @FindBy(how = How.CSS, using ="#signInSubmit")
    public static WebElement signInWebElement;
    @FindBy(how = How.ID, using ="nav-link-accountList")
    public static WebElement outWebElement;
    @FindBy(how = How.ID, using ="nav-item-signout")
    public static WebElement signOutWebElement;

    public void getSignOut() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        // sign out
        WebElement mainMenu1 = outWebElement;
        actions.moveToElement(mainMenu1);
        actions.build().perform();
        signOutWebElement.click();
        System.out.println("Successfully Sign-Out");
    }
    public void getSignInSignOut(int i, int j) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        // sign in
        int user=i;
        int pass=j;
        Actions actions = new Actions(driver);
        WebElement mainMenu = input1WebElement;
        actions.moveToElement(mainMenu);
        actions.build().perform();
        // sub menu
        WebElement subMenu = input2WebElement;
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        if(user == 1 & pass == 1) {
            use_ValidUserId_ValidPassWord();
            getSignOut();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
        }else if(user == 1 & pass == 0) {
            use_ValidUserId_InValidPassWord();
        }else if(user == 0 & pass == 1) {
            use_InvalidUserId_ValidPassWord();
        }else if(user == 0 & pass == 0) {
            use_InValidUserId_InValidPassWord();
        }
    }
    public void use_ValidUserId_ValidPassWord() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userIdWebElement.sendKeys("pbarua2018@gmail.com");
        passWordWebElement.sendKeys("test2018");
        signInWebElement.click();
        System.out.println("Successfully Sign-In");
    }
    public void use_ValidUserId_InValidPassWord() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userIdWebElement.sendKeys("pbarua2018@gmail.com");
        passWordWebElement.sendKeys("test2020");
        signInWebElement.click();
        System.out.println("Failed to Sign-In");
    }
    public void use_InvalidUserId_ValidPassWord() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userIdWebElement.sendKeys("pppbarua2018@gmail.com");
        passWordWebElement.sendKeys("test2018");
        signInWebElement.click();
        System.out.println("Failed to Sign-In");
    }
    public void use_InValidUserId_InValidPassWord() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userIdWebElement.sendKeys("ppbarua2018@gmail.com");
        passWordWebElement.sendKeys("test2020");
        signInWebElement.click();
        System.out.println("Failed to Sign-In");
    }
}


