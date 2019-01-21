package restAPI;

import org.testng.annotations.Test;

public class TestRestAssured extends getRequest.GetData {

    @Test
    public void getResponseCode(){
        responseCode();
    }
    @Test
    public void getResponseBody(){
        body();
    }
}
