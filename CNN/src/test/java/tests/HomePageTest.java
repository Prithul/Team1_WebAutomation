package tests;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;


public class HomePageTest extends CommonAPI {
   HomePage homePage = new HomePage(driver);

   @Test
       public void checkHomeTitle() {
       homePage.goCnn();
       String url=  driver.getCurrentUrl();
       String title = driver.getTitle();
       Assert.assertEquals(title,"CNN-Breaking News, Latest News and Videos");
       Assert.assertEquals(url,"https://www.cnn.com/");
   }
   @Test
       public void openNavPage() {
       homePage.navPageButton.click();
   }
    @Test
    public void closeNavPage() {
        homePage.navPageCrossButton.click();
    }
    @Test
            public void expandSearchField() {
        homePage.searchButton.click();
    }
    @Test
    public void closeSearchField() {
        homePage.searchButton.click();
    }



    }


