package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TvPage extends CommonAPI {
    @FindBy(how= How.CSS,using="#aw0 > img")
    public WebElement googleAdStartNow;
@FindBy(how=How.CSS,using="#tv-zone-2 > div.l-container.zn__background--content-relative > div.zn__containers > div.column.zn__column--idx-0 > ul > li > article > div > div.media > a")
public WebElement firstTab;

    @FindBy(how=How.CSS,using="#tv-zone-2 > div.l-container.zn__background--content-relative > div.zn__containers > div.column.zn__column--idx-1 > ul > li > article > div > div.media > a")
    public WebElement secondTab;


    @FindBy(how=How.CSS,using="#tv-zone-2 > div.l-container.zn__background--content-relative > div.zn__containers > div.column.zn__column--idx-2 > ul > li > article > div > div.media > a")
    public WebElement thirdTab;
    @FindBy(how = How.CSS, using = "#tv-zone-3 > div.l-container.zn__background--content-relative > div.zn-header > h2")
    public WebElement goCNNHeading;
    @FindBy(how = How.XPATH,using = "//*[@id=\"aw0\"]/img")//"#tv-zone-3 > div.l-container.zn__background--content-relative > div.zn__containers > div > ul > li > article > div > div.media > a > img")
    public WebElement goCnnImage;

    public String getTvPageUrl()
    {
        driver.get("https://www.cnn.com/tv");
       return driver.getCurrentUrl();
    }
    public String getTvPageTitle()
    {
        driver.get("https://www.cnn.com/tv");
        return driver.getTitle();
    }
    public int getNoOfIframe()
    {
        return 0;
    }

    public void getFirstIframe() throws InterruptedException
    {
        driver.get("https://www.cnn.com/tv");
        driver.switchTo().frame("google_ads_iframe_/8663477/CNN/tv/landing_0");
        //WebElement frame = driver.findElement(By.xpath("//iframe[@src='https://tpc.googlesyndication.com/safeframe/1-0-31/html/container.html']"));
       // WebElement frameid = driver.findElement(By.id("google_ads_iframe_/8663477/CNN/tv/landing_0"));
        WebElement frameid = driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/8663477/CNN/tv/landing_0\"]"));
        frameid.click();
        driver.switchTo().defaultContent();
        sleepFor(5);
        driver.switchTo().frame("google_ads_iframe_/8663477/CNN/tv/landing_0");
        googleAdStartNow.click();

    }
    public String  getFirstIframeUrl()
    {
        driver.switchTo().frame("#google_ads_iframe_/8663477/CNN/tv/landing_0");
        googleAdStartNow.click();
        return driver.getCurrentUrl();

    }

    public void clickOnFirstTab()
    {
        firstTab.click();
    }
    public void clickOnSecondTab()
    {
        secondTab.click();
    }
    public void clickOnThirdTab()
    {
        thirdTab.click();
    }
    public String goCnnTitle()
    {
        String goCnnText = goCNNHeading.getText();
        return  goCnnText;
    }

    public void clickOnGoCnnImage()
    {
        goCnnImage.click();
    }
    public String goCnnImageUrl()
    {
        goCnnImage.click();
        String goCnnUrl = driver.getCurrentUrl();
        return goCnnUrl;
    }
}
