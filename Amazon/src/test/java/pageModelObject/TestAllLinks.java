package pageModelObject;

import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;

public class TestAllLinks extends essentialUtility.AllLinks {

    @Test
    public void checkAllLinks()throws Exception, IOException, SQLException, ClassNotFoundException {
        getUrlForallLinks();
        getTextForallLinks();
    }
}
