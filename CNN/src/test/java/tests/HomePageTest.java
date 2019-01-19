package tests;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavPage;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageTest extends CommonAPI {
    HomePage homePage;
 @Test
      public void checkHomeTitle() {
       HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
       //homePage.goCnn();
       String url=  homePage.getUrl();
       String title = homePage.driver.getTitle();
       Assert.assertEquals(title,"CNN - Breaking News, Latest News and Videos");
       Assert.assertEquals(url,"https://www.cnn.com/");
   }
   @Test
        public void openNavPage() throws InterruptedException{
      HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
       driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
       System.out.println("openNav");
       homePage.navPageButton.click();
      Thread.sleep(500);
   }
    @Test
        public void closeNavPage() throws InterruptedException{
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.navPageButton.click();
        Thread.sleep(500);
        homePage.navPageCrossButton.click();
   }
    @Test
        public void expandSearchField() throws InterruptedException{
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        Thread.sleep(500);
        homePage.searchButton.click();
    }
    @Test
        public void closeSearchField()throws InterruptedException {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.searchButton.click();
    }
    @Test
        public void writeOnTextBox()throws InterruptedException
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.searchButton.click();
        Thread.sleep(500);
        homePage.searchTextBox.sendKeys("politics");
    }
    @Test
    public void getNavList()throws InterruptedException
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.getListOfItem("a")  ;    //homePage.navItemList;
        List<String> slist = getListOfString(list);
           for(int i=0;i<slist.size();i++)
               System.out.println("     " +slist.get(i));
    }
     }


