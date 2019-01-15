package tests;

import org.testng.annotations.Test;
import search.FrontPageNdSignOut;

public class TestFrontPage extends FrontPageNdSignOut {
    @Test
    public void test19() throws InterruptedException {
        createAcct();
    }

/*    @Test
    public void test1() throws InterruptedException {
        signIn();
    }

    @Test
    public void test3() throws InterruptedException {
        bDay();
    }

    @Test
    public void test4() throws InterruptedException {
        bMonth();
    }

    @Test
    public void test5() throws InterruptedException {
        bYear();
    }

    //this is a purposed failed test
    @Test
    public void test6() {
        verifyDDMonth();
    }

    //this is a purposed failed test
    @Test
    public void test7() {
        verifyDDday();
    }

    //for this test - the default value matched the value i selected - test passes
    @Test
    public void test8() {
        verifyDDyear();
    }

    // gets a list of all the months in the drop down and verifies for the total number if correct
    @Test
    public void test9() throws InterruptedException {
        getDDMonth();
    }

    @Test
    public void test10() throws InterruptedException {
        logo();
    }
    @Test
    public void test18() throws InterruptedException{
        signIn();
        Thread.sleep(5000);
        SignOut();
    }*/

}