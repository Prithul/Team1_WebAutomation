package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.io.IOException;
import java.sql.SQLException;

public class GiftCards extends CommonAPI {

    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[3]")
    public static WebElement giftCards;

    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Print-at-Home')]")
    public static WebElement printAtHome;

    @FindBy(how = How.CSS, using ="#gc-customization-type-button-Upload")
    public static WebElement yourPhoto;

    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Custom user image')]")
    public static WebElement browse;

    @FindBy(how = How.CSS, using ="#gc-ciu-terms-check")
    public static WebElement checkTerms;

    @FindBy(how = How.CSS, using ="#gc-ciu-use-this-design-announce")
    public static WebElement useImage;

    public void buyGiftCard() throws Exception, IOException, SQLException, ClassNotFoundException{

        giftCards.click();
        printAtHome.click();
        yourPhoto.click();
        browse.click();
//      browse.sendKeys("C:\\Users\\Papri.Barua\\Desktop\\Pri.JPG");
        Runtime.getRuntime().exec("C:\\Users\\Papri.Barua\\Desktop\\Script2.exe");
//      checkTerms.click();
//      useImage.click();
    }
}
