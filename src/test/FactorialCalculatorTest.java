// FactorialCalculatorTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertEquals(1, calculator.calculate(0));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertEquals(120, calculator.calculate(5)); // 5! = 120
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        calculator.calculate(-5);
    }
}
