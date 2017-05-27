package cellphones;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utility.reporting.TestLogger;

import java.io.IOException;

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


    /**
     * Same test as in Test Home page but uses input from excel file
     *
     * Loads excel file
     * For each row
     * searches for item
     * clicks on first result
     * verifies that the open product page is the searched item
     *
     * @throws IOException
     * @throws InterruptedException
     */
    public void getSearchDataFromExcelFileAndSearch() throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //Create instance of Excel file reader class
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();

        //Read data from Excel File.
        String[][] values = itemsToBeSearched.getSearchDataFromExcelFile();
        //Running for each loop
        for (int i = 1; i < values.length; i++) {
            searchForPhone(values[i][0]);
            clickOnFirstResult();
            verifyProductName(values[i][1]);
            sleepFor(2);
            searchInput.clear();
        }
    }
}
