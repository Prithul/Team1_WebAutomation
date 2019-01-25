package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class URL extends CommonAPI {
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

    public void urlCheck1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        yourAmazon.click();
        getCurrentURL(); }
    public void urlCheck2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDeal.click();
        getCurrentURL(); }
    public void urlCheck3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giftCards.click();
        getCurrentURL(); }
    public void urlCheck4(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        wholeFoods.click();
        getCurrentURL(); }
    public void urlCheck5(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registry.click();
        getCurrentURL(); }
    public void urlCheck6(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sell.click();
        getCurrentURL(); }
    public void urlCheck7(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        getCurrentURL(); }
    public void titleCheck1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        yourAmazon.click();
        getPageTitle(); }
    public void titleCheck2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDeal.click();
        getPageTitle(); }
    public void titleCheck3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giftCards.click();
        getPageTitle(); }
    public void titleCheck4(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        wholeFoods.click();
        getPageTitle(); }
    public void titleCheck5(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registry.click();
        getPageTitle(); }
    public void titleCheck6(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sell.click();
        getPageTitle(); }
    public void titleCheck7(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        getPageTitle(); }
}
