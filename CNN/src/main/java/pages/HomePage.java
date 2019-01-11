package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    //*********Page Methods*********
    //Go to Homepage
    public void goCnn (){
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    //Go to navPage
    public NavPage goToNavPage (){
       click(navPageButton);

        //I want to chain LoginPage's methods so I return LoginPage by initializing its elements
        return new PageFactory().initElements(driver,NavPage.class);
  }

}
