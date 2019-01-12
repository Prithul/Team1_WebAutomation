package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import util.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class NavPage extends BasePage {

    public List<String> navList = new ArrayList<String>();
     public NavPage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--us > a")
    public WebElement US;

    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--world > a")
    public WebElement world;

    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--politics > a")
    public WebElement politics;

    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--tech > a")
    public WebElement tech;

    @FindBy(how = How.CLASS_NAME, using = "nav-menu__img-health")
    public WebElement health;

    @FindBy(xpath = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--entertainment > a > img")
    public WebElement entertainment;

    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--business > a")
    public WebElement business;

    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--travel > a > img")
    public WebElement travel;

    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--style > a > img")
    public WebElement style;

    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--bleacher > a > img")
    public WebElement br;
    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--videos > a")
    public WebElement videos;

    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--opinions > a")
    public WebElement opinion;
    @FindBy(how = How.CSS, using = "#nav-expanded-menu > div.nav-flyout__menu-item.nav-flyout__menu-item--Coupons > a")
    public WebElement coupons;

     public void navigationList(){
        //List<String> navList = new ArrayList<String>();
        navList.add("US");
        navList.add("world");
        navList.add("politics");
        navList.add("tech");
        navList.add("health");
        navList.add("entertainment");
        navList.add("business");
        navList.add("travel");
        navList.add("style");
        navList.add("br");
        navList.add("videos");
        navList.add("opinion");
        navList.add("coupons");

       //return navList;
    }
    public void storeNavListToDb() {
        ConnectDB db = new ConnectDB();

        String path = "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\CNN\\lib\\MySQL.properties";
       try {
           db.connectToSqlDatabase(path);
       }catch (Exception e) {
           System.out.println("Database connection Problem:  " + e);
       }
       try {
           db.insertStringDataFromArrayListToSqlTable(path, navList, "Navtb", "navItem");
       }catch (Exception e){
           System.out.println("NavList Insertion probnem: "+e );
       }

        //db.readDataBase(path);
    }

    public void readNavListFromDb() {
        ConnectDB db = new ConnectDB();

        String path = "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\CNN\\lib\\MySQL.properties";
        try {
            db.connectToSqlDatabase(path);
        }catch (Exception e) {
            System.out.println("Database connection Problem:  " + e);
        }
        try {
           navList= db.readDataBase(path, "Navtb", "navItem");
        }catch (Exception e){
            System.out.println("NavList reading probnem: "+e );
        }

        }

    public WebElement clickTech(){
        return new NavPage(driver).tech;
    }
    public WebElement clickWorld(){
        return new NavPage(driver).world;
    }
    public void clickByElement(WebElement element){
        element.click();
    }

}
