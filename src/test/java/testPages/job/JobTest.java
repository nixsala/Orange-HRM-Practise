package testPages.job;

import controllers.TestBase;
import org.testng.annotations.Test;
import pages.LoginPageHRM;
import pages.adminHRM.AdminHRM;
import pages.adminHRM.job.Job;
import testData.LoginHRMData;

public class JobTest extends TestBase {
    @Test(groups = {"Smoke"}, priority = 1)

    public void jobHRMTest() {

       LoginPageHRM.getLoginEelements();
        AdminHRM.getAdminEelements();
        Job.getjobEelements();


    }
}
