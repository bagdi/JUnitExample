package Test;

import org.junit.*;
import general.Calculator;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestCalculator {

    public Calculator calculator;

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout timeout = new Timeout(1000);

    @Before
    public void runTest() {
        calculator = new Calculator();
    }

    @Test
    public void testPlus() {
        double res = calculator.plus(2, 3);
        Assert.assertTrue(res == 5);
    }

    @Test
    public void testMinus() {
        double res = calculator.minus(6, 2);
        Assert.assertFalse(res == 2);
    }

    @Ignore
    @Test
    public void testMultiply() {
        double res = calculator.multiply(2, 3);
        Assert.assertTrue(res == 6);
    }

    @Test
    public void testDim() {
        double res = calculator.dim(6, 2);
        Assert.assertTrue(res == 3);
    }

    @Test(expected = ArithmeticException.class)
    public void testDimException() {
        double res = calculator.dim(6, 0);
    }

    @Test(timeout = 1000)
    public void testDimTimeout() {
        double res = calculator.dim(6, 2);
    }

    @Test
    public void testDimRuleException() {
        double res = calculator.dim(6, 0);
        expectedException.expect(ArithmeticException.class);
    }

    @Test
    public void testDimRuleTimeout() {
        double res = calculator.dim(6, 2);
    }
}
