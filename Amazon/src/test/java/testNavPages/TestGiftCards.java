package testNavPages;

import navPages.GiftCards;
import navPages.TodayDeal;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestGiftCards extends navPages.GiftCards {

    @Test
    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException{
        GiftCards giftCards = PageFactory.initElements(driver, GiftCards.class);
        giftCards.buyGiftCard();
    }
}
