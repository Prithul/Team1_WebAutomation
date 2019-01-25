package testNavPages;

import navPages.WholeFoods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestWholeFoods extends navPages.WholeFoods {
    @Test
    public void wholeFoodAlexaSearch()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WholeFoods wholeFoods = PageFactory.initElements(driver, WholeFoods.class);
        wholeFoods.alexa();
    }
    @Test
    public void wholeFoodWeeklyDeals()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WholeFoods wholeFoods = PageFactory.initElements(driver, WholeFoods.class);
        wholeFoods.weeklyDeals();
    }
    @Test
    public void wholeFoodPrimePantry()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WholeFoods wholeFoods = PageFactory.initElements(driver, WholeFoods.class);
        wholeFoods.primePantry();
    }
    @Test
    public void wholeFoodPrimeSignUp()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WholeFoods wholeFoods = PageFactory.initElements(driver, WholeFoods.class);
        wholeFoods.SignUpForPrime();
    }
}
