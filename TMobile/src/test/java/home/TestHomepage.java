package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by PIIT_NYA on 5/7/2017.
 */
public class TestHomepage extends CommonAPI {
    @Override
    public String Url() {
        return "https://www.t-mobile.com/";
    }

    @Test
    public void TestSerachBasic() {
        clickByCss(".lvl-one li:nth-child(2)");
        waitUntilVisible(By.cssSelector("product-grid"));
        String productName = getTextByCss(".product-name");
        Assert.assertEquals(productName, "Samsung Galaxy S8");
    }

    @Test
    public void TestPromotionSamsungGalaxy() {
        String promotionText = getTextByCss(".basicContent h2.small");
        Assert.assertEquals(promotionText.toLowerCase().contains("samsung"), true);
        clickByCss(".basicContent .cta a");
        waitUntilVisible(By.cssSelector("#productDescription"));
        String productName = getTextByCss("#productDescription h3");
        Assert.assertEquals(productName, "Samsung Galaxy S8");

    }

    @Test
    public void TestPromotionFastSwitchn() {
        String promotionText = getTextByCss(".content div:nth-child(4) p.copy");
        Assert.assertEquals(promotionText.toLowerCase().contains("switch"), true);
        scrollByCss(".content div:nth-child(4) .small");
        clickByCss(".content div:nth-child(4) .cta a");
        waitUntilVisible(By.cssSelector(".question-steps-progress"));
        String stepOneText = getTextByCss("div.step_1.active .question");
        Assert.assertEquals(stepOneText.trim(), "First, which device are you interested in?");
    }

    @Test
    public void TestPromotionFastestNetwork() {
        String promotionText = getTextByCss(".content div:nth-child(7) p.copy");
        Assert.assertEquals(promotionText.toLowerCase().contains("we've doubled our coverage"), true);
        scrollByCss(".content div:nth-child(7) .normal");
        clickByCss(".content div:nth-child(7) .cta a");
        sleepFor(2);
        waitUntilVisible(By.cssSelector("#testCustVid"));
        String headerText = getTextByCss("h2.normal");
        Assert.assertEquals(headerText.trim(), "THE FASTEST, MOST ADVANCED LTE NETWORK");
    }

    @Test
    public void TestFooterContactUs() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain a:nth-child(1)");
        Assert.assertEquals(footerText, "Contact information");
        clickByCss("#divfootermain a:nth-child(1)");

        waitUntilVisible(By.cssSelector(".pillbox_container "));
        String headerText = getTextByCss(".container-fluid h2");
        Assert.assertEquals(headerText.trim(), "Contact Us");
    }

    @Test
    public void TestFooterPromotions() {
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
    public void TestFooterPlansAndServices() {
        scrollByCss("#divfootermain");

        String footerText = getTextByCss("#divfootermain div:nth-of-type(2) span p:nth-child(4) a");
        Assert.assertEquals(footerText.toLowerCase(), "plans & services");
        clickByCss("#divfootermain div:nth-of-type(2) span p:nth-child(4) a");

        waitUntilVisible(By.cssSelector(".j-placeTitle"));
        String headerText = getTextByCss("h1.j-placeTitle");
        Assert.assertEquals(headerText.trim(), "Plans & services");
    }

}