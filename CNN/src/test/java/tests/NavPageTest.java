package tests;
import org.openqa.selenium.WebElement;
import pages.NavPage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.NavPage;
import pages.PageGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NavPageTest extends CommonAPI {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\.idea\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PageGenerator page = new PageGenerator(driver);
        page.GetInstance(HomePage.class).goCnn();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        page.GetInstance(HomePage.class).goToNavPage();
        List<WebElement> list = page.GetInstance(NavPage.class).navigationArrayList();
        for(int i=0; i<list.size(); i++) {
            list.get(i).click();
            page.GetInstance(HomePage.class).goToNavPage();
            //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
    }
}
