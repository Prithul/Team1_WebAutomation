package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import googleSheetUtility.ConnectDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NavPage extends BasePage {

     public Map<WebElement,String> navList = new HashMap< WebElement,String>();

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

    public NavPage(WebDriver driver){
        super(driver);
    }

     public void navigationList(){
        //List<String> navList = new ArrayList<String>();
        navList.put(US,"US");
        navList.put(world,"world");
        navList.put(politics,"politics");
        navList.put(tech,"tech");
        navList.put(health,"health");
        navList.put(entertainment,"entertainment");
        navList.put(business,"business");
        navList.put(travel,"travel");
        navList.put(style,"style");
        navList.put(br,"br");
        navList.put(videos,"videos");
        navList.put(opinion,"opinion");
        navList.put(coupons,"coupons");


    }
    public List<WebElement> navigationArrayList(){
        List<WebElement> list = new ArrayList<WebElement>();
        list.add(US);
        list.add(world);
        list.add(politics);
        list.add(tech);
        list.add(health);
        list.add(entertainment);
        list.add(business);
        list.add(travel);
        list.add(style);
        list.add(br);
        list.add(videos);
        list.add(opinion);
        list.add(coupons);
  return list;

    }

    public void storeNavListToDb() {
        ConnectDB db = new ConnectDB();
        List<String> list = null;  // later
        String path = "C:\\Users\\HALIMA\\IdeaProjects\\Team1\\CNN\\lib\\MySQL.properties";
       try {
           db.connectToSqlDatabase(path);
       }catch (Exception e) {
           System.out.println("Database connection Problem:  " + e);
       }
       try {
           db.insertStringDataFromArrayListToSqlTable(path, list, "Navtb", "navItem");
       }catch (Exception e){
           System.out.println("NavList Insertion probnem: "+e );
       }

        //db.readDataBase(path);
    }

       public List<String> readNavListFromDb() {
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
    public void goNavSite() {
        List<WebElement> list = navigationArrayList();
        for(int i=0; i<list.size(); i++) {
            list.get(i).click();

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
