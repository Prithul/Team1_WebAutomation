package tests;

import org.testng.annotations.Test;
import search.DatabaseSearch;

public class DatabaseSearchFriends extends DatabaseSearch {

    @Test
    public void test23() throws InterruptedException{
        signIn();
        searchFriends();
    }
}
