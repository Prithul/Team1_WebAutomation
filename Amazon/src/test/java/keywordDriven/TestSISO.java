package keywordDriven;

import org.testng.annotations.Test;

public class TestSISO extends keywordDrivenUtility.DriverScript {
    @Test
    public void amazonSignIn() throws Exception{
        testSignIn();
    }
}
