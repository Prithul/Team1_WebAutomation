package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.asserts.SoftAssert;
//import reporting.ExtentManager;
//import reporting.ExtentTestManager;
//import reporting.TestLogger;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class CommonAPI {

    public static WebDriver driver = null;
//    public String browserstack_username= "victoriaarda1";
//    public String browserstack_accesskey = "Csjpsa97AQqfqypSgphy";
//    public String saucelabs_username = "";
//    public String saucelabs_accesskey = "";



    @AfterMethod
    public void cleanUp(){
        System.out.println("Clean up");
        driver.close();
    }


//    //ExtentReport
//    public static ExtentReports extent;
//    @BeforeSuite
//    public void extentSetup(ITestContext context) {
//        ExtentManager.setOutputDirectory(context);
//        extent = ExtentManager.getInstance();
//    }
//    @BeforeMethod
//    public void startExtent(Method method) {
//        String className = method.getDeclaringClass().getSimpleName();
//        String methodName = method.getName().toLowerCase();
//        ExtentTestManager.startTest(method.getName());
//        ExtentTestManager.getTest().assignCategory(className);
//    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
   // @AfterMethod
//    public void afterEachTestMethod(ITestResult result) {
//        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
//        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
//
//        for (String group : result.getMethod().getGroups()) {
//            ExtentTestManager.getTest().assignCategory(group);
//        }
//
//        if (result.getStatus() == 1) {
//            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
//        } else if (result.getStatus() == 2) {
//            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
//        } else if (result.getStatus() == 3) {
//            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
//        }
//        ExtentTestManager.endTest();
//        extent.flush();
//        if (result.getStatus() == ITestResult.FAILURE) {
//            captureScreenshot(driver, result.getName());
//        }
//        driver.quit();
//    }
//    @AfterSuite
//    public void generateReport() {
//        extent.close();
//    }
//    private Date getTime(long millis) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(millis);
//        return calendar.getTime();
//    }
    //Selenium API start

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){

        // change your setProperty
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\.idea\\browser\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","/Users/Papri.Barua/IdeaProjects/driver/chromedriver/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "/Users/ameladervishi/Downloads/Team1/Facebook/driver/chromedriver");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
        System.out.println("I am in before method ");
        //Thread.sleep(500);
    }
   public String getUrl()
   {
       String url = driver.getCurrentUrl();
       System.out.println(url);
  return url;
   }

    //type
    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeOnID(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }
    public void typeOnElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value);
                }
            }
        }
    }
    public void typeOnElementNEnter(String locator, String value){
       // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }}

    public void clearField(String locator){
        driver.findElement(By.id(locator)).clear();
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName){
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir")+ "/screenshots/"+screenshotName+" "+df.format(date)+".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot "+e.getMessage());;
        }

    }
    public static String convertToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }

    public void clickOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void clickOnElement(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        }catch(Exception ex1){
            try {
                driver.findElement(By.xpath(locator)).click();
            }catch(Exception ex2){
                driver.findElement(By.id(locator)).click();
            }
        }
    }

    public void typeOnInputField(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch (Exception ex){
            driver.findElement(By.id(locator)).sendKeys(value);
        }

    }
    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void typeByCssNEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void takeEnterKeys(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    public void clearInputField(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }
    public List<WebElement> getListOfWebElementsById(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.id(locator));
        return list;
    }
    public List<String> getTextFromWebElements(String locator){
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for(WebElement web:element){
            String st = web.getText();
            text.add(st);
        }

        return text;
    }
    public List<WebElement> getListOfWebElementsByCss(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.cssSelector(locator));
        return list;
    }

    public List<WebElement> getListOfWebElementsByXpath(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath(locator));
        return list;
    }
    public String  getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }
    public void navigateForward(){
        driver.navigate().forward();
    }
    public String getTextByCss(String locator){
        String st = driver.findElement(By.cssSelector(locator)).getText();
        return st;
    }
    public String getTextByXpath(String locator){
        String st = driver.findElement(By.xpath(locator)).getText();
        return st;
    }
    public String getTextById(String locator){
        return driver.findElement(By.id(locator)).getText();
    }
    public String getTextByName(String locator){
        String st = driver.findElement(By.name(locator)).getText();
        return st;
    }



    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        System.out.println(list.size());

        for (WebElement element : list) {
            items.add(element.getText());
            System.out.println();
        }
        return items;
    }

    public void selectOptionByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public static void sleepFor(int sec)throws InterruptedException{
        Thread.sleep(sec * 1000);
    }
    public void mouseHoverByCSS(String locator){
        try {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        }catch(Exception ex){
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

        }

    }
    public void mouseHoverByXpath(String locator){
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        }catch(Exception ex){
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

        }

    }
    //handling Alert
    public void okAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    //iFrame Handle
    public void iframeHandle(WebElement element){
        driver.switchTo().frame(element);
    }

    public void goBackToHomeWindow(){
        driver.switchTo().defaultContent();
    }

    //get Links
    public void getLinks(String locator){
        driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }
    //Taking Screen shots
    public void takeScreenShot()throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("screenShots.png"));
    }
    //Synchronization
    public void waitUntilClickAble(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void waitUntilVisible(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitUntilSelectable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
    public void upLoadFile(String locator,String path){
        driver.findElement(By.cssSelector(locator)).sendKeys(path);
        /* path example to upload a file/image
           path= "C:\\Users\\rrt\\Pictures\\ds1.png";
         */
    }
    public void clearInput(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }
    public void keysInput(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }
    //Handling New Tabs
    public static WebDriver handleNewTab(WebDriver driver1){
        String oldTab = driver1.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver1.getWindowHandles());
        newTabs.remove(oldTab);
        driver1.switchTo().window(newTabs.get(0));
        return driver1;
    }
    public static boolean isPopUpWindowDisplayed(WebDriver driver1, String locator){
        boolean value = driver1.findElement(By.cssSelector(locator)).isDisplayed();
        return value;
    }

    public void typeOnInputBox(String locator, String value) {
        try{
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex1) {
            System.out.println("ID locator didn't work");
        }
        try{
            driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex2){
            System.out.println("Name locator didn't work");
        }
        try{
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex3){
            System.out.println("CSS locator didn't work");
        }
    }


    //By Halima
    //
    public List<WebElement> getListOfItem(String locator) {


        List<WebElement> list = driver.findElements(By.cssSelector("#nav > div.nav__container > div.nav - menu - links"));
        return list;
    }
    //Click Method by using JAVA Generics (You can use both By or Webelement)
    public <T> void click (T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
            driver.findElement((By) elementAttr).click();
        } else {
            ((WebElement) elementAttr).click();
        }
    }


    //Write Text by using JAVA Generics (You can use both By or Webelement)
    public <T> void writeText (T elementAttr, String text) {
        if(elementAttr.getClass().getName().contains("By")) {
            driver.findElement((By) elementAttr).sendKeys(text);
        } else {
            ((WebElement) elementAttr).sendKeys(text);
        }
    }

    //Write Text by using JAVA Generics (You can use both By or Webelement)
    public <T> void writeTextAndEnter (T elementAttr, String text) {
        if(elementAttr.getClass().getName().contains("By")) {
            driver.findElement((By) elementAttr).sendKeys(text);
        } else {
            ((WebElement) elementAttr).sendKeys(text,Keys.ENTER);
        }
    }


    public void switchWindow(WebDriver driver){
        for (String handle: driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
    }
    public void dropDown(WebElement web, int x){
        Select dropdown = new Select(web);
        dropdown.selectByIndex(x);
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public String getTextByWebElement(WebElement webElement){
        String text = webElement.getText();
        return text;
    }

    //Read Text by using JAVA Generics (You can use both By or Webelement)
    public <T> String readText (T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
            return driver.findElement((By) elementAttr).getText();
        } else {
            return ((WebElement) elementAttr).getText();
        }
    }

    // Return list of links available in the HomePage
    public List<String> findNumberOfLink(List<WebElement> anchorTag) {
        System.out.println(anchorTag.size());
        List<String> actualLinks = new ArrayList<>();
        for (int i = 0; i < anchorTag.size(); i = i + 1) {
            if (anchorTag.get(i).getText() != null && anchorTag.get(i).getText().length() > 0) {
                actualLinks.add(anchorTag.get(i).getText());
            }
        }
        for (String link : actualLinks) {
            System.out.println(link);
        }
        return actualLinks;
    }
//    //Get Assert Data
//    public List<String> getAssertData(String DataFilePath, int ColumnNo) throws IOException {
//        util.excel.DataReader dtr = new util.excel.DataReader();
//        List<String> output = Arrays.asList(dtr.colReader(DataFilePath,ColumnNo));
//        return output;
//    }

    // Assert Data
    public void assertData(List<String> actualList, List<String> expectedList){
        for (int i = 0; i < actualList.size(); i++) {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(actualList.get(i).contains(expectedList.get(i)));
            System.out.println("LinkVerified " + expectedList.get(i));
        }
    }



    //****************Halima*************************
}