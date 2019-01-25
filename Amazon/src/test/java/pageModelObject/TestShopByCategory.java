package pageModelObject;

import essentialUtility.ShopByCategory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestShopByCategory extends ShopByCategory {
    @Test
    public void viewShopByCategory()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopByCategory category = PageFactory.initElements(driver, ShopByCategory.class);
        category.getCategory();
    }
    @Test
    public void primeVideo()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopByCategory category = PageFactory.initElements(driver, ShopByCategory.class);
        category.getPrimeVideo();
    }
    @Test
    public void amazonMusic()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopByCategory category = PageFactory.initElements(driver, ShopByCategory.class);
        category.getAmazonMusic();
    }
    @Test
    public void getCartStatus()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShopByCategory cartStatus = PageFactory.initElements(driver, ShopByCategory.class);
        cartStatus.getCartStatus();
        Thread.sleep(2000);
    }
}
