package essentialUtility;

import base.CommonAPI;
import dbUtility.ConnectToSqlDB;
import org.openqa.selenium.By;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SearchPage extends CommonAPI {

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

    public void searchItem(){
        try {
            List<String> list = new ArrayList<>();
            list = getItemsListFromDB();

            for(String st: list) {
                typeOnElementNEnter("#twotabsearchtextbox", st);
                navigateBack();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}