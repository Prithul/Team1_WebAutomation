package tests;

import base.CommonAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;
import static io.restassured.RestAssured.given;

public class CnnAPITest extends CommonAPI {
    @Test
    public void callNewsResourses() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Response response = given().when().get("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().print();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }


    @Test
    public void badCallNewsResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("https://newsapi.org/v2/top-headlinessc?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f");
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 404);
    }

    @Test
    public void serverErrorCallNewsResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f").then().statusCode(200).extract().response();
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 200);
    }
}
