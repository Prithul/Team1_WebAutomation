package tests;

import org.testng.annotations.Test;

public class TestSignInSignOutAmazon extends essentialUtility.SignInSignOut {

    @Test
    public void test3() throws InterruptedException {

        getIncorrectPass();
    }

    @Test
    public void test4() throws InterruptedException {

        getSignIn_SignOut();
    }


}

