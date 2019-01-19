package tests;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.Na;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavPage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import util.ReadFromExcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class NavPageTest extends CommonAPI {
    NavPage navPage;
    @Test
    public void checkEachNavItem()throws InterruptedException {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        List<WebElement> list = navPage.navigationArrayList();
        for(WebElement l:list)
        {
            homePage.navPageButton.click();
            l.click();
            sleepFor(2);
            homePage.goCnn();
        }
    }
    @Test
    public void checkUSNavItemTitleAndUrl()
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        homePage.navPageButton.click();
        navPage.US.click();
        String url= driver.getCurrentUrl();
        String title = driver.getTitle();
        Assert.assertEquals(title,"US News – Top national stories and latest headlines - CNN");
        Assert.assertEquals(url,"https://www.cnn.com/us");
    }
    @Test
    public void checkWorldNavItemTitleAndUrl()
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        homePage.navPageButton.click();
        navPage.world.click();
        String url= driver.getCurrentUrl();
        String title = driver.getTitle();
        Assert.assertEquals(title,"World news – breaking news, videos and headlines - CNN");
        Assert.assertEquals(url,"https://www.cnn.com/world");
    }
    @Test
    public void checkPoliticsNavItemTitleAndUrl()
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        homePage.navPageButton.click();
        navPage.politics.click();
        String url= driver.getCurrentUrl();
        String title = driver.getTitle();
        Assert.assertEquals(title,"CNNPolitics - Political News, Analysis and Opinion");
        Assert.assertEquals(url,"https://www.cnn.com/politics");
    }

    @Test
    public void checkSubMenuTech()
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        List<String> actualList = new ArrayList<String>();
        actualList.add("Inovative");
        actualList.add("Gadget");
        actualList.add("Mission: Ahead");
        actualList.add("Upstarts");
        actualList.add("Work Transformed");
        actualList.add("Innovative Cities");
        homePage.navPageButton.click();
        List<WebElement> list = getListOfWebElementsByXpath("//*[@id=\"nav-expanded-menu\"]/div[9]/ul/li/a");
        //System.out.println(list.size() + "   "  +list.get(0).getText());
        List<String> slist = navPage.getStringListFromWebelementList(list);
        //System.out.println(slist.size() + "   "  +slist.get(0));
        navPage.assertData(slist,actualList);
    }
    @Test
    public void checkSubMenuUS()
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        List<String> actualList = new ArrayList<String>();
        actualList.add("Crime + Justice");
        actualList.add("Energy + Environment");
        actualList.add("Extreme Weather");
        actualList.add("Space + Science");

        homePage.navPageButton.click();
       List<WebElement> list = navPage.subUS;
        List<String> slist = navPage.getStringListFromWebelementList(list);
        System.out.println(slist.size() + "   "  +slist.get(0));
        navPage.assertData(slist,actualList);
    }
    @Test
    public void checkNavFromExcel() throws IOException, InvalidFormatException,InterruptedException
    {

        List<String> slist = new ArrayList<String >();
             slist = ReadFromExcel.CnnexcelReader(0,4,16,0);
         HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
         navPage = new PageFactory().initElements(driver, NavPage.class);
           Map<String,WebElement> list = navPage.navigationList();
           for (int i=0;i<slist.size();i++) {
               System.out.println(slist.get(i));
               homePage.navPageButton.click();
               list.get(slist.get(i)).click();
               sleepFor(2);
               homePage.goCnn();
            }

        }
@Test
 public void checkLabelOfPreference()
 {
     HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
    navPage = new PageFactory().initElements(driver, NavPage.class);
      homePage.navPageButton.click();
      String label = navPage.preferenceLabel.getText();
      Assert.assertEquals(label, "Set edition preference:");
 }
    @Test
    public void checkLabelOfRedioButton()
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        homePage.navPageButton.click();
        String labelUS = navPage.radioLabelUS.getText();
        String labelInt = navPage.radioLabelInternational.getText();
        Assert.assertEquals(labelUS, "U.S.");
        Assert.assertEquals(labelInt, "International");
    }
   @Test
    public void checkLabelOfRadioButton()
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        homePage.navPageButton.click();
        String labelUS = navPage.buttonConfirm.getText();
        Assert.assertEquals(labelUS, "Confirm");

    }
    @Test
    public void checkSelectReadioButton() throws InterruptedException
    {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        navPage = new PageFactory().initElements(driver, NavPage.class);
        homePage.navPageButton.click();
       if(!navPage.radioUS.isSelected())
           navPage.radioUS.click();
        sleepFor(3);
        if(!navPage.radioInternational.isSelected())
            navPage.radioInternational.click();
        sleepFor(3);
        if(!navPage.radioUS.isSelected())
            navPage.radioUS.click();
        sleepFor(3);

    }

  //Needs to be fixed later
//    public void checkSubmitReadioButton() throws InterruptedException
//    {
//        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
//        navPage = new PageFactory().initElements(driver, NavPage.class);
//        homePage.navPageButton.click();
//        if(!navPage.radioUS.isSelected())
//            navPage.radioUS.click();
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        navPage.buttonConfirm.submit();
//        //String usURL= js.executeAsyncScript(getCurrentUrl();
//        Assert.assertEquals(usURL,"https://us.cnn.com");
//        homePage.goCnn();
//        homePage.navPageButton.submit();
//        if(!navPage.radioInternational.isSelected())
//            navPage.radioInternational.click();
//        String internationalURL= driver.getCurrentUrl();
//        Assert.assertEquals(internationalURL,"https://edition.cnn.com");
//    }

    }

