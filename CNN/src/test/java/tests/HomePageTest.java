package tests;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavPage;

import java.util.concurrent.TimeUnit;


public class HomePageTest extends CommonAPI{
     WebDriver driver;
//  HomePage homePage = new HomePage(driver);
   //HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
   @Test

       public void checkHomeTitle() {
       HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
       //homePage.goCnn();
       String url=  homePage.driver.getCurrentUrl();
       String title = homePage.driver.getTitle();
       Assert.assertEquals(title,"CNN-Breaking News, Latest News and Videos");
       Assert.assertEquals(url,"https://www.cnn.com/");
   }
//   @Test
//        public void openNavPage() {
//       HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
//       homePage.navPageButton.click();
//   }
//    @Test
//        public void closeNavPage() {
//        homePage.navPageCrossButton.click();
//    }
//    @Test
//        public void expandSearchField() {
//        homePage.searchButton.click();
//    }
//    @Test
//        public void closeSearchField() {
//        homePage.searchButton.click();
//    }
//    @Test
//        public void writeOnTextBox()
//    {
//        homePage.goCnn();
//        homePage.searchButton.click();
//        homePage.
//    }
//
//     @Test
//    public void writeOn

    }


