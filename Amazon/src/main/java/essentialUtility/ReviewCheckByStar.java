package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class ReviewCheckByStar extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[2]")
    public static WebElement todayDeal;
    @FindBy(how = How.CSS, using =".a-icon.a-icon-star.a-star-4")
    public static WebElement star4;
    @FindBy(how = How.CSS, using =".a-icon.a-icon-star.a-star-3")
    public static WebElement star3;
    @FindBy(how = How.CSS, using =".a-icon.a-icon-star.a-star-2")
    public static WebElement star2;
    @FindBy(how = How.CSS, using =".a-icon.a-icon-star.a-star-1")
    public static WebElement star1;

    public void checkReview4() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDeal.click();
        star4.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void checkReview3() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDeal.click();
        star3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void checkReview2() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDeal.click();
        star2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void checkReview1() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todayDeal.click();
        star1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
}
