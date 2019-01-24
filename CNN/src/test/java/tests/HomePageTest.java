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
import reporting.TestLogger;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageTest extends CommonAPI {
    HomePage homePage;
 @Test
      public void checkHomeUrl() {
     TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
       //homePage.goCnn();
       String url=  homePage.getUrl();
        Assert.assertEquals(url,"https://www.cnn.com/");
   }

    @Test
    public void checkHomeTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        String title = homePage.driver.getTitle();
        Assert.assertEquals(title,"CNN - Breaking News, Latest News and Videos");
     }
   @Test
        public void openNavPage() throws InterruptedException{
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
        homePage.navPageButton.click();
        Thread.sleep(500);
   }
    @Test
        public void closeNavPage() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.navPageButton.click();
        Thread.sleep(500);
        homePage.navPageCrossButton.click();
   }
    @Test
        public void expandSearchField() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        Thread.sleep(500);
        homePage.searchButton.click();
    }
    @Test
        public void closeSearchField()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.searchButton.click();
        sleepFor(2);
        homePage.searchButton.click();
    }
    @Test
        public void writeOnTextBox()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.searchButton.click();
        Thread.sleep(500);
        homePage.searchTextBox.sendKeys("politics");
    }
        @Test
        public void writeOnTextBoxNSearch()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.searchButton.click();
        Thread.sleep(500);
        homePage.searchTextBox.sendKeys("politics");
        homePage.searchSubmitButton.submit();
    }
    @Test
    public void writeOnTextBoxNEnter()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.searchButton.click();
        Thread.sleep(500);
        homePage.searchTextBox.sendKeys("politics",Keys.ENTER);

    }
    @Test
    public void editionPageOpen()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        sleepFor(5);
        homePage.navSectionExpand.click();
    }

    @Test
    public void editionPageclose()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        sleepFor(1);
        homePage.navSectionExpand.click();
        sleepFor(3);
        homePage.navSectionClose.click();
    }
    @Test
    public void editionUSOpen()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        sleepFor(1);
        homePage.usEditionOpen.click();
    }

    @Test
    public void editionUSClose()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        sleepFor(1);
        homePage.usEditionOpen.click();
        sleepFor(3);
        homePage.usEditionClose.click();
    }
    @Test
    public void editionList()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        sleepFor(1);
        Assert.assertEquals(homePage.editionList.size(),2);

    }
    @Test
    public void navBarList()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        sleepFor(1);
        Assert.assertEquals(homePage.navItemList.size(),11);

    }
    @Test
    public void getNavListName0()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(0).getText(),"U.S.");
    }
    @Test
    public void getNavListName1()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(1).getText(),"World");
    }
    @Test
    public void getNavListName2()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(2).getText(),"Politics");
    }
    @Test
    public void getNavListName3()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(3).getText(),"Business");
    }
    @Test
    public void getNavListName4()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(4).getText(),"Opinion");
    }
    @Test
    public void getNavListName5()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(5).getText(),"Health");
    }
    @Test
    public void getNavListName6()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(6).getText(),"Entertainment");
    }
    @Test
    public void getNavListName7()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(7).getText(),"Style");
    }
    @Test
    public void getNavListName8()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(8).getText(),"Travel");
    }
    @Test
    public void getNavListName9()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(9).getText(),"Sports");
    }
    @Test
    public void getNavListName10()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        List<WebElement> list = homePage.navItemList;
        Assert.assertEquals(homePage.navItemList.get(10).getText(),"Video");
    }

     }


