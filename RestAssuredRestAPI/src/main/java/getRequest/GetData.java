package getRequest;

import org.testng.Assert;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData{

        public void responseCode(){
            int code = get("https://samples.openweathermap.org/data/2.5/weather?zip=08016,us&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
            System.out.println("Status code: " + code);
            Assert.assertEquals(code,200);
        }
        public void data(){
            String data = get("https://samples.openweathermap.org/data/2.5/weather?zip=08016,us&appid=b6907d289e10d714a6e88b30761fae22").asString();
            System.out.println("Data from Server: " + data);
        }
        public void responseTime(){
            long time = get("https://samples.openweathermap.org/data/2.5/weather?zip=08016,us&appid=b6907d289e10d714a6e88b30761fae22").getTime();
            System.out.println("Response Time: " + time);
        }
    }

