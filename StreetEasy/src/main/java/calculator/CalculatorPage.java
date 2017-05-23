package calculator;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utility.reporting.TestLogger;

/**
 * Created by Lili on 5/22/2017.
 */
public class CalculatorPage extends CommonAPI {
    private static final String calculatorButtonSelector = "#calulate_button";
    private static final String calculatorPageUrl = "https://streeteasy.com/nyc/calculator";

    @FindBy(how = How.CSS, using = "#calculator_price")
    public static WebElement propertyPriceInput;

    @FindBy(how = How.CSS, using = "#calculator_down_payment_amount")
    public static WebElement downPaymentInput;

    @FindBy(how = How.CSS, using = "#mortgage_rate_input")
    public static WebElement mortgageRateInput;


    @FindBy(how = How.CSS, using = "#calculator_maintenance")
    public static WebElement maintenanceInput;

    @FindBy(how = How.CSS, using = "#calculator_property_tax")
    public static WebElement propertyTaxInput;

    @FindBy(how = How.CSS, using = "#calulate_button")
    public static WebElement calculateButton;

    @FindBy(how = How.CSS, using = "#loan_amount")
    public static WebElement loanAmountResultLabel;

    @FindBy(how = How.CSS, using = "#total_interest_payment")
    public static WebElement totalInterestResultLabel;

    @FindBy(how = How.CSS, using = "#total_payment")
    public static WebElement totalPaymentResultLabel;

    @FindBy(how = How.CSS, using = "#monthly_principal_and_interest_payment")
    public static WebElement monthlyPrincipalPaymentResultLabel;

    @FindBy(how = How.CSS, using = "#total_monthly_payment")
    public static WebElement totalMonthlyPaymentResultLabel;

    @FindBy(how = How.CSS, using = "#maintenance_fee")
    public static WebElement maintenanceFeeResultLabel;


    public void loadPage() {
        driver.get(calculatorPageUrl);
    }

    public void enterInputs(String price, String downPayment) {
        enterInputs(price, downPayment, "4");
    }

    public void enterInputs(String price, String downPayment, String mortgageRate) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        propertyPriceInput.clear();
        propertyPriceInput.sendKeys(price);
        downPaymentInput.clear();
        downPaymentInput.sendKeys(downPayment);
        mortgageRateInput.clear();
        mortgageRateInput.sendKeys(mortgageRate, Keys.ENTER);
        sleepFor(2);
    }

    public void enterAdditionalInputs(String maintenance, String propertyTax) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(calculatorButtonSelector);
        maintenanceInput.clear();
        maintenanceInput.sendKeys(maintenance);
        propertyTaxInput.clear();
        propertyTaxInput.sendKeys(propertyTax);
        sleepFor(2);
    }

    public String getValueFromInput(WebElement element) {
        return element.getText().replace("$", "").replaceAll(",", "");
    }

    public void verifyTotalOutput(String loanAmount, String totalInterest, String totalPayment) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getValueFromInput(loanAmountResultLabel), loanAmount);
        Assert.assertEquals(getValueFromInput(totalInterestResultLabel), totalInterest);
        Assert.assertEquals(getValueFromInput(totalPaymentResultLabel), totalPayment);
    }

    public void verifyMonthlyOutput(String monthlyPrincipal, String totalMonthlyPayment) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getValueFromInput(monthlyPrincipalPaymentResultLabel), monthlyPrincipal);
        Assert.assertEquals(getValueFromInput(totalMonthlyPaymentResultLabel), totalMonthlyPayment);
    }

    public void verifyMonthlyOutput(String monthlyPrincipal, String totalMonthlyPayment, String maintenanceFee) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        verifyMonthlyOutput(monthlyPrincipal, totalMonthlyPayment);
        Assert.assertEquals(getValueFromInput(maintenanceFeeResultLabel).replaceAll("monthly", "").trim(), maintenanceFee);
    }

    public void calculate() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        calculateButton.click();
        sleepFor(2);
        waitUntilClickAble(calculatorButtonSelector);
    }
}
