package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Karma Tenzin on Feb 8 2022
 */


public class BitsHomePage extends BasePage {

        //Constructor to load and wait bitsHomepage
    public BitsHomePage(WebDriver driver) {
        super(driver);        
        waitVisibility(By.xpath("//html//body//app-root//app-main-layout//nz-layout/nz-layout//nz-header//app-header-user//div"));
    }
   
   
     
        // clicks on Logout button
    public void clickOnLogoutButton() throws InterruptedException{
         
        // Locating the Main Menu (Parent element)
        WebElement mainMenu = driver.findElement(By.cssSelector("div[class *='user-menu'] div[class *='user-dropdown']"));

        //Instantiating Actions class
        Actions actions = new Actions(driver);

        //Hovering on main menu
        actions.moveToElement(mainMenu).perform();Thread.sleep(10000);
        driver.findElement(By.xpath("//li[text() = 'Logout']")).click();
    }

}


