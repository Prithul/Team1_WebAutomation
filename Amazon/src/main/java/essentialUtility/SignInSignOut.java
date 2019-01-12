package essentialUtility;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignInSignOut extends CommonAPI {


    public void getIncorrectPass() throws InterruptedException {

        Actions actions = new Actions(driver);

        // sign in
        WebElement mainMenu = driver.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(mainMenu);
        actions.build().perform();

        WebElement subMenu = driver.findElement(By.cssSelector("span.nav-action-inner"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        driver.findElement(By.cssSelector("#ap_email")).sendKeys("pbarua2018@gmail.com");
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("test2020");
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        Thread.sleep(2000);
        System.out.println("OOPs! Please check your password for Sign-In");

    }

    public void getSignIn_SignOut() throws InterruptedException {

        Actions actions = new Actions(driver);

        // sign in
        WebElement mainMenu = driver.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(mainMenu);
        actions.build().perform();

        WebElement subMenu = driver.findElement(By.cssSelector("span.nav-action-inner"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        driver.findElement(By.cssSelector("#ap_email")).sendKeys("pbarua2018@gmail.com");
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("test2018");
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        System.out.println("Successfully Sign-In");
        Thread.sleep(2000);

        // sign out
        WebElement mainMenu1 = driver.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(mainMenu1);
        actions.build().perform();

        driver.findElement(By.id("nav-item-signout")).click();
        System.out.println("Successfully Sign-Out");

    }

}


