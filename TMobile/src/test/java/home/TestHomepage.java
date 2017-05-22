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
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CellPhonesPage cellPhonesPage = PageFactory.initElements(driver, CellPhonesPage.class);
        homePage.navigateToCellPhonesPage();
        String productName = cellPhonesPage.getFirstProductName();
        Assert.assertEquals(productName, "Samsung Galaxy S8");
    }

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

    @Test
    public void TestFooterContactInformation() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("Contact information");
        Assert.assertEquals(footerText, "Contact information");

        homePage.navigateToFooterPage("Contact information", ".pillbox_container");

        String headerText = getTextByCss(".container-fluid h2");
        Assert.assertEquals(headerText.trim(), "Contact Us");
    }


    @Test
    public void TestFooterCheckOrderStatus() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("Check order status");
        Assert.assertEquals(footerText, "Check order status");
        homePage.navigateToFooterPage("Check order status", ".container-fluid ");

        String headerText = getTextByCss("#page_title_left");
        Assert.assertEquals(headerText.trim(), "Order status");
    }

    @Test
    public void TestFooterReturnPolicy() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("View Return Policy");
        Assert.assertEquals(footerText, "View Return Policy");
        homePage.navigateToFooterPage("View Return Policy", "#body");

        String headerText = getTextByCss(".ftxt18");
        Assert.assertEquals(headerText.trim(), "RETURN POLICY");

    }

    @Test
    public void TestFooterRebate() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("Get a rebate");
        Assert.assertEquals(footerText, "Get a rebate");
        homePage.navigateToFooterPage("Get a rebate", ".pillbox");

        String headerText = getTextByCss(".container-fluid h2");
        Assert.assertEquals(headerText.trim(), "T-Mobile Promotions Center");
    }

    @Test
    public void TestFooterPageLocator() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("Find a store");
        Assert.assertEquals(footerText, "Find a store");
        homePage.navigateToFooterPage("Find a store", "#PageLocator");

        String headerText = getTextByCss("#PageLocator h2");
        Assert.assertEquals(headerText.trim(), "Store Locator");
    }

    @Test
    public void TestFooterTradeInProgram() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("Trade in program");
        Assert.assertEquals(footerText, "Trade in program");
        homePage.navigateToFooterPage("Trade in program", "#tradein_estimate_content");

        String headerText = getTextByCss("#tradein_estimate_content h1");
        Assert.assertEquals(headerText.trim(), "Get an estimate");
    }

    @Test
    public void TestFooterSupportHome() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("Support home");
        Assert.assertEquals(footerText, "Support home");
        homePage.navigateToFooterPage("Support home", ".content-large");

        String headerText = getTextByCss(".col-spacing h2");
        Assert.assertEquals(headerText.trim(), "ACCOUNT");
    }

    @Test
    public void TestFooterDeviceSupport() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("Device support");
        Assert.assertEquals(footerText, "Device support");
        homePage.navigateToFooterPage("Device support", ".cfArticle");

        String headerText = getTextByCss(".segmentNav h2");
        Assert.assertEquals(headerText.trim(), "Select a device");
    }

    @Test
    public void TestFooterQuestionsAboutYourBill() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("Questions about your bill");
        Assert.assertEquals(footerText, "Questions about your bill");
        homePage.navigateToFooterPage("Questions about your bill", ".j-page-header");

        String headerText = getTextByCss("#j-globalNav li:nth-child(1)");
        Assert.assertEquals(headerText.trim(), "Support");
    }

    @Test
    public void TestFooterPlansAndServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.scrollToFooter();

        String footerText = homePage.getFooterLinkText("Plans & services");
        Assert.assertEquals(footerText, "Plans & services");
        homePage.navigateToFooterPage("Plans & services", ".j-placeTitle");

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