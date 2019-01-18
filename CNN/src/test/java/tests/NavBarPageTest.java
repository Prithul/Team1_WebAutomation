package tests;

import base.CommonAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavBarPage;
import util.ReadFromExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NavBarPageTest extends CommonAPI {

    @Test
    public void checkNavBarTabUS()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarUS);
    }
    @Test
    public void checkNavBarTabWorld()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarWorld);
    }
    @Test
    public void checkNavBarTabPolitics()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarPolitics);
    }
    @Test
    public void checkNavBarTabBusiness()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarBusiness);
    }
    @Test
    public void checkNavBarTabOpinion()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarOpinion);
    }

    @Test
    public void checkNavBarTabHealth()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarHealth);
    }
    @Test
    public void checkNavBarTabStyle()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarStyle);
    }
    @Test
    public void checkNavBarTravel()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarTravel);
    }
    @Test
    public void checkNavBarSports()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarSports);
    }

    @Test
    public void checkNavBarVideo()
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        navBarPage.checkEachNavTab(navBarPage.navBarVideo);
    }

    @Test
    public void checkNavBarTitle()throws IOException, InvalidFormatException
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        List<WebElement> slist = navBarPage.navBarWebElements();
        //titles reading from excel sheet
        List<String> elist = ReadFromExcel.CnnexcelReader(1,4,14,2);
        for(int i =0; i< slist.size();i++) {
            slist.get(i).click();
            System.out.println(elist.get(i));
            Assert.assertEquals(elist.get(i), driver.getTitle());
            driver.get("http://www.cnn.com/");
        }
      }

    @Test
    public void checkNavBarText()throws IOException, InvalidFormatException
    {
        NavBarPage navBarPage = new PageFactory().initElements(driver, NavBarPage.class);
        List<WebElement> slist = navBarPage.navBarWebElements();
        //titles reading from excel sheet
        List<String> elist = ReadFromExcel.CnnexcelReader(1,4,14,1);
        for(int i =0; i< slist.size();i++) {
            slist.get(i).click();
            System.out.println(elist.get(i));
            Assert.assertEquals(elist.get(i),slist.get(i).getText());
            driver.get("http://www.cnn.com/");
        }
    }
}

