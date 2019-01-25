package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class TodayDeal extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[2]")
    public static WebElement todayDeal;
    @FindBy(how = How.CSS, using =".a-label.a-checkbox-label")
    public static WebElement checkBoxForDepartment;
    @FindBy(how = How.CSS, using =".a-link-normal")
    public static WebElement clear;
    @FindBy(how = How.LINK_TEXT, using ="Deal of the Day")
    public static WebElement dealOfTheDay;
    @FindBy(how = How.LINK_TEXT, using ="Coupons")
    public static WebElement coupons;

    public void clickOnTodayDeal1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDeal.click();
        checkBoxForDepartment.click();
        clear.click();
    }
    public void clickOnTodayDeal2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDeal.click();
        dealOfTheDay.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
        coupons.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
}
