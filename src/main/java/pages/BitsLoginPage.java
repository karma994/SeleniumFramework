package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




/**
 * Created by Karma Tenzin on Feb 8 2022
 */

public class BitsLoginPage extends BasePage {

    public BitsLoginPage(WebDriver driver) {
        super(driver);
    }

    private By usernameField = By.xpath("//input[@placeholder='Username']");
    private By passwordField = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[@class='ant-btn ant-btn-primary']");
    private By forgotPasswordLink = By.xpath("/html/body/app-root/app-auth-layout/div/div[2]/div/app-auth-page/app-basic-login-page/div/a[1]");
    private By forgotUsernameLink = By.xpath("/html/body/app-root/app-auth-layout/div/div[2]/div/app-auth-page/app-basic-login-page/div/a[2]");
    //private By homePage = By.xpath("/html/body/app-root/app-main-layout/nz-layout/nz-layout/nz-header/app-header-user/div");
    

    




    // sets username taken from commonConstants in the username field
    public BitsLoginPage setUsernameField(String username){
        writeText(usernameField,username);
        return this;
    }

    // sets password taken from commonConstants in the password field
    public BitsLoginPage setPasswordField(String password){
        writeText(passwordField, password);
        return this;
    }

    // clicks on Sign up button
    public BitsHomePage clickOnLoginButton(){
        click(loginButton);
        
        BitsHomePage home = new BitsHomePage(driver);
        return home; 
    }

     
        

   

    //clicks on forgotPassword link
    public void clickOnForgotPasswordLink(){
        click(forgotPasswordLink);
    }

    //clicks on forgotUsername link
    public void clickOnForgotUsernameLink(){
        click(forgotUsernameLink);
    }
}
