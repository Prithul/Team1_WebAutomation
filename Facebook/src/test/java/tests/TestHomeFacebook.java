package tests;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import search.HomePage;

public class TestHomeFacebook extends HomePage {

    HomePage facebookHomePage;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        facebookHomePage = PageFactory.initElements(driver, HomePage.class); }

        @Test
        public void test12(){
        SignIn();
        chat(); }
        @Test
        public void test13()  {
        SignIn();
        createPost();}
        @Test
        public void test14(){
        SignIn();
        myFacebookHomeTab(); }
        @Test
        public void test15(){
        SignIn();
        SearchforPeopleBox(); }
        @Test
        public void test16() {
        SignIn();
        setPicture(); }
        @Test
        public void test17(){
        SignIn();
        checkNotification();
        }
        @Test
        public void test19() {
        SignIn();
        addToStory(); }
        @Test
        public void test20(){//failed
        SignIn();
        seeFriends(); }
        @Test
        public void test22(){
        SignIn();
        myFacebookHomeTab();
        aboutMe(); }
        @Test
        public void test23(){
        SignIn();
        myFacebookHomeTab();
        friends(); }
        @Test
        public void test24(){
        SignIn();
        myFacebookHomeTab();
        photos(); }
        @Test
        public void test25() throws InterruptedException{
        SignIn();
        myFacebookHomeTab();
        Thread.sleep(2000);
        archive(); }
        @Test
        public void test26(){
        SignIn();
        myFacebookHomeTab();
        timeline(); }
        @Test
        public void test27(){
        SignIn();
        myFacebookHomeTab();
        more(); }
        @Test
        public void test28(){
        SignIn();
        myFacebookHomeTab();
        likeaPost(); }
        @Test
        public void test29() throws InterruptedException {
        SignIn();
        myFacebookHomeTab();
        Thread.sleep(2000);
        leaveComment(); }
        @Test
        public void test38(){
        SignIn();
        changeTheLanguage();}
        @Test
        public void test39(){
        SignIn();
        shareAPost();}
        @Test
        public void test40(){
        SignIn();
        emojiComment();}
    }
