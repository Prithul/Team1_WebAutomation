package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;

public class HomePage extends CommonAPI {

    @FindBy(how = How.LINK_TEXT, using ="Careers")
    public WebElement career;
    @FindBy(how = How.LINK_TEXT, using ="Blog")
    public WebElement blog;
    @FindBy(how = How.LINK_TEXT, using ="About Amazon")
    public WebElement aboutAmazon;
    @FindBy(how = How.LINK_TEXT, using ="Help")
    public WebElement helpAmazon;
    @FindBy(how = How.LINK_TEXT, using ="Shipping Rates & Policies")
    public WebElement rateAmazon;
    @FindBy(how = How.LINK_TEXT, using ="Returns & Replacements")
    public WebElement returnAmazon;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using ="Amazon Music")
    public WebElement musicAmazon;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using ="Amazon Business")
    public WebElement businessAmazon;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using ="Amazon Web Services")
    public WebElement webServicesAmazon;

    public void careerLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        career.click();
    }
    public void blogLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        blog.click();
    }
    public void aboutAmazonLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        aboutAmazon.click();
    }
    public void helpLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        helpAmazon.click();
    }
    public void shippingRateLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        rateAmazon.click();
    }
    public void returnAndReplacementLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        returnAmazon.click();
    }
    public void amazonMusicLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        musicAmazon.click();
    }
    public void amazonBusinessLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        businessAmazon.click();
    }
    public void amazonWebServicesLink() throws Exception, IOException, SQLException, ClassNotFoundException{
        webServicesAmazon.click();
    }
}
