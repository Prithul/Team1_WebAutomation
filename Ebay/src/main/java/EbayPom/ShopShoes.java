package EbayPom;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ShopShoes extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-shop-a\"]")
    public static WebElement shopCategoris;
    @FindBy(xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[2]/ul[1]/li[4]/a")
    public static WebElement shopShoes;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[1]/a")
    public static WebElement womenBoots;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[2]/a")
    public static WebElement womenAthletic;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[3]/a")
    public static WebElement womenFlats;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[4]/a")
    public static WebElement womenHeels;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[5]/a")
    public static WebElement womenSlippers;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[6]/a")
    public static WebElement womenSandals;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[7]/a")
    public static WebElement womenOccupatinal;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[1]/a")
    public static WebElement menAthletic;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[2]/a")
    public static WebElement menBoots;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[3]/a")
    public static WebElement menDress;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[4]/a")
    public static WebElement menCasual;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[5]/a")
    public static WebElement menSlippers;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[6]/a")
    public static WebElement menSandals;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[7]/a")
    public static WebElement menOccupational;

    public void ShopFashion(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopCategoris.click();
    }
    public void ShopShoes(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopFashion();
        shopShoes.click();
    }
    public void ShopWomenBoots(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        womenBoots.click();
    }
    public void ShopWomenAthletic(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        womenAthletic.click();
    }
    public void ShopWomenFlats(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        womenFlats.click();
    }
    public void ShopWomenHeels(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        womenHeels.click();
    }
    public void ShopWomenSlippers(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        womenSlippers.click();
    }
    public void ShopWomenSandals(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        womenSandals.click();
    }
    public void ShopWomenOccupational(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        womenOccupatinal.click();
    }
    public void ShopMenAthletic(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        menAthletic.click();
    }
    public void ShopMenBoots(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        menBoots.click();
    }
    public void ShopMenDress(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        menDress.click();
    }
    public void ShopMenCasual(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        menCasual.click();
    }
    public void ShopMenSlippers(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        menSlippers.click();
    }
    public void ShopMenSandals(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        menSandals.click();
    }
    public void ShopMenOccupationl(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopShoes();
        menOccupational.click();
    }
}