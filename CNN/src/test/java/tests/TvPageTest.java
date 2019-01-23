package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TvPage;

public class TvPageTest extends TvPage {
    TvPage tvpage;

//    @BeforeTest
//            public void initPage() {
//         driver.get("https://www.cnn.com/tv");
//         tvpage = new PageFactory().initElements(driver, TvPage.class);
//   }
//    @Test
//    public void testTvPageUrl()
//    {
//       String url =getTvPageUrl();
//        Assert.assertEquals(url ,"https://www.cnn.com/tv");
//    }
//    @Test
//    public void testTvPageTitle()
//    {
//        String pageTitle = getTvPageTitle();
//        Assert.assertEquals(pageTitle,"CNN TV - CNN");
//    }
//    @Test
//    public void testNoOfIFrame()
//    {
//        Assert.assertEquals(getNoOfIframe(),14);
//    }
//    @Test
//    public void testNoOfLinks()
//{
//
//    Assert.assertEquals(getNoOfLinks(),325);
//}
//    @Test
//    public void testFirstIframe() throws InterruptedException{ getFirstIframe();}
//    @Test
//    public void testFirstIframeUrls() throws InterruptedException
//    {
//        String url = getFirstIframeUrls();
//        System.out.println(url);
//
//    }
//    @Test
//    public void testTvHeading()throws InterruptedException
//    {
//        driver.get("https://www.cnn.com/tv");
//        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//        Assert.assertEquals(tvpage.getHeaderTV(),"TV");
//    }
 //   @Test
//    public void testDontMissOnCnn()throws InterruptedException
//    {
//        driver.get("https://www.cnn.com/tv");
//        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//
//        Assert.assertEquals(tvpage.getDontMissOnCnn(),"Don't miss on CNN ");
//
//    }
//    @Test
//    public void testClickOnFirstTab()
//    {
//    driver.get("https://www.cnn.com/tv");
//    TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//    tvpage.clickOnFirstTab();
//    }
//    @Test
//    public void testFirstTabUrl()
//    {
//        driver.get("https://www.cnn.com/tv");
//        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//        Assert.assertEquals(tvpage.getFirstTabUrl(),"https://explorepartsunknown.com/");
//
//    }
//    @Test
//    public void testClickOnSecondTab()
//    {
//        driver.get("https://www.cnn.com/tv");
//        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//        tvpage.clickOnSecondTab();
//    }
//    @Test
//    public void testSecondTabUrl()
//    {
//        driver.get("https://www.cnn.com/tv");
//        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//        Assert.assertEquals(tvpage.getSecondTabUrl(),"https://www.cnn.com/shows/this-is-life-with-lisa-ling");
//
//    }
//    @Test
//    public void testClickOnThirdTab()
//    {
//        driver.get("https://www.cnn.com/tv");
//        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//        tvpage.clickOnThirdTab();
//    }
//    @Test
//    public void testThirdTabUrl()
//    {
//        driver.get("https://www.cnn.com/tv");
//        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//        Assert.assertEquals(tvpage.getThirdTabUrl(),"https://www.cnn.com/shows/cuomo-prime-time");
//
//    }
  //  @Test
//    public void testGoCnnTitle()
//    {
//        driver.get("https://www.cnn.com/tv");
//        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//        String goCnnText = tvpage.goCnnTitle();
//        Assert.assertEquals("Watch CNN on demand with CNNgo ",goCnnText);
//
//    }
//   @Test
//    public void testClickOnGoCnnImage()
//    {
//        driver.get("https://www.cnn.com/tv");
//        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
//        tvpage.clickOnGoCnnImage();
//    }
    @Test
    public void testGoCnnImageUrl()
    {
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        String url = tvpage.goCnnImageUrl();
        Assert.assertEquals(url,"https://go.cnn.com/?stream=cnn");
    }
//@Test
//    public void SwitchToframe()   {
//    driver.get("https://www.cnn.com/tv");
//        int size = driver.findElements(By.tagName("iframe")).size();
//        for(int i=0; i<=size; i++){
//	    driver.switchTo().frame(i);
//	    int total= driver.findElements(By.cssSelector("#google_ads_iframe_/8663477/CNN/tv/landing_0")).size();
//		System.out.println(total);
//	    driver.switchTo().defaultContent(); //switching back from the iframe
//	 }
//
//            //Commented the code for finding the index of the element
//            driver.switchTo().frame(0); //Switching to the frame
//            System.out.println("********We are switched to the iframe*******");
//            driver.findElement(By.cssSelector("#aw0 > img")).click();
//
//            //Clicking the element in line with Advertisement
//            System.out.println("*********We are done***************");
//        }

}
