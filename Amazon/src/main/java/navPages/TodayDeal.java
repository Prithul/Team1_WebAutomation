package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
        todayDeal.click();
        checkBoxForDepartment.click();
        clear.click();
    }

    public void clickOnTodayDeal2() throws InterruptedException {
        todayDeal.click();
        dealOfTheDay.click();
        Thread.sleep(1000);
        coupons.click();
        Thread.sleep(1000);
    }
}
