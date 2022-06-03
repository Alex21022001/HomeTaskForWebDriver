package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {
    public GooglePage(WebDriver driver) {
        super(driver);
    }

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//input")
    private WebElement searchField;
    @FindBy(xpath = "//a[text()='Картинки']")
    private WebElement imagesButton;



    public GooglePage goToPage(String url) {
        logger.info("Open page  " + url);
        driver.navigate().to(url);
        waitForPageLoadComplete(WAIT_TIME);
        return new GooglePage(driver);
    }

    public GooglePage enterQueryForSearchField(String textOfQuery) {
        searchField.sendKeys(textOfQuery, Keys.ENTER);
        waitForPageLoadComplete(WAIT_TIME);
        return new GooglePage(driver);

    }

    public ImagesPage openImagesPage(){
        imagesButton.click();
        waitForPageLoadComplete(WAIT_TIME);
        return new ImagesPage(driver);
    }
}
