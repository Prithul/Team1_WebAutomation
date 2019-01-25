package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.List;

public class BrokenImages extends CommonAPI {

    public void getImageLinks() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> links = driver.findElements(By.tagName("img"));
        System.out.println("Total links are " + links.size());
        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("src");
            verifyLink(url); }
    }
    public void verifyLink(String urlLink) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            URL link = new URL(urlLink);
            HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
            httpConn.setConnectTimeout(2000);
            httpConn.connect();
            if (httpConn.getResponseCode() == 200) {
                System.out.println(urlLink + " - " + httpConn.getResponseMessage()); }
            if (httpConn.getResponseCode() == 401) {
                System.out.println(urlLink + " - " + httpConn.getResponseMessage()); }
        }catch (Exception e) {
            e.printStackTrace(); }
    }
}