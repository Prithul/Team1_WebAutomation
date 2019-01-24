package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TvPage extends CommonAPI {
    @FindBy(how= How.CSS,using="#aw0 > img")
    public WebElement googleAdStartNow;
    @FindBy(how=How.CSS,using="#tv-zone-2 > div.l-container.zn__background--content-relative > div.zn-header > h2")
    public WebElement dontMissOnCnn;
    @FindBy(how=How.CSS,using="#tv-zone-2 > div.l-container.zn__background--content-relative > div.zn__containers > div.column.zn__column--idx-0 > ul > li > article > div > div.media > a")
    public WebElement firstTab;
    @FindBy(how=How.CSS,using="#tv-zone-2 > div.l-container.zn__background--content-relative > div.zn__containers > div.column.zn__column--idx-1 > ul > li > article > div > div.media > a")
    public WebElement secondTab;
    @FindBy(how=How.CSS,using="#tv-zone-2 > div.l-container.zn__background--content-relative > div.zn__containers > div.column.zn__column--idx-2 > ul > li > article > div > div.media > a")
    public WebElement thirdTab;
    @FindBy(how = How.CSS, using = "#tv-zone-3 > div.l-container.zn__background--content-relative > div.zn-header > h2")
    public WebElement goCNNHeading;
    @FindBy(how = How.XPATH,using = "//*[@id=\"tv-zone-3\"]/div[2]/div[2]/div/ul/li/article/div/div[1]/a/img")//"#tv-zone-3 > div.l-container.zn__background--content-relative > div.zn__containers > div > ul > li > article > div > div.media > a > img")
    public WebElement goCnnImage;
    @FindBy(how = How.CSS,using = "body > div.pg-no-rail.pg-wrapper > div.l-container > header > div > h1")
    public WebElement tvHaeding;

    public String getTvPageUrl()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
       return driver.getCurrentUrl();
    }
    public String getTvPageTitle()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        return driver.getTitle();
    }
    public int getNoOfIframe()
    {
      TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      driver.get("https://www.cnn.com/tv");
      driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
      int size = driver.findElements(By.tagName("iframe")).size();
      return size;
    }

    public int getNoOfLinks() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        int size = driver.findElements(By.tagName("a")).size();
        return size;
    }

    public void getFirstIframe() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        sleepFor(5);
        WebElement frameid = driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/8663477/CNN/tv/landing_0\"]"));
        frameid.click();
        driver.switchTo().defaultContent();
        sleepFor(5);
        driver.switchTo().frame("google_ads_iframe_/8663477/CNN/tv/landing_0");

    }
    public String  getFirstIframeUrls()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        sleepFor(5);
        //driver.switchTo().frame("#google_ads_iframe_/8663477/CNN/tv/landing_0");
        WebElement frameid = driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/8663477/CNN/tv/landing_0\"]"));
        frameid.click();
        //Set<String> handle= driver.getWindowHandles();//Return a set of window handle
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();

    }
    public String getHeaderTV()throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      return tvHaeding.getText();
    }

    public String getDontMissOnCnn() {
       return dontMissOnCnn.getText();
    }
    public void clickOnFirstTab()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        firstTab.click();
    }
    public String getFirstTabUrl()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        firstTab.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();

    }
    public void clickOnSecondTab()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        secondTab.click();
    }

    public String getSecondTabUrl()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        secondTab.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();

    }
    public void clickOnThirdTab()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        thirdTab.click();
    }

    public String getThirdTabUrl()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        thirdTab.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();

    }
    public String goCnnTitle()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String goCnnText = goCNNHeading.getText();
        return  goCnnText;
    }

    public void clickOnGoCnnImage()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goCnnImage.click();
    }
    public String goCnnImageUrl()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goCnnImage.click();
        String goCnnUrl = driver.getCurrentUrl();
        return goCnnUrl;
    }
}
