package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ImagesPage extends BasePage {
    public ImagesPage(WebDriver driver) {
        super(driver);
    }
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//div[@jsname='r5xl4']/div")
    private List<WebElement> listOfImages;

    public boolean verifyImageOnPage(){
        int count=0;
        logger.info("Verify images present");
        for (int i = 0; i <listOfImages.size(); i++) {
            if (Integer.parseInt(listOfImages.get(i).getAttribute("clientHeight"))>50){
                if (Integer.parseInt(listOfImages.get(i).getAttribute("clientWidth"))>50){
                    count++;
                }
            }
        }
        return  (count>=listOfImages.size());
    }
}
