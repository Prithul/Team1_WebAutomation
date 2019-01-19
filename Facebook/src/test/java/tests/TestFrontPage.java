package tests;

import base.CommonAPI;
import org.apache.commons.exec.OS;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import search.FrontPageNdSignOut;

public class TestFrontPage extends FrontPageNdSignOut {

        FrontPageNdSignOut frontPage;
        @BeforeMethod
        public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        frontPage = PageFactory.initElements(driver, FrontPageNdSignOut.class); }

        @Test
        public void test1() throws InterruptedException {
        createAccount(); }

        @Test   //purposed failed test
        public void test2() {
        verifyDDMonth(); }

        @Test   //purposed failed test
        public void test3() {
        verifyDDday(); }

        @Test
        public void test4() {
        verifyDDyear(); }

        @Test   //shows all months listed in dropdown
        public void test5() {
        getAllMonthsListedInDropDown(); }

        @Test
        public void test6() {
        SignIn();
        SignOut(); }

        @Test
        public void test7() {
        SignIn();}

        @Test
        public void test8() {
        isLogoDisplayed();}

        @Test
        public void test9() {
        birthMonthSelect(); }

        @Test
        public void test10(){
        birthDaySelect(); }

        @Test
        public void test11(){
        birthYearSelect(); }
}