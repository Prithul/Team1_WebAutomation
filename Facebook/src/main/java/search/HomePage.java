package search;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//input[@type='email']")
    public static WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    public static WebElement logInBttn;
    @FindBy(xpath = "//*[@id=\"more_pager_pagelet_5c32abe4bd77e7f73417783\"]/div/a")
    public static WebElement next;
    @FindBy(xpath = "//*[@id=\"fbDockChatBuddylistNub\"]/a")
    public static WebElement chatBoxWindow;
    @FindBy(xpath = "//*[@id=\"chatsearch\"]/div/span/label/input")
    public static WebElement searchPeopleToChat;
    @FindBy(xpath = "//*[@id=\"js_6\"]")
    public static WebElement status;
    @FindBy(name = "Share")
    public static WebElement statusSubmitBttn;
    @FindBy(xpath = "//*[@id=\"navItem_100032236822754\"]/a/div")
    public static WebElement TeamPntHomeTab;
    @FindBy(xpath = "//input[@aria-label='Search']")
    public static WebElement searchforPeople;
    @FindBy(css = "._1qv9")
    public static WebElement homePageclick;
    @FindBy(xpath = "//div[@class= '_156n _23fw _1o59']")
    public static WebElement setPicture;
    @FindBy(css = "._3jjt")
    public static WebElement uploadPicture;
    @FindBy(linkText = "Notifications")
    public static WebElement notifications;
    @FindBy(linkText = "Mark All as Read")
    public static WebElement markNotifications;
    @FindBy(xpath = "//span[@class='_mxb _4qbo _4u-0']")
    public static WebElement AddToStory;
    @FindBy(xpath = "//a[@href='https://www.facebook.com/find-friends/browser/?ref=psa']")
    public static WebElement findFriends;
    @FindBy(xpath = "//a[contains(text(),'View Sent Requests')]")
    public static WebElement ViewSentRequests;
    @FindBy(linkText = "About")
    public static WebElement About;
    @FindBy(partialLinkText = "Overview")
    public static WebElement Overview;
    @FindBy(linkText = "Friends")
    public static WebElement Friends;
    @FindBy(linkText = "Photos")
    public static WebElement Photos;
    @FindBy(linkText = "Archive")
    public static WebElement Archive;
    @FindBy(linkText = "Timeline")
    public static WebElement Timeline;
    @FindBy(linkText = "List View")
    public static WebElement ListView;
    @FindBy(linkText = "More")
    public static WebElement More;
    @FindBy(linkText = "Videos")
    public static WebElement Videos;
    @FindBy(linkText = "Like")
    public static WebElement Like;
    @FindBy(linkText = "Comment")
    public static WebElement Comment;
    @FindBy(linkText = "Español")
    public static WebElement ChangeLang;
    @FindBy(linkText = "Share")
    public static WebElement ShareAPost;
    @FindBy(css = ".InsertEmoji")
    public static WebElement EmojiComment;
    @FindBy(xpath ="//img[@class='_5zft img']")
    public static WebElement chooseEmoji;



    public void SignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        username.sendKeys("ameladrv@gmail.com");
        password.sendKeys("PNTeam1234");
        logInBttn.click(); }

    public void clickNext() {
        next.click(); }

    public void chat() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        chatBoxWindow.click();
        searchPeopleToChat.click();
        searchPeopleToChat.sendKeys("Amela", Keys.ENTER); }

    public void createPost() {
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         status.sendKeys("i am feeling good");
         statusSubmitBttn.click();
    }
    public void myFacebookHomeTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TeamPntHomeTab.click(); }

    public void SearchforPeopleBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchforPeople.sendKeys("Amela Dervishi", Keys.ENTER); }

    public void setPicture(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageclick.click();
        setPicture.click();
        uploadPicture.click();
    }
    public void checkNotification(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        notifications.click();
        markNotifications.click();
    }

    public void addToStory() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AddToStory.click();
    }
    //see friend's requests
    public void seeFriends(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findFriends.click();
        ViewSentRequests.click();
    }

    //testing aboutMe tab from homepage
    public void aboutMe(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        About.click();
        Overview.click();
    }
    // testing friends tab from homepage
    public void friends() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Friends.click();
    }
    //testing photos tab from homepage
    public void photos(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Photos.click();
    }
    //testing archive tab from homepage
    public void archive(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Archive.click();
    }
    // testing timeline tab from homepage
    public void timeline() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Timeline.click();
        ListView.click();
    }
    // testing More tab from hompage
    public void more(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        More.click();
       Videos.click();
    }
    public void likeaPost(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Like.click();
    }
    public void leaveComment() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Comment.click();
        Comment.sendKeys("Hello",Keys.ENTER);
    }
    public void changeTheLanguage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ChangeLang.click();}
    public void shareAPost() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShareAPost.click();}
    public void emojiComment() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        EmojiComment.click();
        chooseEmoji.click();}

    }
