package essentialUtility;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestException;

import java.util.ArrayList;
import java.util.List;
import base.CommonAPI;

import static java.lang.Thread.sleep;

public class DropDown extends CommonAPI {

    public void viewDropDown() throws InterruptedException {

        driver.findElement(By.cssSelector("#searchDropdownBox")).click();
        Thread.sleep(2000);
    }

    public void selectDropDownItem() throws InterruptedException{

       // driver.findElement(By.cssSelector("#searchDropdownBox")).click();
        WebElement ele = driver.findElement(By.cssSelector("#searchDropdownBox"));
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("Appliances");

        typeOnElementNEnter("#twotabsearchtextbox","Electric Oven");
        Thread.sleep(2000);
    }

    public void getDropDownItem() throws InterruptedException{

        List<WebElement> listOfElements = driver.findElements(By.id("searchDropdownBox"));
        for (WebElement we : listOfElements) {
            System.out.println("List of Drop Down Items:\n" + we.getText());
        }
    }
}