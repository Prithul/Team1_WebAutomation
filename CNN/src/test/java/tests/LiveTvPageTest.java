package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LiveTvPage;

public class LiveTvPageTest extends LiveTvPage{
//    @Test
//    public void testCheckLiveTv()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        liveTv.checkLiveTv();
//    }

//    @Test
//    public void testCheckLiveTvTitle()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkLiveTvTitle(),"CNNgo - CNN.com");
//    }
//@Test
//public void testCheckLiveTvUrl()
//{
//    LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//    Assert.assertEquals(liveTv.checkLiveTvUrl(),"https://go.cnn.com/?stream=cnn%3Fsr");
//}
//    @Test
//    public void testCheckLiveTvCross()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        liveTv.checkLiveTvClose();
//    }
//    @Test
//    public void testCheckLiveTvCrossUrl()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkLiveTvCloseUrl(),"https://www.cnn.com/tv");
//    }
//    @Test
//    public void testCheckLiveTvLoginLabel()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkLoginLabel(),"Login");
//    }
//    @Test
//    public void testCheckLiveTvHelpLabel()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//       liveTv.checkHelpClick();
//    }

//    @Test
//    public void testCheckLiveTvHelpUrl()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkHelpUrl(),"https://www.cnn.com/about");
//
//    }

    @Test
    public void testCheckListOfProviders() throws InterruptedException
    {
        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);

        liveTv.checkListOfProviders();
    }

//    @Test
//    public void testCheckListOfProvidersUrl1()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkListOfProvidersTitle(0),"AT&amp;T U-verse");
//        //liveTv.checkListOfProvidersUrl(0);
//    }
}
