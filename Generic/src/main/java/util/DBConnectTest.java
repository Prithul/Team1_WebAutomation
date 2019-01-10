package util;


// Testing DB Connection
//Modified by Halima
public class DBConnectTest {

    static ConnectDB db = null;
    public static void main(String[] args)throws Exception {
        String path = "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\CNN\\lib\\MySQL.properties";
        db = new ConnectDB();
        db.dbConnect(path);
        db.readDataBase(path);


    }
}
