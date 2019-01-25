package tests;

import EbayPom.ShopByCategory;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import EbayPom.ShopShoes;

public class testShopShoes extends ShopShoes {
    ShopShoes shopShoes;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopShoes = PageFactory.initElements(driver, ShopShoes.class); }

    @Test
     public void test87(){
        ShopShoes();
    }
    @Test
    public void test88(){
        ShopWomenBoots();
    }
    @Test
    public void test89(){
        ShopWomenAthletic();
    }
    @Test
    public void test90(){ ShopWomenFlats(); }
    @Test
    public void test91(){
        ShopWomenHeels();
    }
    @Test
    public void test92(){
        ShopWomenSlippers();
    }
    @Test
    public void test93(){
        ShopWomenSandals();
    }
    @Test
    public void test94(){
        ShopWomenOccupational();
    }
    @Test
    public void test95(){
        ShopMenAthletic();
    }
    @Test
    public void test96(){
        ShopMenBoots();
    }
    @Test
    public void test97(){
        ShopMenDress();
    }
    @Test
    public void test98(){ ShopMenCasual(); }
    @Test
    public void test99(){
        ShopMenSlippers();
    }
    @Test
    public void test100(){
        ShopMenSandals();
    }
    @Test
    public void test101(){
        ShopMenOccupationl();
    }
}
