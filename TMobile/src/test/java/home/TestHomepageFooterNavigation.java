package home;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

public class TestHomepageFooterNavigation extends CommonAPI {
    @Override
    public String Url() {
        return "https://www.t-mobile.com/";
    }

    /**
     * Footer navigation test - contact information
     * clicks on link and verifies that contact information page opened
     */
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

    /**
     * Footer navigation test - order status
     * clicks on link and verifies that order page opened
     */
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

    /**
     * Footer navigation test - return policy
     * clicks on link and verifies that return policy page opened
     */
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


    /**
     * Footer navigation test - rebate
     * clicks on link and verifies that rebate page opened
     */
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


    /**
     * Footer navigation test - page locator
     * clicks on link and verifies that page locator page opened
     */
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


    /**
     * Footer navigation test - trade in program
     * clicks on link and verifies that trade in program  page opened
     */
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


    /**
     * Footer navigation test - support page
     * clicks on link and verifies that support page opened
     */
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

    /**
     * Footer navigation test - device support
     * clicks on link and verifies that  device support page opened
     */
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


    /**
     * Footer navigation test - question about bill
     * clicks on link and verifies that question about bill page opened
     */
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

    /**
     * Footer navigation test - plans and services
     * clicks on link and verifies that plans and services page opened
     */
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
}
