package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class CommonAPI {

    public WebDriver driver = null;


    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        //driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\.idea\\browser\\chromedriver.exe");

        //Create prefs map to store all preferences
        Map<String, Object> prefs = new HashMap<String, Object>();

        //Put this into prefs map to switch off browser notification
        prefs.put("profile.default_content_setting_values.notifications", 2);

        //Create chrome options to set this prefs
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        //Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

    }


    //type
    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeOnID(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    public void typeOnElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value);
                }
            }
        }
    }
    public void typeOnElementNEnter(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }}

    public void clearField(String locator){
        driver.findElement(By.id(locator)).clear();
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    // added by papri
    public void getCurrentURL() {

        System.out.println("Current URL: " + driver.getCurrentUrl());
    }
    // added by papri
    public void getPageTitle() {

        System.out.println("Current Page Title: " + driver.getTitle());
    }

    //click


}
