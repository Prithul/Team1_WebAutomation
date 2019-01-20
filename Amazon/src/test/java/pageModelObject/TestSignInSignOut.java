package pageModelObject;

import essentialUtility.SignInSignOut;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;

public class TestSignInSignOut extends essentialUtility.SignInSignOut {

    @Test
    public void test3_sisoWithValidUserValidPass()throws Exception, IOException, SQLException, ClassNotFoundException {
        SignInSignOut siso = PageFactory.initElements(driver, SignInSignOut.class);
        siso.getSignInSignOut(1,1);
    }
    @Test
    public void test4_sisoWithValidUserInvalidPass()throws Exception, IOException, SQLException, ClassNotFoundException {
        SignInSignOut siso = PageFactory.initElements(driver, SignInSignOut.class);
        siso.getSignInSignOut(1,0);
    }
    @Test
    public void test5_sisoWithInvalidUserValidPass()throws Exception, IOException, SQLException, ClassNotFoundException {
        SignInSignOut siso = PageFactory.initElements(driver, SignInSignOut.class);
        siso.getSignInSignOut(0,1);
    }
    @Test
    public void test6_sisoWithInvalidUserInvalidPass()throws Exception, IOException, SQLException, ClassNotFoundException {
        SignInSignOut siso = PageFactory.initElements(driver, SignInSignOut.class);
        siso.getSignInSignOut(0,0);
    }
}
