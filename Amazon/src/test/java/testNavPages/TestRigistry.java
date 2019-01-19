package testNavPages;

import navPages.Registry;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestRigistry extends navPages.Registry {

    @Test
    public void registryItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        Registry registry = PageFactory.initElements(driver, Registry.class);
        registry.registry();
    }
}
