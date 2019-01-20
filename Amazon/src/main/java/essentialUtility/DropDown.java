package essentialUtility;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.TestException;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
import java.util.List;
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
        Thread.sleep(3000);
    }
    public void selectDropDownItem() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement ele = dropDownWebElement;
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("Appliances");
        typeOnElementNEnter("#twotabsearchtextbox","Electric Oven");
        Thread.sleep(2000);
    }
    public void getDropDownItem() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> listOfElements = driver.findElements(By.id("searchDropdownBox"));
        for (WebElement we : listOfElements) {
            System.out.println("List of Drop Down Items:\n" + we.getText());
        }
    }

//    public void dropDown(){
//        List<WebElement> element = getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option");
//        List<String> listOfText = getListOfString(element);
//        for (String text : listOfText) {
//            System.out.println(text);
//        }
//        List<String> expectedMenu = listOfText;
//        Assert.assertEquals(listOfText, expectedMenu);
//    }
}