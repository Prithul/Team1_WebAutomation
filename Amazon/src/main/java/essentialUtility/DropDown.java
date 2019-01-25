package essentialUtility;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

import base.CommonAPI;
import reporting.TestLogger;

public class DropDown extends CommonAPI {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.CSS, using =".nav-input")
    public static WebElement submitButtonWebElement;
    @FindBy(how = How.ID, using ="searchDropdownBox")
    public static WebElement dropDownWebElement;

    public void viewDropDown() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dropDownWebElement.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void selectDropDownItem1() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement ele = dropDownWebElement;
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("Appliances");
        typeOnElementNEnter("#twotabsearchtextbox","Electric Oven");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void selectDropDownItem2() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement ele = dropDownWebElement;
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("Amazon Devices");
        typeOnElementNEnter("#twotabsearchtextbox","iPad");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void selectDropDownItem3() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement ele = dropDownWebElement;
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("Books");
        typeOnElementNEnter("#twotabsearchtextbox","Story book for kids");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void selectDropDownItem4() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement ele = dropDownWebElement;
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("Baby");
        typeOnElementNEnter("#twotabsearchtextbox","baby girl clothes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void selectDropDownItem5() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement ele = dropDownWebElement;
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("Apps & Games");
        typeOnElementNEnter("#twotabsearchtextbox","pokemon games");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void selectDropDownItem6() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement ele = dropDownWebElement;
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("Arts, Crafts & Sewing");
        typeOnElementNEnter("#twotabsearchtextbox","painting easel");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void selectDropDownItem7() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement ele = dropDownWebElement;
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("Alexa Skills");
        typeOnElementNEnter("#twotabsearchtextbox","premium skills");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
    }
    public void getDropDownItem() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> listOfElements = driver.findElements(By.id("searchDropdownBox"));
        for (WebElement we : listOfElements) {
            System.out.println("List of Drop Down Items:\n" + we.getText()); }
    }
}