package pageModelObject;

import essentialUtility.SignInSignOut;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestSignInSignOut extends essentialUtility.SignInSignOut {
    @Test
    public void SisoWithValidUserValidPass()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignInSignOut siso = PageFactory.initElements(driver, SignInSignOut.class);
        siso.getSignInSignOut(1,1); }
    @Test
    public void SisoWithValidUserInvalidPass()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignInSignOut siso = PageFactory.initElements(driver, SignInSignOut.class);
        siso.getSignInSignOut(1,0); }
    @Test
    public void SisoWithInvalidUserValidPass()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignInSignOut siso = PageFactory.initElements(driver, SignInSignOut.class);
        siso.getSignInSignOut(0,1); }
    @Test
    public void SisoWithInvalidUserInvalidPass()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignInSignOut siso = PageFactory.initElements(driver, SignInSignOut.class);
        siso.getSignInSignOut(0,0); }
}
