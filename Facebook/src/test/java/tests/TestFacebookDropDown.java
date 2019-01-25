package tests;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import search.FacebookDropDown;
import search.HomePage;

public class TestFacebookDropDown extends FacebookDropDown {

        FacebookDropDown facebookDD;
        @BeforeMethod
        public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        facebookDD = PageFactory.initElements(driver, FacebookDropDown.class); }

       @Test
        public void test21 () {
        SignIn();
        CreateaPage(); }
        @Test
        public void test18 () {
        SignIn();
        checkSettings(); }
        @Test
        public void test32 () {
        SignIn();
        CreateaGroup(); }
        @Test
        public void test33 () {
        SignIn();
        createFundraiser(); }
        @Test
        public void test34 () {
        SignIn();
        createAds(); }
        @Test
        public void test35 () {
        SignIn();
        AdvertisingOnFacebook();}
        @Test
        public void test36 () {
        SignIn();
        ActivityLog(); }
        @Test
        public void test37 () {
        SignIn();
        NewsFeedPreferances();}
        @Test
        public void test38 (){
        SignIn();
        FindGroups(); }
}




