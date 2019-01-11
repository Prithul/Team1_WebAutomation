package util;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class ConnectDB {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement ps = null;
    private ResultSet resultSet = null;
    List<String> list = new ArrayList<String>();

    // public static Properties loadPropertiesFile()throws Exception{
//Modified by Halima
    public static Properties loadPropertiesFile(String path)throws Exception{

        Properties prop = new Properties();
       // InputStream ism = new FileInputStream("Generic/lib/MySQL.properties");
        InputStream ism = new FileInputStream(path);  //your own path to secret data
        prop.load(ism);
        ism.close();

        return prop;
    }

    //Connect to Database
    public void connectToSqlDatabase(String path) throws Exception{
        Properties prop = loadPropertiesFile(path);
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String passWord = prop.getProperty("MYSQLJDBC.passWord");
        // This will load the MySQL driver.
        Class.forName(driverClass);
        // Setup the connection with the DB
        connect = DriverManager.getConnection(url, userName, passWord);
        System.out.println("Database connected");

    }

    public List<String> readDataBase(String path, String tableName, String columnName)throws Exception{
        List<String> data = new ArrayList<String>();

        try {
            connectToSqlDatabase(path);
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName);
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }
    public void queryDatabase(){

    }

    private List<String> getResultSetData(ResultSet resultSet2, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while(resultSet2.next()){
            String itemName = resultSet2.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    // This Method needs to be Generic , so that it works for all type of class

//    public void insertDataFromArrayListToSqlTable(String path,List<Student> list, String tableName, String columnName) throws Exception
//    {
//        try {
//            connectToSqlDatabase(path);
//            ps = connect.prepareStatement("DROP TABLE IF EXISTS `"+tableName+"`;");
//            ps.executeUpdate();
//            ps = connect.prepareStatement("CREATE TABLE `"+tableName+"` (`ID` int(11) NOT NULL AUTO_INCREMENT,`SortingNumbers` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
//            ps.executeUpdate();
//            for(Student st:list){
//                ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
//                ps.setObject(1,st);
//                ps.executeUpdate();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
    public void insertStringDataFromArrayListToSqlTable(String path, List<String> list, String tableName, String columnName) throws Exception
    {
        try {
            connectToSqlDatabase(path);
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `"+tableName+"`;");
            ps.executeUpdate();
            ps = connect.prepareStatement("CREATE TABLE `"+tableName+"` (`ID` int(11) NOT NULL AUTO_INCREMENT,`"+columnName+"` varchar(30) DEFAULT NULL, PRIMARY KEY (`ID`) );");
            ps.executeUpdate();
            for(String st:list){
                ps = connect.prepareStatement("INSERT INTO `"+tableName+"` ( `"+columnName+"` ) VALUES(?)");
                ps.setObject(1,st);
                ps.executeUpdate();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void insertDataFromArrayToSqlTable(String path, int [] ArrayData, String tableName, String columnName) throws Exception
    {
        try {
            connectToSqlDatabase(path);
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `"+tableName+"`;");
            ps.executeUpdate();
            ps = connect.prepareStatement("CREATE TABLE `"+tableName+"` (`ID` int(11) NOT NULL AUTO_INCREMENT,`SortingNumbers` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();
            for(int n=0; n<ArrayData.length; n++){
                ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
                ps.setInt(1,ArrayData[n]);
                ps.executeUpdate();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void writeResultSetToConsole(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String itemName = resultSet.getString("item_name");
            System.out.println("item name: " + itemName);
        }

    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }
}
