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

//    @Test
//    public void testCheckNoOfProviders() throws InterruptedException
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//        Assert.assertEquals(liveTv.checkNoOfProviders(),9);
//    }

//        @Test
//    public void testCheckNoOfProviders0() throws InterruptedException
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//        liveTv.checkListOfProviders(0);
//    }


//    @Test
//    public void testCheckNoOfProviders1() throws InterruptedException {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//        liveTv.checkListOfProviders(1);
//    }
//        @Test
//        public void testCheckNoOfProviders2() throws InterruptedException {
//            LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//            liveTv.checkListOfProviders(2);
//        }
//    @Test
//    public void testCheckNoOfProviders3() throws InterruptedException {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//        liveTv.checkListOfProviders(3);
//    }
//    @Test
//    public void testCheckNoOfProviders4() throws InterruptedException {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//        liveTv.checkListOfProviders(4);
//    }
//    @Test
//    public void testCheckNoOfProviders5() throws InterruptedException {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//        liveTv.checkListOfProviders(5);
//    }
//    @Test
//    public void testCheckNoOfProviders6() throws InterruptedException {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//        liveTv.checkListOfProviders(6);
//    }
//    @Test
//    public void testCheckNoOfProviders7() throws InterruptedException {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//        liveTv.checkListOfProviders(7);
//    }
//    @Test
//    public void testCheckNoOfProviders8() throws InterruptedException {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//
//        liveTv.checkListOfProviders(8);
//    }
//    @Test
//    public void testCheckListOfProvidersTitle0()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkListOfProvidersTitle(0),"AT&T - Login");
//        //liveTv.checkListOfProvidersUrl(0);
//    }
//    @Test
//    public void testCheckListOfProvidersTitle1() throws InterruptedException
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkListOfProvidersTitle(1),"Cox Communications - Residential Home");
//        //liveTv.checkListOfProvidersUrl(0);
//    }
//    @Test
//    public void testCheckListOfProvidersTitle2() throws InterruptedException
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkListOfProvidersTitle(2),"DIRECTV Login or Register");
//
//    }
//    @Test
//    public void testCheckListOfProvidersTitle3() throws InterruptedException
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkListOfProvidersTitle(3),"DISH | Login");
//
//    }
//    @Test
//    public void testCheckListOfProvidersTitle4() throws InterruptedException
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkListOfProvidersTitle(4),"Optimum Online");
//
//    }
//    @Test
//    public void testCheckListOfProvidersTitle5() throws InterruptedException
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkListOfProvidersTitle(5),"Sign in with your Spectrum username and password.");
//
//    }
//    @Test
//    public void testCheckListOfProvidersTitle6() throws InterruptedException
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkListOfProvidersTitle(6),"Suddenlink | Login");
//
//    }
//    @Test
//    public void testCheckListOfProvidersTitle7() throws InterruptedException
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        Assert.assertEquals(liveTv.checkListOfProvidersTitle(7),"Verizon FiOS - sign in");
//
//    }
    @Test
    public void testCheckListOfProvidersTitle8() throws InterruptedException
    {
        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
        Assert.assertEquals(liveTv.checkListOfProvidersTitle(8),"Sign in to watch Xfinity TV online");

    }
}
