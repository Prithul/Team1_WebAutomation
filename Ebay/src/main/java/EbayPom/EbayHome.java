package EbayPom;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class EbayHome extends CommonAPI {
    @FindBy(xpath ="//*[@id=\"mainContent\"]/div[1]/ul/li[1]/span")
    public static WebElement homeTab;
    @FindBy(xpath ="//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a")
    public static WebElement SavedTab;
    @FindBy(xpath ="//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")
    public static WebElement MotorsTab;
    @FindBy(xpath ="//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    public static WebElement FashionTab;
    @FindBy(xpath ="//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")
    public static WebElement ElectronicsTab;
    @FindBy(xpath ="//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")
    public static WebElement CollandArtTab;
    @FindBy(xpath ="//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a")
    public static WebElement HomeAndGarden;
    @FindBy(xpath ="//*[@id=\"gh-logo\"]")
    public static WebElement Logo;
    @FindBy(xpath ="//button[@class='hl-common-carousel__btn hl-common-carousel__btn-next btn']")
    public static WebElement changeBanners;
    @FindBy(xpath ="input[@id='gh-ac']")
    public static WebElement searchBoxText;
    @FindBy(linkText ="Daily Deals")
    public static WebElement dailyDeals;
    @FindBy(linkText ="Help & Contact")
    public static WebElement helpTab;

    public void searchMenu() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElementNEnter("_nkw","Bose Headphones");
        navigateBack();
        typeOnElementNEnter("_nkw","iPhone");
        navigateBack();
        typeOnElementNEnter("_nkw","Mac");
    }
    public void clickOnHomeTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTab.click();
    }
    public void clickOnSavedTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SavedTab.click();
    }
    public void clickOnMotorsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MotorsTab.click();
    }
    public void clickOnFashionTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FashionTab.click();
    }
    public void clickOnElectronicsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ElectronicsTab.click();
    }
    public void clickOnCollectandArtTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CollandArtTab.click();
    }
    public void clickOnHomeandGardenTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomeAndGarden.click();
    }
    public void isLogoDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Logo.isDisplayed();
    }
    public void bannerChange(){//failed
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//button[@class='hl-common-carousel__btn hl-common-carousel__btn-next btn']");
        waitUntilClickAble(By.xpath("//button[@class='hl-common-carousel__btn hl-common-carousel__btn-next btn']"));
        changeBanners.click();
        //changeBanners.click();
    }
    public void SearchBoxText() throws InterruptedException{//failed
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String searchText = searchBoxText.getText();
        Thread.sleep(1000);
        System.out.println(searchText);
        Assert.assertEquals(searchText,"Search for anything");
    }
    public void dailyDealsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dailyDeals.click();
    }
    public void findHelp(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        helpTab.click();
    }
}
