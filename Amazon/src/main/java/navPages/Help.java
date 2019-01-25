package navPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class Help extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[7]")
    public static WebElement help;
    @FindBy(how = How.CSS, using ="#helpsearch")
    public static WebElement helpSearchBox;
    @FindBy(how = How.CSS, using ="#helpSearchSubmit")
    public static WebElement goButton;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Your Orders')]")
    public static WebElement image1;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Returns & Refunds')]")
    public static WebElement image2;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Digital Services and Device Support')]")
    public static WebElement image3;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Manage Prime')]")
    public static WebElement image4;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Payments & Gift Cards')]")
    public static WebElement image5;
    @FindBy(how = How.XPATH, using ="//img[starts-with(@alt,'Account Settings')]")
    public static WebElement image6;

    public void getHelpSearch() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        helpSearchBox.sendKeys("quick delivery rates");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
        goButton.submit();
    }
    public void help1() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        image1.click();
    }
    public void help2() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        image2.click();
    }
    public void help3() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        image3.click();
    }
    public void help4() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        image4.click();
    }
    public void help5() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        image5.click();
    }
    public void help6() throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        image6.click();
    }
}
