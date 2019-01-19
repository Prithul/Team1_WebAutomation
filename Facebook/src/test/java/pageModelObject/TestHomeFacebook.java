package pageModelObject;

import org.testng.annotations.Test;
import search.searchPage;

public class TestHomeFacebook extends searchPage {

    /*  @Test
    public void test1()throws InterruptedException{
        signIn();
    }

  //  @Test
   // public void test2() throws InterruptedException{
   //     signIn();

   //     clickNext();}

        @Test
         public void test3() throws InterruptedException  {
         bDay();
        }
        @Test
         public void test4() throws InterruptedException{
         bMonth();
        }

         @Test
         public void test5() throws InterruptedException{
         bYear();
        }



            //this is a purposed failed test
         @Test
         public void test6(){
         verifyDDMonth();}
         //this is a purposed failed test
         @Test
         public void test7(){
         verifyDDday();
             }
          //for this test - the default value matched the value i selected - test passes
         @Test
          public void test8(){
             verifyDDyear();
            }
            // gets a list of all the months in the drop down and verifies for the total number if correct
          @Test
           public void test9(){
              getDDMonth();
    }*/
     /*     @Test
          public void test10() throws InterruptedException{
             logo();
    }

    @Test
    public void test11() throws InterruptedException {
        signIn();
        Thread.sleep(2000);
        chat();
    }

    @Test
    public void test12() throws InterruptedException {
        signIn();
        Thread.sleep(3000);
        homepageStatus();
    }

    @Test
    public void test13() throws InterruptedException {
        signIn();
        Thread.sleep(2000);
        homePage();
    }

    @Test
    public void test14() throws InterruptedException {
        signIn();
        Thread.sleep(3000);
        Search();
    }*/

    /*  @Test
      public void test15() throws InterruptedException {
          signIn();
          Thread.sleep(3000);
          setPicture();
      }*/
    @Test
    public void test16() throws InterruptedException {
        signIn();
        Thread.sleep(3000);
        checkNotification();
    }
    @Test
    public void test17() throws InterruptedException {
        signIn();
        Thread.sleep(3000);
        changePrivacy();

    }
    @Test
    public void test18() throws InterruptedException{
        signIn();
        Thread.sleep(5000);
        SignOut();
    }
    @Test
    public void test19() throws InterruptedException {
        createAcct();
    }

    @Test
    public void test20() throws InterruptedException {
        signIn();
        addToStory();
    }
    @Test
    public void test21() throws InterruptedException{
        signIn();
        seeFriends();
    }
    @Test
    public void test22() throws InterruptedException{
        signIn();
        settingPref();
    }


}
