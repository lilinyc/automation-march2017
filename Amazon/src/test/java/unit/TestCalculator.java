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
        int total = calculator.addition(5,10);
        Assert.assertEquals(total, 15);
    }
}
