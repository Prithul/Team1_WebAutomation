package tests;

import EbayPom.EbayHome;
import EbayPom.RegisterAccount;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class testCreateAccount extends RegisterAccount{
        RegisterAccount registeraccount;
        @BeforeMethod
        public void initialize() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            registeraccount = PageFactory.initElements(driver, RegisterAccount.class); }

        @Test
        public void test66(){
        createAccountEbay();
    }
}
