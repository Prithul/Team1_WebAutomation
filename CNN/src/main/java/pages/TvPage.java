package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
        driver.get("https://www.cnn.com/tv");
      driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        return size;
    }

    public int getNoOfLinks() {
        driver.get("https://www.cnn.com/tv");
        int size = driver.findElements(By.tagName("a")).size();
        return size;
    }


//        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
//        driver.findElement(By.xpath("//li[@class='icon-button add']/span")).click();
//        driver.findElement(By.xpath("//div[@id='ENCActions']/a/label")).click();
//
//        driver.findElement(By.xpath("//label[starts-with(text(),'Create Part...')]")).click();
//        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
//        String subWindowHandler = null;
//        Set<String> handles = driver.getWindowHandles(); // get all window handles
//        Iterator<String> iterator = handles.iterator();
//        while (iterator.hasNext()){
//            subWindowHandler = iterator.next().toString();
//            System.out.println("k1");
//            System.out.println(driver.switchTo().window(subWindowHandler).getTitle());
//        }


//    public void getFirstIframe() throws InterruptedException
//    {
//        driver.get("https://www.cnn.com/tv");
//        sleepFor(5);
//        //driver.switchTo().frame("google_ads_iframe_/8663477/CNN/tv/landing_0");
//       // sleepFor(5);
//        WebElement frameid = driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/8663477/CNN/tv/landing_0\"]"));
//        frameid.click();
//        driver.switchTo().defaultContent();
//        sleepFor(5);
//        driver.switchTo().frame("google_ads_iframe_/8663477/CNN/tv/landing_0");
//
//    }
    public String  getFirstIframeUrls()throws InterruptedException
    {
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

      return tvHaeding.getText();
    }

    public String getDontMissOnCnn() {
       return dontMissOnCnn.getText();
    }
    public void clickOnFirstTab()
    {
        firstTab.click();
    }
    public String getFirstTabUrl()
    {
        firstTab.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();

    }
    public void clickOnSecondTab()
    {
        secondTab.click();
    }

    public String getSecondTabUrl()
    {
        secondTab.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();

    }
    public void clickOnThirdTab()
    {
        thirdTab.click();
    }

    public String getThirdTabUrl()
    {
        thirdTab.click();
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();

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
