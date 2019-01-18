package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavBarPage extends CommonAPI {
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(1)")
    public WebElement navBarUS;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(2)")
    public WebElement navBarWorld;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(3)")
    public WebElement navBarPolitics;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(4)")
    public WebElement navBarBusiness;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(5)")
    public WebElement navBarOpinion;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(6)")
    public WebElement navBarHealth;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(7)")
    public WebElement navBarEntertainment;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(8)")
    public WebElement navBarStyle;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(9)")
    public WebElement navBarTravel;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(10)")
    public WebElement navBarSports;
    @FindBy(how =How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(11)")
    public WebElement navBarVideo;






}
