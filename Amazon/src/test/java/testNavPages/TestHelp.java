package testNavPages;

import navPages.Help;
import navPages.Registry;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestHelp extends navPages.Help {
    @Test
    public void checkHelp()throws Exception, IOException, SQLException, ClassNotFoundException {
        Help help = PageFactory.initElements(driver, Help.class);
        help.help();
    }
}
