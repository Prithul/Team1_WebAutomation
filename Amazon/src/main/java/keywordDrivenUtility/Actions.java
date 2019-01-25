package keywordDrivenUtility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Actions {
    public static WebDriver driver;
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/Papri.Barua/IdeaProjects/driver/chromedriver/chromedriver.exe");
        driver=new ChromeDriver();
    }
    public static void navigate() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }
    public static void signInPageOpen() {
        driver.findElement(By.id("nav-link-accountList")).click();
    }
    public static void inputUsername() {
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("pbarua2018@gmail.com");
    }
    public static void inputPassword() {
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("test2018");
    }
    public static void clickSignIn() {
        driver.findElement(By.cssSelector("#signInSubmit")).click();
    }
    public static void verifySignIn() {
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        try {
            Assert.assertEquals(pageTitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
            System.out.println("Unit test for sign-in page title is passed");
        }catch (AssertionError ar) {
            System.out.println("Unit test for sign-in page title is failed"); }
    }
    public static void closeBrowser()
    {
        driver.quit();
    }
}