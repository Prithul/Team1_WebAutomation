package cnnutility;

import base.CommonAPI;
import reporting.TestLogger;
import util.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class DBReader extends CommonAPI{
    public List<String> readNavListFromDb() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectDB db = new ConnectDB();
        List<String> list = new ArrayList<String>();

        String path = "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\CNN\\lib\\MySQL.properties";
        try {
            db.connectToSqlDatabase(path);
        }catch (Exception e) {
            System.out.println("Database connection Problem:  " + e);
        }
        try {
            list = db.readDataBase(path, "Navtb", "navItem");
        }catch (Exception e){
            System.out.println("NavList reading probnem: "+e );
        }
        return list;
    }
}
