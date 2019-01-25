package tests;

import EbayPom.ShopByCategory;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class testShopByCategory extends ShopByCategory{

    ShopByCategory shopByCategory;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategory = PageFactory.initElements(driver, ShopByCategory.class); }

    @Test
    public void test67(){
        ShopFashion();
    }
    @Test
    public void test68(){
        ShopWomen();
    }
    @Test
    public void test69(){
        ShopWomenActiveWear();
    }
    @Test
    public void test70(){
        ShopWomenCoats();
    }
    @Test
    public void test71(){
        ShopWomenDresses();
    }
    @Test
    public void test72(){
        ShopWomenSocks();
    }
    @Test
    public void test73(){
        ShopWomenSleepwear();
    }
    @Test
    public void test74(){
        ShopWomenJeans();
    }
    @Test
    public void test75(){
        ShopWomenRompers();
    }
    @Test
    public void test76(){
        ShopWomenLeggings();
    }
    @Test
    public void test77(){
        ShopWomenClothing();
    }
    @Test
    public void test78(){
        ShopWomenpants();
    }
    @Test
    public void test79(){
        ShopWomenShorts();
    }
    @Test
    public void test80(){
        ShopWomenSkirts();
    }
    @Test
    public void test81(){
        ShopWomenSuits();
    }
    @Test
    public void test82(){
        ShopWomenSweater();
    }
    @Test
    public void test83(){
        ShopWomenSwimwear();
    }
    @Test
    public void test84(){
        ShopWomenmixedlots();
    }
    @Test
    public void test85(){
        ShopWomenTops();
    }
    @Test
    public void test86(){
        ShopWomenOther();
    }
}
