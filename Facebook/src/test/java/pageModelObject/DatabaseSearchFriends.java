package tests;

import org.testng.annotations.Test;

public class DatabaseSearchFriends extends search.DatabaseSearch {

    @Test

    public void test23() throws InterruptedException{
        signIn();
        searchFriends();
    }
}
