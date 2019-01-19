package pageModelObject;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.NavPage;
import pages.PageGenerator;

import java.util.concurrent.TimeUnit;

public class NavPageTest extends CommonAPI {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\.idea\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PageGenerator page = new PageGenerator(driver);


        //*************PAGE METHODS WITH JAVA GENERICS********************
        //Open HomePage
        //Initialize elements by using PageFactory


        page.GetInstance(NavPage.class).health.click();
        page.GetInstance(NavPage.class).entertainment.click();


//
//            //*************ASSERTIONS***********************
//            Thread.sleep(500); //It is better to use explicit wait here.
//            page.GetInstance(LoginPage.class).verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"));
//        }

//        @Test (priority = 1)
//        public void invalidLoginTest_EmptyUserEmptyPassword () throws InterruptedException {
//            //*************PAGE METHODS WITH JAVA GENERICS********************
//            //Open N11 HomePage
//            page.GetInstance(HomePage.class).goToN11();
//
//            //Method Chaining (Go to Login Page and then LoginToN11)
//            page.GetInstance(HomePage.class).goToLoginPage().loginToN11("","");
//
//            //*************ASSERTIONS***********************
//            Thread.sleep(500); //It is better to use explicit wait here.
//            page.GetInstance(LoginPage.class).verifyLoginUserName("Lütfen e-posta adresinizi girin.");
//            page.GetInstance(LoginPage.class).verifyLoginPassword("Bu alanın doldurulması zorunludur.");
    }
}
