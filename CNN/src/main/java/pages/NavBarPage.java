package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

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

    public void checkEachNavTab(WebElement we)
    {
        we.click();
    }

    public String checkEachNavTabUrl(WebElement we)
    {
        we.click();
       return driver.getCurrentUrl();
    }

    public String checkEachNavTabTitle(WebElement we)
    {
        we.click();
        return driver.getTitle();
    }

    public List<String> navBarStringElements()
    {
        List<String> slist = new ArrayList<String>();
        slist.add(navBarUS.getText());
        slist.add(navBarWorld.getText());
        slist.add(navBarPolitics.getText());
        slist.add(navBarBusiness.getText());
        slist.add(navBarOpinion.getText());
        slist.add(navBarHealth.getText());
        slist.add(navBarEntertainment.getText());
        slist.add(navBarStyle.getText());
        slist.add(navBarTravel.getText());
        slist.add(navBarSports.getText());
        slist.add(navBarVideo.getText());
        return slist;

    }
    public List<WebElement> navBarWebElements()
    {
        List<WebElement> wlist = new ArrayList<WebElement>();
        wlist.add(navBarVideo);
        wlist.add(navBarUS);
        wlist.add(navBarWorld);
        wlist.add(navBarPolitics);
        wlist.add(navBarBusiness);
        wlist.add(navBarOpinion);
        wlist.add(navBarHealth);
        wlist.add(navBarEntertainment);
        wlist.add(navBarStyle);
        wlist.add(navBarTravel);
        wlist.add(navBarSports);

        return wlist;

    }

}
