package tests;

import org.testng.annotations.Test;


public class TestDropDownAmazon extends essentialUtility.DropDown {

    @Test
    public void test7() throws InterruptedException {
        viewDropDown();
    }
    @Test
    public void test8() throws InterruptedException{
        selectDropDownItem();
    }
    @Test
    public void test9() throws InterruptedException {
        getDropDownItem();
    }

}

