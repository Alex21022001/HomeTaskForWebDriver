package tests;

import data.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.GooglePage;
/*
*mvn-Dtest=SmokeTest test
*/
public class SmokeTest extends CommonConditions {
    @Test
    public void goTOGoogleAndSearchImagesVerifyTheirVisibility() {
        GooglePage googlePage = new GooglePage(driver);
        Assertions.assertTrue(googlePage.goToPage(Data.URL)
                .enterQueryForSearchField(Data.SEARCH_TEXT)
                .openImagesPage().verifyImageOnPage());
    }
}
