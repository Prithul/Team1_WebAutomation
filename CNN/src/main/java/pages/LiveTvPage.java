package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LiveTvPage extends CommonAPI {
    @FindBy(how = How.CSS,using="")
    public WebElement tvPageTitle;
//    @FindBy(how=How.CSS,using = "")
//    public WebElement




    int size = driver.findElements(By.tagName("iframe")).size();
}
