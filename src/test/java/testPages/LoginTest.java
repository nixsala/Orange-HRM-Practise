package testPages;

import controllers.TestBase;
import org.testng.annotations.Test;
import pages.LoginPageHRM;
import testData.LoginHRMData;


public class LoginTest extends TestBase {

    @Test(groups = {"Smoke"}, priority = 1,dataProviderClass = LoginHRMData.class,dataProvider = "OrangeHRMLogin")

    public void LoginTest(String username,String Password,String status,String alertmsg) {
       // LoginPageHRM.getLoginEelements();
        LoginPageHRM.loginWithExcelData(username,Password,status,alertmsg);



    }

}


