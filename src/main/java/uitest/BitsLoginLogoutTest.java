package uitest;

import static base.CommonConstants.bitsAdminPassword;
import static base.CommonConstants.bitsAdminUsername;
import static base.CommonConstants.bitsLoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Description;
import pages.BitsLoginPage;
import testListeners.TestListener;

/**
 * Created by Karma Tenzin on Feb 8 2022
 */


@Listeners({TestListener.class})  // Add listener for Allure report (this should be added to every test class)


public class BitsLoginLogoutTest extends BaseTest {
    //BitsLoginPage bitsLoginPage 
    @BeforeMethod
    public void getLoginPage() {
      //  bitsLoginPage = new BitsLoginPage(driver);
        driver.get(bitsLoginPage);
    }


    @Test(groups = "BitsLogin/Registration", enabled = true, priority = 0, description = "validates success login/Logout flow")
    @Description("Case Id: , Test Desc: validates success login/logout flow")
    //Case Id should be the test case Id written in TestRail
    public void checkSuccessLoginFlow() throws InterruptedException{
        BitsLoginPage bitsLoginPage = new BitsLoginPage(driver);             
        bitsLoginPage.setUsernameField(bitsAdminUsername)
        .setPasswordField(bitsAdminPassword).clickOnLoginButton()
        .clickOnLogoutButton(); 

        
    }
    
}