package unit;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by PIIT_NYA on 5/6/2017.
 */
public class TestCalculator {
    @Test
    public void TestAddition() {
        Calculator calculator = new Calculator();
        int total = calculator.addition(5, 10);
        Assert.assertEquals(total, 15);
    }

    @Test
    public void TestSubtraction() {
        Calculator calculator = new Calculator();
        int total = calculator.subtraction(10, 5);
        Assert.assertEquals(total, 5);
    }

    @Test
    public void TestMultiplication() {
        Calculator calculator = new Calculator();
        int total = calculator.multiplication(5, 10);
        Assert.assertEquals(total, 50);
    }

    @Test
    public void TestDivision() {
        Calculator calculator = new Calculator();
        double total = calculator.division(10, 2);
        Assert.assertEquals(total, 5.0, 0);
    }

    @Test
    public void TestPower() {
        Calculator calculator = new Calculator();
        double total = calculator.power(5, 3);
        Assert.assertEquals(total, 125.0, 0);
    }

}
