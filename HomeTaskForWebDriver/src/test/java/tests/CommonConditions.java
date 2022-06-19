package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;


import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class CommonConditions {
    WebDriver driver;
    private final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    public void setup() {
        logger.info("create driver");
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterEach
    public void close() {
        driver.quit();
    }
}
