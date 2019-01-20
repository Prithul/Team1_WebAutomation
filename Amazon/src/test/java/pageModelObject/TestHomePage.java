package pageModelObject;

import essentialUtility.HomePage;
import essentialUtility.SearchPageForDB;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestHomePage extends essentialUtility.HomePage {

    @Test
    public void getAmazonCareer() throws Exception, IOException, SQLException, ClassNotFoundException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.careerLink();
    }
    @Test
    public void getAmazonBlog() throws Exception, IOException, SQLException, ClassNotFoundException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.blogLink();
    }
    @Test
    public void getAmazonAbout() throws Exception, IOException, SQLException, ClassNotFoundException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.aboutAmazonLink();
    }
    @Test
    public void getAmazonHelp() throws Exception, IOException, SQLException, ClassNotFoundException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.helpLink();
    }
    @Test
    public void getAmazonShippingRate() throws Exception, IOException, SQLException, ClassNotFoundException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.shippingRateLink();
    }
    @Test
    public void getAmazonReturn() throws Exception, IOException, SQLException, ClassNotFoundException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.returnAndReplacementLink();
    }
    @Test
    public void getAmazonMusic() throws Exception, IOException, SQLException, ClassNotFoundException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.amazonMusicLink();
    }
    @Test
    public void getAmazonBusiness() throws Exception, IOException, SQLException, ClassNotFoundException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.amazonBusinessLink();
    }
    @Test
    public void getAmazonWebServices() throws Exception, IOException, SQLException, ClassNotFoundException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.amazonWebServicesLink();
    }
}