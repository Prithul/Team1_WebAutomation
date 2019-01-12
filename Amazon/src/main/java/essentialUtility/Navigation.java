package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Navigation extends CommonAPI {

    public void navitaionTabOnHomePage() throws InterruptedException{

        driver.findElement(By.cssSelector("#nav-your-amazon")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        driver.navigate().back();
//      driver.findElement(By.cssSelector("//*[@id=\"nav-xshop\"]/a[3]")).click();
//      driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        driver.navigate().back();
        Thread.sleep(1000);
//      driver.findElement(By.cssSelector("//*[@id=\"nav-xshop\"]/a[5]")).click();
//      driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
        driver.navigate().back();
        System.out.println("Navigation is done!");

    }
}
