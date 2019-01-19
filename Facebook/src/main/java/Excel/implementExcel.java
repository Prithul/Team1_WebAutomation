package Excel;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class implementExcel extends CommonAPI {

        static excel reader;

        public  void getDataFromExcel() throws InterruptedException{

        try {
            reader = new excel("/Users/ameladervishi/Downloads/Team1/Facebook/src/main/java/ExcelDoc/SignUp.xls");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
            String name = reader.getCellData("Sheet1", "Name", rowNum);
            System.out.println(name);
            String lastName = reader.getCellData("Sheet1", "LastName", rowNum);
            System.out.println(lastName);
            Thread.sleep(3000);
            String password = reader.getCellData("Sheet1", "Password", rowNum);
            System.out.println(password);
            //finding elements
            WebElement n = driver.findElement(By.name("firstname"));
            n.clear();
            n.sendKeys(name);
            WebElement ln = driver.findElement(By.name("lastname"));
            ln.clear();
            ln.sendKeys(lastName);
            WebElement em = driver.findElement(By.name("reg_passwd__"));
            em.clear();
            em.sendKeys(password);
            driver.findElement(By.name("websubmit")).click();
            }
        }
    }


