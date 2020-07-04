package testPages;

import controllers.TestBase;
import org.testng.annotations.Test;
import pages.LoginPageHRM;

public class LoginTest extends TestBase {
    @Test(groups = {"Smoke"}, priority = 1)

    public void LoginTest() {
        LoginPageHRM.getLoginEelements();



    }

}


