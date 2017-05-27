package home;

import base.CommonAPI;
import cellphones.CellPhonesPage;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import promotions.FastestNetworkPromotionPage;
import switchCarrier.SwitchCarrierPage;
import utility.reporting.TestLogger;

/**
 * Created by PIIT_NYA on 5/7/2017.
 */
public class TestHomepagePromotions extends CommonAPI {
    @Override
    public String Url() {
        return "https://www.t-mobile.com/";
    }

    /**
     * Tests navigate to phone page and verifies the first item title
     */
    @Test
    public void TestNavigateToCellPhonePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        homePage.navigateToCellPhonesPage();
        String productName = cellPhonesPage.getFirstProductName();
        Assert.assertEquals(productName, "Samsung Galaxy S8");
    }


    /**
     * verifies the samsung galaxy promotion
     * clicks on the promotion
     * verifies that the open page is the samsung phone page
     */
    @Test
    public void TestPromotionSamsungGalaxy() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        String promotionText = homePage.getPromotionName();
        Assert.assertEquals(promotionText.toLowerCase().contains("samsung"), true);
        homePage.navigateToSamsungPromotion();

        String productName = cellPhonesPage.getCellPhoneDescription();
        Assert.assertEquals(productName, "Samsung Galaxy S8");
    }

    /**
     * Verifies the fast switch promotion
     * clicks on the promotion
     * verifies that the open page is the fast switch page
     */
    @Test
    public void TestPromotionFastSwitch() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SwitchCarrierPage switchCarrierPage = PageFactory.initElements(driver, SwitchCarrierPage.class);

        String promotionText = homePage.getSwitchCarrierPromotionText();
        Assert.assertEquals(promotionText.toLowerCase().contains("switch"), true);

        homePage.navigateToSwitchCarrier();

        String stepOneText = switchCarrierPage.getQuestionOneText();
        Assert.assertEquals(stepOneText.trim(), "First, which device are you interested in?");
    }

    /**
     * Verifies the fastest network
     * clicks on the promotion
     * verifies that the open page is the fastest network
     */
    @Test
    public void TestPromotionFastestNetwork() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        FastestNetworkPromotionPage promotionsPage = PageFactory.initElements(driver, FastestNetworkPromotionPage.class);

        String promotionText = homePage.getFastestNetworkPromotionText();
        Assert.assertEquals(promotionText.toLowerCase().contains("we've doubled our coverage"), true);

        homePage.navigateToFastestNetworkPromotionPage();

        String headerText = promotionsPage.getPromotionText();
        Assert.assertEquals(headerText.trim(), "THE FASTEST, MOST ADVANCED LTE NETWORK");
    }

}