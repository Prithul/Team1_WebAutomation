package pageModelObject;

import essentialUtility.LogoAndVideo;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestLogoAndVideo extends LogoAndVideo {
    @Test
    public void amazonLogo()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LogoAndVideo logo = PageFactory.initElements(driver, LogoAndVideo.class);
        logo.logoTest();
    }
    @Test
    public void amazonLogo2()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LogoAndVideo logo = PageFactory.initElements(driver, LogoAndVideo.class);
        logo.logoTest2();
    }
//    @Test
//    public void liveVideo()throws Exception, IOException, SQLException, ClassNotFoundException {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        LogoAndVideo logo = PageFactory.initElements(driver, LogoAndVideo.class);
//        logo.liveVideo();
//    }
}
