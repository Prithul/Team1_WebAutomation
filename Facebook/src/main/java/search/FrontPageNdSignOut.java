package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class FrontPageNdSignOut extends CommonAPI {

    @FindBy(xpath = "//input[@type='email']")
    public static WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    public static WebElement logInBttn;
    @FindBy(xpath = "//div[@id='userNavigationLabel']")
    public static WebElement DropDown;
    @FindBy(partialLinkText = "Log Out")
    public static WebElement Logout;
    @FindBy(id = "month")
    public static WebElement monthDropDown;
    @FindBy(id = "day")
    public static WebElement dayDropDown;
    @FindBy(id = "year")
    public static WebElement yearDropDown;
    @FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")
    public static WebElement logo;
    @FindBy(name = "firstname")
    public static WebElement firstnamefield;
    @FindBy(name = "lastname")
    public static WebElement lastnamefield;
    @FindBy(name = "websubmit")
    public static WebElement submitBtn;

    //test logo facebook
    public void isLogoDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean status = logo.isDisplayed(); }
    //log in
    public void SignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        username.sendKeys("ameladrv@gmail.com");
        password.sendKeys("PNTeam1234");
        logInBttn.click(); }
    //log out
    public void SignOut() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDown.click();
        Logout.click(); }
    //month drop down
    public void birthMonthSelect(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select birthMonth = new Select(monthDropDown);
        birthMonth.selectByIndex(6); }
    //day drop down
    public void birthDaySelect() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select birthDay = new Select(dayDropDown);
        birthDay.selectByVisibleText("2"); }
    //year drop down
    public void birthYearSelect() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select birthYear = new Select(yearDropDown);
        birthYear.selectByVisibleText("1994"); }
    // compares the default (month) value with the value (month) we select
    public void verifyDDMonth() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select birthMonth = new Select(monthDropDown);
        WebElement selectedValue = birthMonth.getFirstSelectedOption();
        System.out.println("Before selecting any value, the value is " + selectedValue.getText());
        //it will select june
        birthMonth.selectByIndex(6);
        WebElement selectedValueTwo = birthMonth.getFirstSelectedOption();
        System.out.println("After selecting my value, the value showed is " + selectedValueTwo.getText());
        Assert.assertEquals(selectedValue, selectedValueTwo); }
    // compares the default (day) value with the value (day) we select
    public void verifyDDday() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select birthDay = new Select(dayDropDown);
        WebElement selectedValue = birthDay.getFirstSelectedOption();
        System.out.println("Before selecting any value, the value is " + selectedValue.getText());
        birthDay.selectByVisibleText("2");
        WebElement selectedValueTwo = birthDay.getFirstSelectedOption();
        System.out.println("After selecting my value, the value showed is " + selectedValueTwo.getText());
        Assert.assertEquals(selectedValue, selectedValueTwo); }

    // compares the default (year) value with the value (year) we select
    public void verifyDDyear() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select birthYear = new Select(yearDropDown);
        WebElement selectedValue = birthYear.getFirstSelectedOption();
        System.out.println("Before selecting any value, the value is " + selectedValue.getText());
        birthYear.selectByVisibleText("1994");
        WebElement selectedValueTwo = birthYear.getFirstSelectedOption();
        System.out.println("After selecting my value, the value showed is " + selectedValueTwo.getText());
        Assert.assertEquals(selectedValue, selectedValueTwo); }

      // prints all the months listed in the drop down list
    public void getAllMonthsListedInDropDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select birthMonth = new Select(monthDropDown);
        List<WebElement> fullMonthList = birthMonth.getOptions();
        int totalMonth = fullMonthList.size();
        Assert.assertEquals(totalMonth, 13);
        System.out.println("");
        for (WebElement e : fullMonthList) {
            String monthNames = e.getText();
            System.out.println("The months are listed one by one -> " + monthNames); } }

    // intentional failing the creating of an account
    public void createAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        firstnamefield.sendKeys("Amela");
        lastnamefield.sendKeys("Pnteam");
        submitBtn.click();
    }
}
