package tests;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;


public class HomePageTest extends CommonAPI {
   HomePage homePage = new HomePage(driver);

   @Test
           public void checkHomeTitle() {

   }




            //*************PAGE METHODS WITH JAVA GENERICS********************
            //Open HomePage
            //Initialize elements by using PageFactory
            page.GetInstance(HomePage.class).goCnn();

            page.GetInstance(HomePage.class).
                    gotoSearchPage();
            page.GetInstance(HomePage.class).goCnn();
            page.GetInstance(HomePage.class).
                    goToNavPage();

        }

    }


