package pageModelObject;

import org.testng.annotations.Test;
import search.searchPage;

public class TestHomeFacebook extends searchPage {
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
        }
          @Test
          public void test15() throws InterruptedException {
              signIn();
              Thread.sleep(3000);
              setPicture();
          }
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
        public void test22() throws InterruptedException {
            signIn();
            settingPref();
        }
         @Test   //about me tab and overview
        public void test2() throws InterruptedException {
        signIn();
        homePage();
        Thread.sleep(3000);
        aboutMe();
    }
     @Test
      public void test24() throws InterruptedException{
          signIn();
          homePage();
          Thread.sleep(3000);
          friends();
      }
      @Test
      public void test25() throws InterruptedException{
          signIn();
          homePage();
          Thread.sleep(3000);
          photos();
      }
      @Test
      public void test26() throws InterruptedException{
          signIn();
          homePage();
          Thread.sleep(3000);
          archive();
      }
      @Test
      public void test27() throws InterruptedException{
          signIn();
          homePage();
          Thread.sleep(3000);
          timeline();
      }
      @Test
      public void test28() throws InterruptedException{
          signIn();
          homePage();
          Thread.sleep(3000);
          more();
      }
    @Test
    public void test29() throws InterruptedException {
        signIn();
        homePage();
        Thread.sleep(3000);
        likeaPost();
    }
    @Test
    public void test30() throws InterruptedException {
        signIn();
        homePage();
        Thread.sleep(3000);
        leaveComment();
    }
}