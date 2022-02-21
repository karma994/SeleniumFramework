package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

/**
 * Created by Karma Tenzin on Feb 8 2022
 */

public class BaseTest {
    protected WebDriver driver;


    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public WebDriver getDriver(){
        return driver;
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
    
    
}