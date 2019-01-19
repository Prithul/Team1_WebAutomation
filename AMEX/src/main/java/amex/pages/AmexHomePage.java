package amex.pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AmexHomePage extends CommonAPI {

    @FindBy(how = How.CSS,using = "head > title")
    public WebElement amexTitle;
    @FindBy(how = How.XPATH,using = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[6]/div/span[1]/label[1]/span")
    public WebElement amexSearchFielsOpenButton;
    @FindBy(how = How.CLASS_NAME,using = "axp-global-header__dls__icon___2TD91 axp-global-header__dls__iconSm___1umpi axp-global-header__dls__dlsIconSearch___2ruOU axp-global-header__dls__iconHover___4rBrz")
    public WebElement amexSearchFielsCloseButton;

    @FindBy(how= How.CLASS_NAME,using = "axp-global-header__dls__formControl___Xc9-9 undefined")
    public WebElement amexSearchField;
    @FindBy(how = How.CLASS_NAME , using = "axp-global-header__dls__buttonNav___1-Elt")
     public WebElement amexSearchSubmitButton;
    @FindBy(how=How.XPATH, using = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul")
    public List<WebElement> amexNavTabList;
    @FindBy(how = How.CSS,using = "#gnav_login > span")
    public WebElement amexLoginButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[6]/div/a/span")
    public WebElement amexHelpButton;

    public String getUrl()
    {
        return driver.getCurrentUrl();
    }

    public String getTitle()
    {
       return driver.getTitle();
    }
     public void openSearchField()
    {
        amexSearchFielsOpenButton.click();
    }
    public void closeSearchField()
    {
        amexSearchFielsOpenButton.click();
        amexSearchFielsCloseButton.click();
    }
    public void typeOnSearchField()
    {
        amexSearchFielsOpenButton.click();
        amexSearchField.sendKeys("Card");
    }
    public void typeOnSearchFieldNEnter()
    {
        amexSearchFielsOpenButton.click();
        amexSearchField.sendKeys("Card", Keys.ENTER);
    }

    public void openLoginForm()
    {
        amexLoginButton.click();
    }
public void openHelpPage()
{
    amexHelpButton.click();
}

}
