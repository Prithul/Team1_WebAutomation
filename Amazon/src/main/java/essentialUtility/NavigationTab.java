package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class NavigationTab extends CommonAPI{

    @FindBy(how = How.CSS, using ="#nav-your-amazon")
    public static WebElement yourAmazon;
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[2]")
    public static WebElement todayDeal;
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[3]")
    public static WebElement giftCards;
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[4]")
    public static WebElement wholeFoods;
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[5]")
    public static WebElement registry;
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[6]")
    public static WebElement sell;
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[7]")
    public static WebElement help;

    public void navigationTabOnHomePage() throws InterruptedException{

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        yourAmazon.click();
        navigateBack();
        todayDeal.click();
        navigateBack();
        giftCards.click();
        navigateBack();
        wholeFoods.click();
        navigateBack();
        registry.click();
        navigateBack();
        sell.click();
        navigateBack();
        help.click();
        navigateBack();
        System.out.println("NavigationTab is done!");
    }
}
