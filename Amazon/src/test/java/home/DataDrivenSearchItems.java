package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.ItemsToBeSearched;
import search.SearchPage;
import utility.reporting.ApplicationLog;
import utility.reporting.TestLogger;

import java.io.IOException;

/**
 * Created by Lili on 5/21/2017.
 */
public class DataDrivenSearchItems extends CommonAPI {
    @Test
    public void dataDrivenSearchAndVerify() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.getSearchDataFromExcelFileAndSearch();
    }

    @Test
    public void dataDrivenSearchAndOrder() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.getSearchDataFromExcelFileAndOrder();
    }
}
