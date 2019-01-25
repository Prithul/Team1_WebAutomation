package pageModelObject;

import essentialUtility.RadioButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestRadioButton extends essentialUtility.RadioButton {
    @Test
    public void selectLanguage()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RadioButton radioButton = PageFactory.initElements(driver, RadioButton.class);
        radioButton.getLanguage();
    }
}
