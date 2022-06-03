package tests;

import data.Data;
import org.junit.Assert;
import org.junit.Test;
import pages.GooglePage;

public class SmokeTest extends CommonConditions{
    @Test
    public void goTOGoogleAndSearchImagesVerifyTheirVisibility(){
        GooglePage googlePage = new GooglePage(driver);
       Assert.assertTrue(googlePage.goToPage(Data.URL)
                .enterQueryForSearchField(Data.SEARCH_TEXT)
                .openImagesPage().verifyImageOnPage());
    }
}
