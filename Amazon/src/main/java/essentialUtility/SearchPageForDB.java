package essentialUtility;

import base.CommonAPI;
import dbUtility.ConnectToSqlDB;
import excelUtility.ReadFromExcel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchPageForDB extends CommonAPI {

    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".nav-input")
    public WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement()
    {
        return searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement()
    {
        return submitButtonWebElement;
    }

    public void searchFor(String value)
    {
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton()
    {
        getSubmitButtonWebElement().click();
    }
    public void clearInput()
    {
        getSearchInputWebElement().clear();
    }
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {

        List<String> itemsList = new ArrayList<String>();

        itemsList.add("Toys");
        itemsList.add("Succulent Plants");
        itemsList.add("Himalayan Salt Lamp");
        itemsList.add("QLED Game Monitor");
        itemsList.add("iPad");
        itemsList.add("Leaf Blower");
        itemsList.add("Holiday Lights");

        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(itemsList, "AmazonList", "list");

        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("AmazonList", "list");
        System.out.println("Read Data From Database: ");
        for (String st : list) {
            System.out.println(st);
        }
        return list;
    }
    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            //clearInput();
            navigateBack();
        }
    }
}


