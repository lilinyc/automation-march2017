package cellphones;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utility.reporting.TestLogger;

/**
 * Created by Lili on 5/17/2017.
 */
public class CellPhonesPage extends CommonAPI {
    public static final String productContainerSelector = "#productDescription";
    public static final String productGridSelector = "product-grid";
    public static final String resultsContainerSelector = ".resultsContainer";

    @FindBy(how = How.CSS, using = ".product-name")
    public static WebElement firstProductElement;

    @FindBy(how = How.CSS, using = "#productDescription h3")
    public static WebElement cellPhoneDescriptionElement;

    @FindBy(how = How.CSS, using = "#subnav-search-key")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = ".resultsContainer a")
    public static WebElement firstPhone;

    public String getFirstProductName() {
        return firstProductElement.getText();
    }

    public String getCellPhoneDescription() {
        return cellPhoneDescriptionElement.getText();
    }

    public void searchForPhone(String item) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchInput.sendKeys(item, Keys.ENTER);
        waitUntilVisible(resultsContainerSelector);
    }

    public void clickOnFirstResult() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPhone.click();
        waitUntilVisible(productContainerSelector);
    }

    public void verifyProductName(String searchedItem) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String productName = getCellPhoneDescription();
        Assert.assertEquals(productName, searchedItem);
    }
}
