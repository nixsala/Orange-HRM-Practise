
package testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelUtil;


public class LoginHRMData extends ExcelUtil {

    private static final Logger LOGGER = Logger.getLogger(LoginHRMData.class);

    public LoginHRMData() {
        super("src\\test\\resources\\ExcelSheet\\.LoginOrangeHRM");
    }
    @DataProvider (name = "OrangeHRMLogin")
    public Object[][] OrangeHRMLogin() {

        int rows = getRowCount("loginHRM");
        int col = getColumnCount("loginHRM");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("loginHRM", i, j);
            }
        }
        return data;
    }

}
