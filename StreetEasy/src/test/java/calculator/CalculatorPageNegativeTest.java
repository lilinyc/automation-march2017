package calculator;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Lili on 5/23/2017.
 *
 * edge case testing to verify that the page doesn't break
 */
public class CalculatorPageNegativeTest extends CommonAPI {

    /**
     * enters all values as 0
     */
    @Test
    public void inputLimitTestPrice0() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CalculatorPage calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);

        calculatorPage.loadPage();
        calculatorPage.enterInputs("0", "0");
        calculatorPage.calculate();
        calculatorPage.verifyTotalOutput("0", "0", "0");
        calculatorPage.verifyMonthlyOutput("0", "0");
    }


    /**
     * enters more down payement than price - division by zero test
     */
    @Test
    public void negativeOutputTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CalculatorPage calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);

        calculatorPage.loadPage();
        calculatorPage.enterInputs("1000", "2000");
        calculatorPage.calculate();
        calculatorPage.verifyTotalOutput("-1000", "0", "0");
        calculatorPage.verifyMonthlyOutput("-5", "-5");
    }

    /**
     * extreme input test
     * mortgage rate 100%
     */
    @Test
    public void extremeInterestRateTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CalculatorPage calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);

        calculatorPage.loadPage();
        calculatorPage.enterInputs("10000", "0", "100");
        calculatorPage.calculate();
        calculatorPage.verifyTotalOutput("10000", "299999", "299999");
        calculatorPage.verifyMonthlyOutput("833", "833");
    }


    /**
     * extreme input test
     * enter values of 10^22 with 10000% interest rate and verifies that calculator can't calculate result
     */
    @Test
    public void extremelyLargeInputTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CalculatorPage calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);

        calculatorPage.loadPage();
        calculatorPage.enterInputs("10000000000000000000000", "0", "100000");
        calculatorPage.calculate();
        calculatorPage.verifyTotalOutput("10000000000000000000000", "Infinity", "299999999999999103761121280");
    }
}
