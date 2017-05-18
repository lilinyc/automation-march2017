package homepage;

import base.CommonAPI;
import cellphones.CellPhonesPage;
import promotions.FastestNetworkPromotionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import switchCarrier.SwitchCarrierPage;
import utility.reporting.TestLogger;

/**
 * Created by Lili on 5/17/2017.
 */
public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using = ".lvl-one li:nth-child(2)")
    public static WebElement cellPhoneLink;

    @FindBy(how = How.CSS, using = ".basicContent h2.small")
    public static WebElement promotionNameElement;

    @FindBy(how = How.CSS, using = ".basicContent .cta a")
    public static WebElement promotionLinkElement;

    @FindBy(how = How.CSS, using = ".content div:nth-child(4) .small")
    public static WebElement switchCarrierContainerElement;

    @FindBy(how = How.CSS, using = ".content div:nth-child(4) .cta a")
    public static WebElement switchCarrierLinkElement;

    @FindBy(how = How.CSS, using = ".content div:nth-child(6) p.copy")
    public static WebElement fastestNetworkPromotionTextElement;

    @FindBy(how = How.CSS, using = ".content div:nth-child(6) .normal")
    public static WebElement fastestNetworkPromotionContainerElement;

    @FindBy(how = How.CSS, using = ".content div:nth-child(6) .cta a")
    public static WebElement fastestNetworkPromotionLinkElement;

    public void navigateToCellPhonesPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cellPhoneLink.click();
        waitUntilVisible(CellPhonesPage.productGridSelector);
    }

    public String getPromotionName() {
        return promotionNameElement.getText();
    }

    public void navigateToSamsungPromotion() {
        cellPhoneLink.click();
        promotionLinkElement.click();
        waitUntilVisible(CellPhonesPage.productContainerSelector);
    }

    public String getSwitchCarrierPromotionText() {
        return getTextByCss(".content div:nth-child(4) p.copy");
    }

    public void navigateToSwitchCarrier() {
        scrollByCss(switchCarrierContainerElement);
        switchCarrierLinkElement.click();
        waitUntilVisible(SwitchCarrierPage.questionProgressSelector);
    }

    public String getFastestNetworkPromotionText() {
        return fastestNetworkPromotionTextElement.getText();
    }

    public void navigateToFastestNetworkPromotionPage() {
        scrollByCss(fastestNetworkPromotionContainerElement);
        fastestNetworkPromotionLinkElement.click();
        sleepFor(2);
        waitUntilVisible(FastestNetworkPromotionPage.videoContainerSelector);
    }
}
