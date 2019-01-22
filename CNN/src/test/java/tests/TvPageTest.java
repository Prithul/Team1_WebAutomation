package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TvPage;

public class TvPageTest extends TvPage {
    TvPage tvPage;

    @BeforeTest
            public void initPage() {
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
    }
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
    @Test
    public void testFirstIframe() throws InterruptedException{ getFirstIframe();}
//    @Test
//    public void testFirstIframeUrl()
//    {
//        String url = getFirstIframeUrl();
//
//    }
//    @Test
//    public void testClickOnFirstTab()
//    {
//        clickOnFirstTab();
//    }
//    @Test
//    public void testClickOnSecondTab()
//    {
//        clickOnSecondTab();
//    }
//    @Test
//    public void testClickOnThirdTab()
//    {
//        clickOnThirdTab();
//    }
//    @Test
//    public void testGoCnnTitle()
//    {
//        String goCnnText = goCnnTitle();
//        Assert.assertEquals("Watch CNN on demand with CNNgo",goCnnText);
//
//    }
//   @Test
//    public void testClickOnGoCnnImage()
//    {
//       clickOnGoCnnImage();
//    }
//    @Test
//    public void testGoCnnImageUrl()
//    {
//        String url = goCnnImageUrl();
//        Assert.assertEquals(url,"http://go.cnn.com/?stream=cnn");
//    }
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
