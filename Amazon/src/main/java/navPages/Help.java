package navPages;

import base.CommonAPI;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.sql.SQLException;

public class Help extends CommonAPI {

    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[7]")
    public static WebElement help;

    @FindBy(how = How.CSS, using ="#icp-touch-link-country")
    public static WebElement country;

    @FindBy(how = How.CSS, using =".a-button-text.a-declarative")
    public static WebElement selectCountry;

//    @FindBy(how = How.XPATH, using ="//span[.='United Kingdom']")
//    public static WebElement selectAustralia;

    @FindBy(how = How.CSS, using =".a-button-input")
    public static WebElement goToWebsite;

    public void help() throws Exception, IOException, SQLException, ClassNotFoundException{

        help.click();
        country.click();
        selectCountry.click();
        goToWebsite.submit();
    }
}
