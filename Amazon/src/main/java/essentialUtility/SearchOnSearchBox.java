package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchOnSearchBox extends CommonAPI {

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

    public  List<String> getSearch() throws Exception, IOException, SQLException, ClassNotFoundException {

        List<String> itemsList = new ArrayList<String>();

        itemsList.add("Toys");
        itemsList.add("Plants");
        itemsList.add("Lamp");
        return  itemsList;
    }
    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = getSearch();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            //clearInput();
            navigateBack();
        }
    }
}
