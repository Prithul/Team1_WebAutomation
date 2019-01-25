package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class FacebookDropDown extends CommonAPI {
    @FindBy(xpath = "//div[@id='userNavigationLabel']")
    public static WebElement DropDown;
    @FindBy(xpath = "//span[@class='_54nh']")
    public static WebElement Settings;
    @FindBy(linkText = "Create Page")
    public static WebElement CreatePage;
    @FindBy(xpath = "//input[@type='email']")
    public static WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    public static WebElement logInBttn;
    @FindBy(linkText = "Create Group")
    public static WebElement CreateGroup;
    @FindBy(linkText = "Find Groups")
    public static WebElement FindGroups;
    @FindBy(linkText = "Create Fundraiser")
    public static WebElement CreateFundraiser;
    @FindBy(linkText = "Create Ads")
    public static WebElement CreateAds;
    @FindBy(linkText = "Advertising on Facebook")
    public static WebElement AdvertisingOnFacebook;
    @FindBy(linkText = "Activity Log")
    public static WebElement ActivityLog;
    @FindBy(linkText = "News Feed Preferences")
    public static WebElement NewsFeedPreferances;


    public void SignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        username.sendKeys("ameladrv@gmail.com");
        password.sendKeys("PNTeam1234");
        logInBttn.click(); }
    public void checkSettings(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        Settings.click(); }
    public void CreateaPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        CreatePage.click(); }
    public void CreateaGroup() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        CreateGroup.click();}
    public void FindGroups() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        FindGroups.click();}
    public void createFundraiser() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        CreateFundraiser.click();}
    public void createAds() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        CreateAds.click();}
    public void AdvertisingOnFacebook() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        AdvertisingOnFacebook.click();}
    public void ActivityLog() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        ActivityLog.click();}
    public void NewsFeedPreferances() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        NewsFeedPreferances.click();}
}
