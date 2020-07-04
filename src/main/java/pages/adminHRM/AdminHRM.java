package pages.adminHRM;

import controllers.MethodBase;
import controllers.PageBase;
import pages.LoginPageHRM;

import java.util.logging.Logger;

public class AdminHRM  extends PageBase {
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(AdminHRM.class));

    private static String adminTab = ("menu_admin_viewAdminModule");
    private static String adminPanelVerify = ("//*[@id=\"content\"]/div/div[1]/h1");



    public static void getAdminEelements() {
        MethodBase.click_ById(adminTab);
        MethodBase.isDisplayed_ByXpath(adminPanelVerify);


    }

}
