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
//    public void testCheckListOfProviders()
//    {
//        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
//        //Assert.assertEquals(liveTv.checkHelpUrl(),"https://www.cnn.com/about");
//        liveTv.checkListOfProviders();
//    }

    @Test
    public void testCheckListOfProvidersUrl1()
    {
        LiveTvPage liveTv = new PageFactory().initElements(driver, LiveTvPage.class);
        Assert.assertEquals(liveTv.checkListOfProvidersUrl(0),"https://loginprodx.att.net/commonLogin/igate_edam/controller.do?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&ERROR_TEXT=HPDBA0521I%20%20%20Successful%20completion&METHOD=GET&URL=%2FFIM%2Fsps%2Fauth%3FFedName%3DATT-ADB%26FedId%3Duuid2b03a1d7-0139-1cca-be40-d32385710be9%3Ftucd567%3Dw&REFERER=https%3A%2F%2Fsp.auth.adobe.com%2Fadobe-services%2Fauthenticate%2Fsaml%3Fnoflash%3Dtrue%26mso_id%3DATT%26requestor_id%3DCNN%26no_iframe%3Dtrue%26domain_name%3Dadobe.com%26redirect_url%3Dhttps%253A%252F%252Fentitlement.auth.adobe.com%252Fentitlement%252Fjs%252FcompleteBackgroundLogin.html&HOSTNAME=loginprodx.att.net&AUTHNLEVEL=&FAILREASON=&PROTOCOL=https&OLDSESSION=");
        //liveTv.checkListOfProvidersUrl(0);
    }
}
