package calculator;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import calculator.CalculatorPage;
import utility.reporting.TestLogger;

/**
 * Created by Lili on 5/22/2017.
 */
public class CalculatorPageTest extends CommonAPI {
    @Override
    public String Url() {
        return "http://streeteasy.com";
    }

    @Test
    public void LoadCalculatorPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CalculatorPage calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);

        calculatorPage.loadPage();
    }

    @Test
    public void TestSimpleInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CalculatorPage calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);

        calculatorPage.loadPage();
        calculatorPage.enterInputs("100000", "20000");
        calculatorPage.calculate();
        calculatorPage.verifyTotalOutput("80000", "57496", "137495");
        calculatorPage.verifyMonthlyOutput("382", "382");
    }

    @Test
    public void TestSimpleInputWithMaintanence() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CalculatorPage calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);

        calculatorPage.loadPage();
        calculatorPage.enterInputs("100000", "20000");
        calculatorPage.enterAdditionalInputs("100", "0");
        calculatorPage.calculate();
        calculatorPage.verifyTotalOutput("80000", "57496", "137495");
        calculatorPage.verifyMonthlyOutput("382", "482", "100");
    }

    @Test
    public void TestInputHalfDownPayment() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CalculatorPage calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);

        calculatorPage.loadPage();
        calculatorPage.enterInputs("100000", "50000");
        calculatorPage.calculate();
        calculatorPage.verifyTotalOutput("50000", "35934", "85936");
        calculatorPage.verifyMonthlyOutput("239", "239");
    }
}
