package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;


import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class CommonConditions {
    WebDriver driver;

    @Before
    public void setup() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void close() {
        driver.quit();
    }
}
