package dataDriven;

import base.CommonAPI;
import cellphones.CellPhonesPage;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

import java.io.IOException;

/**
 * Created by Lili on 5/21/2017.
 */
public class DataDrivenPhonesSearch extends CommonAPI {
    @Override
    public String Url() {
        return "https://www.t-mobile.com/";
    }

    @Test
    public void DataDrivenSearchAndVerify() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);
        homePage.navigateToCellPhonesPage();
        cellPhonesPage.getSearchDataFromExcelFileAndSearch();
    }

}
