package pageModelObject;

import amazonPrime.AmazonPrime;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestAmazonPrime extends amazonPrime.AmazonPrime {

        @Test
        public void amazonPrime()throws Exception, IOException, SQLException, ClassNotFoundException {
            AmazonPrime prime = PageFactory.initElements(driver, AmazonPrime.class);
            prime.clickOnAmazonPrime();
        }
}
