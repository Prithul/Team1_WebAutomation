package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
        yourAmazon.click();
        getCurrentURL();
    }
    public void urlCheck2(){
        todayDeal.click();
        getCurrentURL();
    }
    public void urlCheck3(){
        giftCards.click();
        getCurrentURL();
    }
    public void urlCheck4(){
        wholeFoods.click();
        getCurrentURL();
    }
    public void urlCheck5(){
        registry.click();
        getCurrentURL();
    }
    public void urlCheck6(){
        sell.click();
        getCurrentURL();
    }
    public void urlCheck7(){
        help.click();
        getCurrentURL();
    }
    public void titleCheck1(){
        yourAmazon.click();
        getPageTitle();
    }
    public void titleCheck2(){
        todayDeal.click();
        getPageTitle();
    }
    public void titleCheck3(){
        giftCards.click();
        getPageTitle();
    }
    public void titleCheck4(){
        wholeFoods.click();
        getPageTitle();
    }
    public void titleCheck5(){
        registry.click();
        getPageTitle();
    }
    public void titleCheck6(){
        sell.click();
        getPageTitle();
    }
    public void titleCheck7(){
        help.click();
        getPageTitle();
    }
}
