package pageModelObject;

import essentialUtility.ArrowKeys;
import essentialUtility.CheckBox;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;

public class TestCheckBox extends essentialUtility.CheckBox {
    @Test
    public void checkBoxes()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CheckBox checkbox = PageFactory.initElements(driver, CheckBox.class);
        checkbox.ClickAllCheckboxes();
    }
}
