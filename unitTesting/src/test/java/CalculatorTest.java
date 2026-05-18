

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();

        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-1, 1));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();

        assertEquals(2, calc.subtract(5, 3));
        assertEquals(-1, calc.subtract(2, 3));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();

        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(0, 10));
    }
}
