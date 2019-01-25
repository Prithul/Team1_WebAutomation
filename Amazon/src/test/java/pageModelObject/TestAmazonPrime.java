package pageModelObject;

import amazonPrimeCheckout.AmazonPrime;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestAmazonPrime extends amazonPrimeCheckout.AmazonPrime {
        @Test
        public void amazonPrime()throws Exception, IOException, SQLException, ClassNotFoundException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            AmazonPrime prime = PageFactory.initElements(driver, AmazonPrime.class);
            prime.clickOnAmazonPrime();
        }
}
