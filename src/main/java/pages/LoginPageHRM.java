package pages;

import controllers.MethodBase;
import controllers.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class LoginPageHRM extends PageBase {


    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(LoginPageHRM.class));

    private static String username = ("txtUsername");
    private static String upass = ("txtPassword");
    private static String butlogin = ("btnLogin");
    private static String dashboardVerification = ("//*[@id=\"content\"]/div/div[1]/h1");
    private static String alertMessage = ("spanMessage");



    public static void getLoginEelements() {
        MethodBase.sendKeys(username, "Admin");
        MethodBase.sendKeys(upass, "admin123");
        MethodBase.click_ById(butlogin);
        MethodBase.isDisplayed_ByXpath(dashboardVerification);
        LOGGER.info("DashBoardPage is displayed");

    }

    public static void loginWithExcelData(String userName, String password, String status, String alertMSg) {
        if (status == "valid") {
            MethodBase.sendKeys(username, userName);
            MethodBase.sendKeys(upass, password);
            MethodBase.click_ById(butlogin);
            LOGGER.info("DashBoardPage is displayed");
            MethodBase.isDisplayed_ByXpath(dashboardVerification);
            LOGGER.info("login success");
        } else {
            MethodBase.sendKeys(username, userName);
            MethodBase.sendKeys(upass, password);
            MethodBase.click_ById(butlogin);
            MethodBase.isDisplayed_ByXpath(alertMessage);
            LOGGER.info(alertMSg);
        }


    }
}
