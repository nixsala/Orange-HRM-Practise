package pages.adminHRM.job;

import controllers.MethodBase;
import controllers.PageBase;

public class Job extends PageBase {
    private static String jobSubMenu = ("menu_admin_Job");
    private static String dropJobtitle = ("menu_admin_viewJobTitleList");

    public static void getjobEelements() {
        MethodBase.click_ById(jobSubMenu);
        MethodBase.click_ById(dropJobtitle);

    }
}
