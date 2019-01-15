package search;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class searchPage extends CommonAPI {
    public void signIn() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ameladrv@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("PNTeam1234");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
    public void clickNext() {
        driver.findElement(By.xpath("//*[@id=\"more_pager_pagelet_5c32abe4bd77e7f73417783\"]/div/a")).click();
    }
    public void chat() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"fbDockChatBuddylistNub\"]/a")).click();
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.xpath("//*[@id=\"chatsearch\"]/div/span/label/input"));
        search.click();
        search.sendKeys("Amela", Keys.ENTER);
    }
    public void homepageStatus() throws InterruptedException {
        WebElement status = driver.findElement(By.xpath("//*[@id=\"js_6\"]"));
        //Thread.sleep(1000);
        status.sendKeys("i am feeling good");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("react-composer-post-button")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("react-composer-post-button")).click();
        driver.switchTo().alert().dismiss();
    }
    public void homePage() throws InterruptedException {
        WebElement TeamPntHome = driver.findElement(By.xpath("//*[@id=\"navItem_100032236822754\"]/a/div"));
        TeamPntHome.click();
        Thread.sleep(2000);
    }
    public void Search() throws InterruptedException {
        WebElement searchField = driver.findElement(By.xpath("//input[@aria-label='Search']"));
        // searchField.click();
        searchField.sendKeys("Amela Dervishi", Keys.ENTER);
    }
    public void setPicture() throws InterruptedException {
        WebElement homepage = driver.findElement(By.cssSelector("._1qv9"));
        homepage.click();
        Thread.sleep(2000);
        WebElement picture = driver.findElement(By.xpath("//div[@class= '_156n _23fw _1o59']"));
        picture.click();
        Thread.sleep(3000);
        WebElement uploadPicture = driver.findElement(By.cssSelector("._3jjt"));
        uploadPicture.click();
    }
    public void checkNotification() throws InterruptedException {
        WebElement homepage = driver.findElement(By.linkText("Notifications"));
        homepage.click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Mark All as Read")).click();
    }
    public void changePrivacy() throws InterruptedException {
        WebElement homepage = driver.findElement(By.xpath("//div[@class='_59fb _tmz f_click'"));
        homepage.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-testis = 'contextual_help_checkup_button_id']")).click();
    }
    public void addToStory() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='_mxb _4qbo _4u-0']")).click();
    }
    //see friend's requests
    public void seeFriends() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/find-friends/browser/?ref=psa']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'View Sent Requests')]")).click();
    }
    public void settingPref() throws InterruptedException {
        //  driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
        //  Thread.sleep(2000);
        WebElement arrowDD = driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
        arrowDD.click();
        Thread.sleep(2000);
        // this is for mouse hovering
        Actions actions = new Actions(driver);
        WebElement settings = driver.findElement(By.xpath("//*[@id=\"js_e\"]/div/div/ul/li[13]/a"));
        actions.moveToElement(settings);
        actions.click().build().perform();
        WebElement temp = driver.findElement(By.xpath("//*[@id=\"SettingsPage_Content\"]/ul/li[4]/a"));
        temp.click();
        Thread.sleep(3000);
        WebElement changeTemp = driver.findElement(By.name("temperature"));
        Select celcius = new Select(changeTemp);
        celcius.selectByValue("2");
        Thread.sleep(3000);
        // WebElement submitButton = driver.findElement(By.partialLinkText("Save Changes"));
        // actions.moveToElement(submitButton);
        // actions.click().build().perform();
    }
    //testing aboutMe tab from homepage
    public void aboutMe() throws InterruptedException {
        WebElement aboutMe = driver.findElement(By.linkText("About"));
        aboutMe.click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Overview")).click();
    }
    // testing friends tab from homepage
    public void friends() throws InterruptedException {
        driver.findElement(By.linkText("Friends"));
    }
    //testing photos tab from homepage
    public void photos() throws InterruptedException {
        driver.findElement(By.linkText("Photos"));
    }
    //testing archive tab from homepage
    public void archive() throws InterruptedException {
        driver.findElement(By.linkText("Archive"));
    }
    // testing timeline tab from homepage
    public void timeline() throws InterruptedException {
      WebElement timeline = driver.findElement(By.linkText("Timeline"));
      timeline.click();
      driver.findElement(By.linkText("List View")).click();
    }
    // testing More tab from hompage
    public void more(){
        driver.findElement(By.linkText("More")).click();
        driver.findElement(By.linkText("Videos")).click();
    }
    public void likeaPost(){
        driver.findElement(By.linkText("Like")).click();
        //driver.findElement(By.linkText("//span[contains(@class,'_iuw _iuy')]//div[contains(@class,'_39n')]")).click();
    }
    public void leaveComment() {
        WebElement comment = driver.findElement(By.xpath("//*[@id=\"u_fetchstream_2_8\"]/div/div[2]/div/div/span[2]/a"));
        comment.click();
        comment.sendKeys("Hello",Keys.ENTER);
    }
    }
