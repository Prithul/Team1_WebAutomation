package tests;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestHomeAmazon extends CommonAPI {


    @Test
    public void test1() {

        getCurrentURL();
    }

    @Test
    public void test2() {

        getPageTitle();
    }

}
