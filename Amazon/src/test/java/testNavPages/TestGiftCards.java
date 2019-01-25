package testNavPages;

import navPages.GiftCards;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestGiftCards extends navPages.GiftCards {
    @Test
    public void getGiftCard() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GiftCards giftCards = PageFactory.initElements(driver, GiftCards.class);
        giftCards.buyGiftCard();
    }
    @Test
    public void reloadAmountCheck() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GiftCards giftCards = PageFactory.initElements(driver, GiftCards.class);
        giftCards.reload();
    }
    @Test
    public void reloadGiftCards() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GiftCards giftCards = PageFactory.initElements(driver, GiftCards.class);
        giftCards.reloadBalance();
    }
}
