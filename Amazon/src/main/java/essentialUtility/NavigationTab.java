package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
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
        Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
        navigateBack();
        todayDeal.click();
        Assert.assertEquals(driver.getTitle(), "Gold Box Deals | Today's Deals - Amazon.com");
        navigateBack();
        giftCards.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com Gift Cards");
        navigateBack();
        wholeFoods.click();
        Assert.assertEquals(driver.getTitle(), "Whole Foods Market @ Amazon.com");
        navigateBack();
        registry.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: : Registry");
        navigateBack();
        sell.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Sell Products Online with Selling on Amazon");
        navigateBack();
        help.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com Help");
        navigateBack();
    }
}
