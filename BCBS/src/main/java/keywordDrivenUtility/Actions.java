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
        driver.get("https://www.fepblue.org");
    }
    public static void verifyHomePageTitle() {
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        try {
            Assert.assertEquals(pageTitle, "Home-Blue Cross and Blue Shield's Federal Employee Program");
            System.out.println("Unit test for Homepage title is passed");
        }catch (AssertionError ar) {
            System.out.println("Unit test for Homepage title is failed"); }
    }
    public static void verifyHomePageURL() {
        String pageURL = driver.getCurrentUrl();
        System.out.println(pageURL);
        try {
            Assert.assertEquals(pageURL, "https://www.fepblue.org/");
            System.out.println("Unit test for homepage url is passed");
        }catch (AssertionError ar) {
            System.out.println("Unit test for Homepage url is failed"); }
    }
    public static void navigation1() {
        driver.findElement(By.xpath("//*[@id=\"Benefit Plans\"]")).click();
        driver.navigate().back();
    }
    public static void navigation2() {
        driver.findElement(By.xpath("//*[@id=\"Wellness Resources And Tools\"]")).click();
        driver.navigate().back();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
    }
    public static void navigation3() {
        driver.findElement(By.xpath("//*[@id=\"Using My Benefits\"]")).click();
        driver.navigate().back();
    }
    public static void closeBrowser() { driver.quit(); }
}