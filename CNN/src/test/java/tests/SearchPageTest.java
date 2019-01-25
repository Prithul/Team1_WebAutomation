package tests;
import base.CommonAPI;
import cnnutility.GoogleSheetReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import reporting.TestLogger;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;
import java.util.List;

public class SearchPageTest extends CommonAPI{
    @Test
    public void checkHomeSearchButton()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
       searchHomePage.searchButton.submit();
    }
    @Test
    public void writeOnHomeSearch()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchButton.submit();
        sleepFor(2);
        searchHomePage.searchFor("politics");
        sleepFor(2);
    }
    @Test
    public void writeOnHomeSearchNSearch()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchButton.submit();
        searchHomePage.searchFor("politics");
        searchHomePage.searchSubmitButton.submit();
        sleepFor(2);
   }
    @Test
    public void writeOnHomeSearchNEnter()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchButton.click();
        searchHomePage.searchForAndEnter("politics");
        sleepFor(2);
    }
        @Test
    public void writeBlankOnHomeSearchNSearch()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchButton.click();
        searchHomePage.searchFor("");
        sleepFor(2);
        searchHomePage.searchSubmitButton.submit();
    }
    @Test
    public void writeBlankOnHomeSearchNEnter()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchButton.click();
        searchHomePage.searchForAndEnter("");
        sleepFor(2);
    }
    @Test
    public void checkSearchPageSearchField()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchButton.click();
        searchHomePage.searchForAndEnter("");
        searchHomePage.searchPageSearchTextBox.sendKeys("politics");
       sleepFor(2);
    }
    @Test
    public void checkSearchPageSearchFieldNClear()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchButton.click();
        searchHomePage.searchForAndEnter("");
        searchHomePage.searchPageSearchTextBox.sendKeys("politics");
        sleepFor(2);
        searchHomePage.clearInput();
    }
    @Test
    public void checkSearchPageSearchFieldNButton()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchButton.click();
        searchHomePage.searchForAndEnter("");
        searchHomePage.searchPageSearchTextBox.sendKeys("politics");
        searchHomePage.submitSearchButton();
        sleepFor(2);
    }
    @Test
    public void checkSearchPageSearchButtonNEnter()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchButton.click();
        searchHomePage.searchForAndEnter("");
        searchHomePage.searchPageSearchTextBox.sendKeys("politics", Keys.ENTER);
        sleepFor(2);
    }
    @Test
        public void searchItemsHome()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
          // SearchPage searchPage = searchHomePage.gotoSearchPage();
            searchHomePage.homeSearchItemsAndSubmitButton();
        }
   @Test
   public void searchItemsFromSearchPage()throws Exception, IOException, SQLException, ClassNotFoundException {
    TestLogger.log("Browser is launched");
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
    searchHomePage.searchPageSearchItemsAndSubmitButton();
    }
    @Test
    public void searchItemsFromHomePageNEnter()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.homeSearchItemsAndEnter();
    }
    @Test
    public void searchItemsFromSearchPageNEnter()throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        searchHomePage.searchPageSearchItemsAndEnter();
    }
    @Test
    public void readFromGoogleSheetAndCheck() throws IOException, GeneralSecurityException, InterruptedException
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchHomePage = PageFactory.initElements(driver, SearchPage.class);
        GoogleSheetReader gr = new GoogleSheetReader();
        List<String> list = gr.readFromGoogleSheet();

        searchHomePage.searchButton.click();
        for(String st:list) {
            searchHomePage.searchFor(st);
            searchHomePage.searchSubmitButton.submit();
            sleepFor(5);
            searchHomePage.goCnn();
            System.out.println(st);
       }
    }

    }



