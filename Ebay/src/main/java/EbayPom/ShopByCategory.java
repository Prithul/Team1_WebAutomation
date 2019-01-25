package EbayPom;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ShopByCategory extends CommonAPI {
    @FindBy(xpath ="//*[@id=\"gh-shop-a\"]")
    public static WebElement shopCategoris;
    @FindBy(xpath ="//*[@id=\"gh-sbc\"]/tbody/tr/td[2]/ul[1]/li[1]/a")
    public static WebElement women;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[3]/a")
    public static WebElement womenActiveWear;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[4]/a")
    public static WebElement coatsAndJackets;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[5]/a")
    public static WebElement dresses;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[6]/a")
    public static WebElement socks;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[7]/a")
    public static WebElement sleepwear;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[8]/a")
    public static WebElement jeans;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[9]/a")
    public static WebElement rompers;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[10]/a")
    public static WebElement leggins;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[11]/a")
    public static WebElement clothing;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[12]/a")
    public static WebElement pants;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[13]/a")
    public static WebElement shorts;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[14]/a")
    public static WebElement Skirts;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[15]/a")
    public static WebElement Suits;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[16]/a")
    public static WebElement sweater;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[17]/a")
    public static WebElement swimwear;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[18]/a")
    public static WebElement tops;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[20]/a")
    public static WebElement otherClothes;
    @FindBy(xpath ="//*[@id=\"w1-w0\"]/ul/li[19]/a")
    public static WebElement mixedLots;


    public void ShopFashion(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopCategoris.click();
    }
    public void ShopWomen(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopFashion();
        women.click();
    }
    public void ShopWomenActiveWear(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        womenActiveWear.click();
    }
    public void ShopWomenCoats(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        coatsAndJackets.click();
    }
    public void ShopWomenDresses(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        dresses.click();
    }
    public void ShopWomenSocks(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        socks.click();
    }
    public void ShopWomenSleepwear(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        sleepwear.click();
    }
    public void ShopWomenJeans(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        jeans.click();
    }
    public void ShopWomenRompers(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        rompers.click();
    }
    public void ShopWomenLeggings(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        leggins.click();
    }
    public void ShopWomenClothing(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        clothing.click();
    }
    public void ShopWomenpants(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        pants.click();
    }
    public void ShopWomenShorts(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        shorts.click();
    }
    public void ShopWomenSkirts(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        Skirts.click();
    }
    public void ShopWomenSuits(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        Suits.click();
    }
    public void ShopWomenSweater(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        sweater.click();
    }
    public void ShopWomenSwimwear(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        swimwear.click();
    }
    public void ShopWomenTops(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        tops.click();
    }
    public void ShopWomenOther(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        otherClothes.click();
    }
    public void ShopWomenmixedlots(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopWomen();
        mixedLots.click();
        Assert.assertEquals(mixedLots.getText(),"Women's Clothing Mixed Lots");
    }
}
