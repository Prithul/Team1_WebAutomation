package search;

import Database.SqlDatabase;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseSearch extends searchPage {

        static SqlDatabase connectToSqlDB = new SqlDatabase();

        public List<String> getItemsListFromDB () throws Exception, IOException, SQLException, ClassNotFoundException {

            List<String> itemsList = new ArrayList<String>();

            itemsList.add("Amela");
            itemsList.add("Mary");
            itemsList.add("Halima");
            itemsList.add("Papri");
            itemsList.add("John");

            connectToSqlDB = new SqlDatabase();
            connectToSqlDB.insertStringDataFromArrayListToSqlTable(itemsList, "SearchFriends", "list");

            List<String> list = new ArrayList<>();
            list = connectToSqlDB.readDataBase("SearchFriends", "list");
            System.out.println("Read Data From Database: ");
            for (String st : list) {
                System.out.println(st);
            }
            return list;
        }
        public void searchFriends () {
            try {
                List<String> list = new ArrayList<>();
                list = getItemsListFromDB();

                for (String st : list) {
                    //CommonAPI.typeOnElementNEnter("//*[@id=\"js_1l\"]", st);
                    driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(st, Keys.ENTER);
                    navigateBack();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
