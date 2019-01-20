package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import util.GoogleSheetAPI;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSheet  extends GoogleSheetAPI {



        //public WebDriver driver;
       // public WebDriverWait wait;
       // String appURL = "appURL";

        private String spreadsheetId = "1izyUGbEaQIQnVDkYJlxs0b_H9yWht5HL-nEqfwJgx9k";
        private String range = "Sheet1!A3:C";
      //  String firstName = "amela";
      //  String lastName = "dervishi";
      //  String password = "123456";

       /* @BeforeClass
        public void testSetup() {
            System.setProperty("webdriver.gecko.driver","path of geckodriver.exe");
            driver=new FirefoxDriver();
            wait = new WebDriverWait(driver, 5);
        }*/

        //Verify user profile information after login

    /*    for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
            String name = reader.getCellData("Sheet1", "Name", rowNum);
            System.out.println(name);
            String lastName = reader.getCellData("Sheet1", "LastName", rowNum);
            System.out.println(lastName);
            Thread.sleep(3000);
            String password = reader.getCellData("Sheet1", "Password", rowNum);
            System.out.println(password);
            //finding elements
            WebElement n = driver.findElement(By.name("firstname"));
            n.clear();
            n.sendKeys(name);
            WebElement ln = driver.findElement(By.name("lastname"));
            ln.clear();
            ln.sendKeys(lastName);
            WebElement em = driver.findElement(By.name("reg_passwd__"));
            em.clear();
            em.sendKeys(password);
            driver.findElement(By.name("websubmit")).click();
        }
    }*/
    public static void main(String... args) throws IOException, GeneralSecurityException {
         String spreadsheetId = "1izyUGbEaQIQnVDkYJlxs0b_H9yWht5HL-nEqfwJgx9k";
         String range = "Sheet1!A3:C";
       // @Test

            getSpreadSheetRecords(spreadsheetId, range);
        }
       /*
        @Test
        public void verifyProfileInfo() throws IOException {
            login(firstName,password);
            String[] userProfileInfo = getUserInfo();
            List<String> userData = Arrays.asList(userProfileInfo);
            //Get data from sheet  and verify first profile info of john
            GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
            List<List<Object>> values = sheetAPI.getSpreadSheetRecords("1izyUGbEaQIQnVDkYJlxs0b_H9yWht5HL-nEqfwJgx9k", "Sheet1!A1:C6");
            for (List<Object> row : values) {
                if(row.get(0).equals(firstName)) {
                    Assert.assertEquals(userData, row);
                    break;
                }
            }
        }
/*
        public String[] getUserInfo() {
            //Navigate to Profile page
            WebElement n = driver.findElement(By.name("firstname"));
            n.clear();
            n.sendKeys(firstName);
            WebElement ln = driver.findElement(By.name("lastname"));
            ln.clear();
            ln.sendKeys(lastName);
            WebElement em = driver.findElement(By.name("reg_passwd__"));
            em.clear();
            em.sendKeys(password);
            driver.findElement(By.name("websubmit")).click();
            String[] arrayUserInfo = {firstName, lastName, password};
            return arrayUserInfo;
        }*/

        public void login(String firstName, String password) {
            driver.findElement(By.id("session_key-login")).sendKeys(firstName);
            driver.findElement(By.id("session_password-login")).sendKeys(password);
            driver.findElement(By.id("signin")).click();
        }

      /*  @AfterClass
        public void tearDown() {
            if(driver!=null) {
                driver.quit();
            }
        }*/

    }


