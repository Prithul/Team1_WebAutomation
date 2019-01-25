package pageModelObject;

import essentialUtility.HiddenButton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestHiddenButton extends essentialUtility.HiddenButton {
    @Test
    public void valentineHiddenButton1()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HiddenButton hiddenButton = PageFactory.initElements(driver, HiddenButton.class);
        hiddenButton.valentineItem();
    }
}
