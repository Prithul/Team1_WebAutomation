package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class FrontPageNdSignOut extends CommonAPI {
    //log in
    public void signIn() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ameladrv@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("PNTeam1234");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
    //log out
    public void SignOut() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Log Out")).click();
    }
    //month drop down
    public void bMonth() throws InterruptedException {
        WebElement month_dd = driver.findElement(By.id("month"));
        Select birthMonth = new Select(month_dd);
        birthMonth.selectByIndex(6);
        Thread.sleep(300);
    }
    //day drop down
    public void bDay() throws InterruptedException {
        WebElement day_dd = driver.findElement(By.id("day"));
        Select birthDay = new Select(day_dd);
        birthDay.selectByVisibleText("2");
        Thread.sleep(300);
    }
    //year drop down
    public void bYear() throws InterruptedException {
        WebElement year_dd = driver.findElement(By.id("year"));
        Select birthYear = new Select(year_dd);
        birthYear.selectByVisibleText("1994");
        Thread.sleep(300);
    }

    //// compares the default (month) value with the value (month) we select
    public void verifyDDMonth() {
        WebElement month_dd = driver.findElement(By.id("month"));
        Select birthMonth = new Select(month_dd);
        WebElement selectedValue = birthMonth.getFirstSelectedOption();
        System.out.println("Before selecting any value, the value is " + selectedValue.getText());
        //it will select june
        birthMonth.selectByIndex(6);
        WebElement selectedValueTwo = birthMonth.getFirstSelectedOption();
        System.out.println("After selecting my value, the value showed is " + selectedValueTwo.getText());
        Assert.assertEquals(selectedValue, selectedValueTwo);
    }
    // compares the default (day) value with the value (day) we select
    public void verifyDDday() {
        WebElement day_dd = driver.findElement(By.id("day"));
        Select birthDay = new Select(day_dd);
        WebElement selectedValue = birthDay.getFirstSelectedOption();
        System.out.println("Before selecting any value, the value is " + selectedValue.getText());
        birthDay.selectByVisibleText("2");
        WebElement selectedValueTwo = birthDay.getFirstSelectedOption();
        System.out.println("After selecting my value, the value showed is " + selectedValueTwo.getText());
        Assert.assertEquals(selectedValue, selectedValueTwo);
    }
    // compares the default (year) value with the value (year) we select
    public void verifyDDyear() {
        WebElement year_dd = driver.findElement(By.id("year"));
        Select birthYear = new Select(year_dd);
        WebElement selectedValue = birthYear.getFirstSelectedOption();
        System.out.println("Before selecting any value, the value is " + selectedValue.getText());
        birthYear.selectByVisibleText("1994");
        WebElement selectedValueTwo = birthYear.getFirstSelectedOption();
        System.out.println("After selecting my value, the value showed is " + selectedValueTwo.getText());
        Assert.assertEquals(selectedValue, selectedValueTwo);
    }
      // prints all the months listed in the drop down list
    public void getDDMonth() throws InterruptedException {
        WebElement month_dd = driver.findElement(By.id("month"));
        Select birthMonth = new Select(month_dd);
        List<WebElement> fullMonthList = birthMonth.getOptions();
        int totalMonth = fullMonthList.size();
        Assert.assertEquals(totalMonth, 13);
        System.out.println("");
        for (WebElement e : fullMonthList) {
            String monthNames = e.getText();
            System.out.println("The months are listed one by one -> " + monthNames);
        }
    }
    //test logo facebook
    public void logo() throws InterruptedException {
        WebElement display = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i"));
        boolean status = display.isDisplayed();
        Thread.sleep(3000);
    }
    // intentional failing the creating of an account
    public void createAcct() {
        WebElement name = driver.findElement(By.name("firstname"));
        name.click();
        name.sendKeys("Amela");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.click();
        lastName.sendKeys("Pnteam");
        driver.findElement(By.name("websubmit")).click();

    }
}
