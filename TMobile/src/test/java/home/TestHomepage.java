package home;

import base.CommonAPI;
import cellphones.CellPhonesPage;
import homepage.HomePage;
import switchCarrier.SwitchCarrierPage;
import promotions.FastestNetworkPromotionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by PIIT_NYA on 5/7/2017.
 */
public class TestHomepage extends CommonAPI {
    @Override
    public String Url() {
        return "https://www.t-mobile.com/";
    }

    @Test
    public void TestSearchBasic() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);
        homePage.navigateToCellPhonesPage();
        String productName = cellPhonesPage.getFirstProductName();
        Assert.assertEquals(productName, "Samsung Galaxy S8");
    }

    @Test
    public void TestPromotionSamsungGalaxy() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);

        String promotionText = homePage.getPromotionName();
        Assert.assertEquals(promotionText.toLowerCase().contains("samsung"), true);
        homePage.navigateToSamsungPromotion();

        String productName = cellPhonesPage.getCellPhoneDescription();
        Assert.assertEquals(productName, "Samsung Galaxy S8");
    }

    @Test
    public void TestPromotionFastSwitch() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SwitchCarrierPage switchCarrierPage = PageFactory.initElements(driver, SwitchCarrierPage.class);

        String promotionText = homePage.getSwitchCarrierPromotionText();
        Assert.assertEquals(promotionText.toLowerCase().contains("switch"), true);

        homePage.navigateToSwitchCarrier();

        String stepOneText = switchCarrierPage.getQuestionOneText();
        Assert.assertEquals(stepOneText.trim(), "First, which device are you interested in?");
    }

    @Test
    public void TestPromotionFastestNetwork() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        FastestNetworkPromotionPage promotionsPage = PageFactory.initElements(driver, FastestNetworkPromotionPage.class);

        String promotionText = homePage.getFastestNetworkPromotionText();
        Assert.assertEquals(promotionText.toLowerCase().contains("we've doubled our coverage"), true);

        homePage.navigateToFastestNetworkPromotionPage();

        String headerText = promotionsPage.getPromotionText();
        Assert.assertEquals(headerText.trim(), "THE FASTEST, MOST ADVANCED LTE NETWORK");
    }

    @Test
    public void TestFooterContactInformation() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain a:nth-child(1)");
        Assert.assertEquals(footerText, "Contact information");
        clickByCss("#divfootermain a:nth-child(1)");

        waitUntilVisible(By.cssSelector(".pillbox_container "));
        String headerText = getTextByCss(".container-fluid h2");
        Assert.assertEquals(headerText.trim(), "Contact Us");
    }


    @Test
    public void TestFooterCheckOrderStatus(){
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain span p:nth-child(2) a");
        Assert.assertEquals(footerText, "Check order status");
        clickByCss("#divfootermain span p:nth-child(2) a");

        waitUntilVisible(By.cssSelector(".container-fluid "));
        String headerText = getTextByCss("#page_title_left");
        Assert.assertEquals(headerText.trim(), "Order status");
        }

    @Test
    public void TestFooterReturnPolicy (){
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain span p:nth-child(3) a");
        Assert.assertEquals(footerText, "View Return Policy");
        clickByCss("#divfootermain span p:nth-child(3) a");

        waitUntilVisible(By.cssSelector("#body"));
        String headerText = getTextByCss(".ftxt18");
        Assert.assertEquals(headerText.trim(), "RETURN POLICY");

    }

    @Test
    public void TestFooterRebate() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain span p:nth-child(4) a");
        Assert.assertEquals(footerText, "Get a rebate");
        clickByCss("#divfootermain span p:nth-child(4) a");

        waitUntilVisible(By.cssSelector(".pillbox"));
        String headerText = getTextByCss(".container-fluid h2");
        Assert.assertEquals(headerText.trim(), "T-Mobile Promotions Center");
    }

    @Test
    public void TestFooterPageLocator() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain span p:nth-child(5) a");
        Assert.assertEquals(footerText, "Find a store");
        clickByCss("#divfootermain span p:nth-child(5) a");

        waitUntilVisible(By.cssSelector("#PageLocator"));
        String headerText = getTextByCss("#PageLocator h2");
        Assert.assertEquals(headerText.trim(), "Store Locator");
    }

    @Test
    public void TestFooterTradeInProgram() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain span p:nth-child(6) a");
        Assert.assertEquals(footerText, "Trade in program");
        clickByCss("#divfootermain span p:nth-child(6) a");

        waitUntilVisible(By.cssSelector("#tradein_estimate_content"));
        String headerText = getTextByCss("#tradein_estimate_content h1");
        Assert.assertEquals(headerText.trim(), "Get an estimate");
    }

    @Test
    public void TestFooterSupportHome() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain div:nth-of-type(2) span p:nth-child(1) a");
        Assert.assertEquals(footerText, "Support home");
        clickByCss("#divfootermain div:nth-of-type(2) span p:nth-child(1) a");

        waitUntilVisible(By.cssSelector(".content-large"));
        String headerText = getTextByCss(".col-spacing h2");
        Assert.assertEquals(headerText.trim(), "ACCOUNT");
    }

    @Test
    public void TestFooterDeviceSupport() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain div:nth-of-type(2) span p:nth-child(2) a");
        Assert.assertEquals(footerText.toLowerCase(), "device support");
        clickByCss("#divfootermain div:nth-of-type(2) span p:nth-child(2) a");

        waitUntilVisible(By.cssSelector(".cfArticle"));
        String headerText = getTextByCss(".segmentNav h2");
        Assert.assertEquals(headerText.trim(), "Select a device");
    }

  @Test
    public void TestFooterQuestionsAboutYourBill() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain div:nth-of-type(2) span p:nth-child(3) a");
        Assert.assertEquals(footerText.toLowerCase(), "questions about your bill");
        clickByCss("#divfootermain div:nth-of-type(2) span p:nth-child(3) a");

        waitUntilVisible(By.cssSelector(".j-page-header"));
        String headerText = getTextByCss("#j-globalNav li:nth-child(1)");
        Assert.assertEquals(headerText.trim(), "Support");
    }

    @Test
    public void TestFooterPlansAndServices() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain div:nth-of-type(2) span p:nth-child(4) a");
        Assert.assertEquals(footerText.toLowerCase(), "plans & services");
        clickByCss("#divfootermain div:nth-of-type(2) span p:nth-child(4) a");

        waitUntilVisible(By.cssSelector(".j-placeTitle"));
        String headerText = getTextByCss("h1.j-placeTitle");
        Assert.assertEquals(headerText.trim(), "Plans & services");
    }

    @Test
    public void TestFooterActivatePrepaid() {
        //nth5
    }

    @Test
    public void TestFooterRefillPrepaid() {
        //nth6
    }

    @Test
    public void TestFooterInternational() {
        //nth7
    }
}