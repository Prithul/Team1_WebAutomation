package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "http://www.cnn.com/";

    //*********Web Elements By Using Page Factory*********
    //
    @FindBy(how = How.CLASS_NAME, using = "nav-menu__hamburger")
    public WebElement navPageButton;

    @FindBy(how = How.CSS, using = "#search-button")
    public WebElement searchButton;

    @FindBy(how = How.CSS, using = "#search-input-field")
    public WebElement searchTextBox;



    //*********Page Methods*********
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



}
