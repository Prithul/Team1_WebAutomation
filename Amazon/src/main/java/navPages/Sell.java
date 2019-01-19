package navPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;

public class Sell extends CommonAPI {

    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[6]")
    public static WebElement sell;

    @FindBy(how = How.LINK_TEXT, using ="Start selling")
    public static WebElement viewStory;

    public void sell() throws Exception, IOException, SQLException, ClassNotFoundException{
        sell.click();
        viewStory.click();
        Thread.sleep(2000);
    }
}
