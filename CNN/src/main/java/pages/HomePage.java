package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends CommonAPI {


    //*********Page Variables*********
    String baseURL = "http://www.cnn.com/";

    //*********Web Elements By Using Page Factory*********
    //
    @FindBy(how = How.CLASS_NAME, using = "nav-menu__hamburger")
    public WebElement navPageButton;

    @FindBy(how=How.CSS, using = ".nav-menu__hamburger::after")
    public WebElement navPageCrossButton;

    @FindBy(how = How.CSS, using = "#search-button")
    public WebElement searchButton;

    @FindBy(how = How.CSS, using = "#search-input-field")
    public WebElement searchTextBox;

    @FindBy(how=How.CLASS_NAME, using = "nav-section__expand-icon")
    public WebElement navSectionExpand ;

    @FindBy(how=How.CLASS_NAME, using = "")
    public WebElement navSectionClose ;

    @FindBy(how=How.CLASS_NAME,using = "edition-picker__list")
    public List<WebElement> editionList;

    @FindBy(how = How.CSS,using = "#nav-mobileTV")
    public WebElement liveTvButton;

    @FindBy(how = How.CSS,using = "#nav > div.nav__container > div.nav-menu-links")
    public List<WebElement> navItemList ;

    //*********Page Methods*********
    //Constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //Go to Homepage
    public void goCnn (){
        driver.get(baseURL);
        driver.manage().window().maximize();
    }
    public SearchPage gotoSearchPage(){
        searchButton.click();
//        Actions builder = new Actions(driver);
//        builder.moveToElement(searchButton).click(searchButton).build().perform();
        searchTextBox.sendKeys("politics", Keys.ENTER);
        return new PageFactory().initElements(driver,SearchPage.class);
    }

    //Go to navPage
    public NavPage goToNavPage (){
       click(navPageButton);
       return new PageFactory().initElements(driver,NavPage.class);
  }

   //Go to Live Tv Page
   public LiveTvPage goToLiveTvPage () {
       click(liveTvButton);
       return new PageFactory().initElements(driver, LiveTvPage.class);
   }
}
