package home;

import base.CommonAPI;
import cellphones.CellPhonesPage;
import homepage.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Lili on 5/21/2017.
 */
public class TestPhonesPage extends CommonAPI {
    @Override
    public String Url() {
        return "https://www.t-mobile.com/";
    }

    /**
     * phone page test
     * searches for Iphone
     * clicks on first result
     * verifies that the open product page is iphone
     *
     * all tests are same in this page just search for different phones
     * data driven tests are located in DataDrivenPhonesSearch page
     */
    @Test
    public void SearchForIPhone7() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        homePage.navigateToCellPhonesPage();
        cellPhonesPage.searchForPhone("IPhone 7 plus");
        cellPhonesPage.clickOnFirstResult();
        cellPhonesPage.verifyProductName("Apple iPhone 7 Plus");
    }

    @Test
    public void SearchForIPhoneSE() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        homePage.navigateToCellPhonesPage();
        cellPhonesPage.searchForPhone("Apple iPhone SE");
        cellPhonesPage.clickOnFirstResult();
        cellPhonesPage.verifyProductName("Apple iPhone SE");
    }

    @Test
    public void SearchForIPhone6Plus() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        homePage.navigateToCellPhonesPage();
        cellPhonesPage.searchForPhone("Apple iPhone 6s Plus");
        cellPhonesPage.clickOnFirstResult();
        cellPhonesPage.verifyProductName("Apple iPhone 6s Plus");
    }

    @Test
    public void SearchForLGG6() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        homePage.navigateToCellPhonesPage();
        cellPhonesPage.searchForPhone("LG G6");
        cellPhonesPage.clickOnFirstResult();
        cellPhonesPage.verifyProductName("LG G6™");
    }

    @Test
    public void SearchForSamsungGalaxyS8() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        homePage.navigateToCellPhonesPage();
        cellPhonesPage.searchForPhone("Samsung Galaxy S8 plus");
        cellPhonesPage.clickOnFirstResult();
        cellPhonesPage.verifyProductName("Samsung Galaxy S8 plus");
    }

    @Test
    public void SearchForSamsungGalaxyS7() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        homePage.navigateToCellPhonesPage();
        cellPhonesPage.searchForPhone("Samsung Galaxy S7");
        cellPhonesPage.clickOnFirstResult();
        cellPhonesPage.verifyProductName("Samsung Galaxy S7");
    }

    @Test
    public void SearchForSamsungGalaxyJ7() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        homePage.navigateToCellPhonesPage();
        cellPhonesPage.searchForPhone("Samsung Galaxy J7");
        cellPhonesPage.clickOnFirstResult();
        cellPhonesPage.verifyProductName("Samsung Galaxy J7");
    }
}
