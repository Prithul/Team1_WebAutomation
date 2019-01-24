package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LiveTvPage extends CommonAPI {
    @FindBy(how = How.CSS,using="#nav-mobileTV")
    public WebElement liveTvPageIcon;
    @FindBy(how =How.CSS,using = "#mvpdpicker > div.header > div.close")
    public WebElement crossButton;
    @FindBy(how = How.CSS,using ="#mvpdpicker > div.header > div.title > span")
    public WebElement logInButton;
    @FindBy(how = How.CSS,using ="#mvpdpicker > div.header > div.help")
    public WebElement helpButton;
    @FindBy(how = How.CSS,using ="#mvpdpicker > div.slates > div.slate.pickbylogo > ul > li")
    public List<WebElement> listOfProviders;
//    //#mvpdpicker > div.slates > div.slate.pickbylogo > ul > li:nth-child(1)
//    @FindBy(how = How.CSS,using ="#mvpdpicker > div.slates > div.slate.pickbylogo > ul")
//    public List<WebElement> listOfProviders;
//    @FindBy(how = How.CSS,using ="#mvpdpicker > div.slates > div.slate.pickbylogo > ul")
//    public List<WebElement> listOfProviders;
//    @FindBy(how = How.CSS,using ="#mvpdpicker > div.slates > div.slate.pickbylogo > ul")
//    public List<WebElement> listOfProviders;
//    @FindBy(how = How.CSS,using ="#mvpdpicker > div.slates > div.slate.pickbylogo > ul")
//    public List<WebElement> listOfProviders;
//    @FindBy(how = How.CSS,using ="#mvpdpicker > div.slates > div.slate.pickbylogo > ul")
//    public List<WebElement> listOfProviders;
//    @FindBy(how = How.CSS,using ="#mvpdpicker > div.slates > div.slate.pickbylogo > ul")
//    public List<WebElement> listOfProviders;

public void checkLiveTv()
{
    liveTvPageIcon.click();
}
    public String checkLiveTvTitle()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        liveTvPageIcon.click();
        return driver.getTitle();
    }
    public String checkLiveTvUrl()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        liveTvPageIcon.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();

    }

    public void checkLiveTvClose()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        liveTvPageIcon.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        driver.getCurrentUrl();
        crossButton.click();

    }

    public String checkLiveTvCloseUrl()
    {
        String parentWindowHandler = driver.getWindowHandle();
        liveTvPageIcon.click();

        crossButton.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }

        return driver.getCurrentUrl();

    }

    public String checkLoginLabel()
    {
        liveTvPageIcon.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return logInButton.getText();
    }
    public void checkHelpClick()
    {
        liveTvPageIcon.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        helpButton.click();
    }

    public String checkHelpUrl()
    {
        liveTvPageIcon.click();
        helpButton.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
      return driver.getCurrentUrl();

    }

    public int checkNoOfProviders() throws InterruptedException
    {
        liveTvPageIcon.click();
        String parentWindowHandler = driver.getWindowHandle();
        List<WebElement> list = listOfProviders;
        return list.size();

    }

    public void checkListOfProviders( int urlNo) throws InterruptedException {
        liveTvPageIcon.click();
        List<WebElement> list = listOfProviders;
      if(urlNo<list.size())
        {
            list.get(urlNo).click();
       }
    }

    public String checkListOfProvidersTitle(int urlNo) throws InterruptedException
    {
        liveTvPageIcon.click();
        List<WebElement> list = listOfProviders;
        if(urlNo<list.size())
        {
            list.get(urlNo).click();
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            sleepFor(5);
        }
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
           }
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return driver.getTitle();
    }

}
