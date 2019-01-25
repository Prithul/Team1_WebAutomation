package testNavPages;

import navPages.TodayDeal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestTodayDeal extends navPages.TodayDeal {
    @Test
    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TodayDeal todayDeal = PageFactory.initElements(driver, TodayDeal.class);
        todayDeal.clickOnTodayDeal1();
    }
    @Test
    public void searchDeals()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TodayDeal todayDeal = PageFactory.initElements(driver, TodayDeal.class);
        todayDeal.clickOnTodayDeal2();
    }
}
