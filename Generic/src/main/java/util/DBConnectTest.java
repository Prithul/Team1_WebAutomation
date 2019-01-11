package util;


import java.util.ArrayList;
import java.util.List;

// Testing DB Connection
//Modified by Halima
public class DBConnectTest {

    static ConnectDB db = null;
    public static void main(String[] args)throws Exception {
        String path = "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\CNN\\lib\\MySQL.properties";
        List<String> list = new ArrayList<String>();
        list.add("health");
        list.add("politics");
        db = new ConnectDB();
        //db.connectToSqlDatabase(path);
        db.insertStringDataFromArrayListToSqlTable(path,list,"Navtb","navItem");
        //db.readDataBase(path);


    }
}
