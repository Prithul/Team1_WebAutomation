package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using ="#navSwmHoliday")
    public static WebElement newYearGoal;
    @FindBy(how = How.LINK_TEXT, using ="Careers")
    public WebElement career;
    @FindBy(how = How.LINK_TEXT, using ="Blog")
    public WebElement blog;
    @FindBy(how = How.LINK_TEXT, using ="About Amazon")
    public WebElement aboutAmazon;
    @FindBy(how = How.LINK_TEXT, using ="Press Center")
    public WebElement pressCenter;
    @FindBy(how = How.LINK_TEXT, using ="Investor Relations")
    public WebElement investorRelations;
    @FindBy(how = How.LINK_TEXT, using ="Amazon Devices")
    public WebElement amazonDevices;
    @FindBy(how = How.LINK_TEXT, using ="Amazon Rewards Visa Signature Cards")
    public WebElement amazonRewards;
    @FindBy(how = How.LINK_TEXT, using ="Amazon.com Store Card")
    public WebElement amazonStoreCards;
    @FindBy(how = How.LINK_TEXT, using ="Amazon Business Card")
    public WebElement amazonBusinessCards;
    @FindBy(how = How.LINK_TEXT, using ="Amazon.com Corporate Credit Line")
    public WebElement amazonCorporateCreditLine;
    @FindBy(how = How.LINK_TEXT, using ="Shop with Points")
    public WebElement shopWithPoints;
    @FindBy(how = How.LINK_TEXT, using ="Credit Card Marketplace")
    public WebElement ccMarketPlace;
    @FindBy(how = How.LINK_TEXT, using ="Reload Your Balance")
    public WebElement reloadBalance;
    @FindBy(how = How.LINK_TEXT, using ="Amazon Currency Converter")
    public WebElement currencyConverter;
    @FindBy(how = How.LINK_TEXT, using ="Your Account")
    public WebElement account;
    @FindBy(how = How.LINK_TEXT, using ="Your Orders")
    public WebElement order;
    @FindBy(how = How.LINK_TEXT, using ="Help")
    public WebElement helpAmazon;
    @FindBy(how = How.LINK_TEXT, using ="Shipping Rates & Policies")
    public WebElement rateAmazon;
    @FindBy(how = How.LINK_TEXT, using ="Returns & Replacements")
    public WebElement returnAmazon;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using ="Amazon Music")
    public WebElement musicAmazon;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using ="Amazon Business")
    public WebElement businessAmazon;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using ="Amazon Web Services")
    public WebElement webServicesAmazon;
    @FindBy(how = How.LINK_TEXT, using ="Privacy Notice")
    public WebElement privacyNotice;
    @FindBy(how = How.CSS, using =".navFooterBackToTopText")
    public WebElement backToTop;

    public void newYearGoal() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        newYearGoal.click(); }
    public void careerLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        career.click(); }
    public void blogLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        blog.click(); }
    public void aboutAmazonLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        aboutAmazon.click(); }
    public void pressCenterLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pressCenter.click(); }
    public void investorRelationsLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        investorRelations.click(); }
    public void amazonDevicesLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonDevices.click(); }
    public void amazonRewardsCardsLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonRewards.click(); }
    public void amazonStoreCardsLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonStoreCards.click(); }
    public void amazonBusinessCardLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonBusinessCards.click(); }
    public void amazonCorporateCreditLineLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCorporateCreditLine.click(); }
    public void amazonShopWithPointsLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopWithPoints.click(); }
    public void amazonCreditCardMarketplaceLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ccMarketPlace.click(); }
    public void amazonReloadBalance() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        reloadBalance.click(); }
    public void amazonCurrencyConverterLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        currencyConverter.click(); }
    public void amazonYourAcountLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        account.click(); }
    public void amazonYourOrdersLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        order.click(); }
    public void helpLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        helpAmazon.click(); }
    public void shippingRateLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        rateAmazon.click(); }
    public void returnAndReplacementLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        returnAmazon.click(); }
    public void amazonMusicLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        musicAmazon.click(); }
    public void amazonBusinessLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessAmazon.click(); }
    public void amazonWebServicesLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        webServicesAmazon.click(); }
    public void privacyNoticeLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        privacyNotice.click(); }
    public void backToTopLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        backToTop.click(); }
}
