package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

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
        liveTvPageIcon.click();
        return driver.getTitle();
    }
    public String checkLiveTvUrl()
    {
        liveTvPageIcon.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();

    }

    public void checkLiveTvClose()
    {
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

    public void checkListOfProviders() throws InterruptedException
    {
        liveTvPageIcon.click();
        String parentWindowHandler = driver.getWindowHandle();
        List<WebElement> list = listOfProviders;
        System.out.println(list.size());
        for(WebElement provider :list)
        {
            provider.click();
            sleepFor(10);
            driver.switchTo().window(parentWindowHandler);
        }
    }
    public String checkListOfProvidersTitle(int urlNo)
    {
        liveTvPageIcon.click();
        List<WebElement> list = listOfProviders;
        for(int i =urlNo;i<list.size();i++)
        {
            list.get(i).click();
            break;
        }
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }

        return driver.getTitle();
    }

}
