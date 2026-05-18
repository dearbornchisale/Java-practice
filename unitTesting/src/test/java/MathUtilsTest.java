
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    @DisplayName("Factorial of 0 should be 1")
    public void testFactorialZero() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test
    @DisplayName("Factorial of -1 should throw exception")
    public void testIllegalArgumentException() {

        assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.factorial(-1);
        });
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 3, 5, 7, 11, 13, 17, 19 })
    @DisplayName("Should return true from prime numbers")
    public void testPrimeNumbers(int number) {
        assertTrue(MathUtils.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { -2, -1, 0, 1 })
    @DisplayName("Should return false if number less than 2")
    public void testNumberLessThanTwo(int number) {
        assertFalse(MathUtils.isPrime(number));
    }

    @Test
    @DisplayName("Should return the GCD ")
    public void testGCDDifferentNumbers(){
        assertEquals(4, MathUtils.gcd(20, 8));
    }

    @Test
    @DisplayName("Should return the GCD ")
    public void testGCDSameNumbers(){
        assertEquals(5, MathUtils.gcd(5,5));
    }

    @Test
    @DisplayName("Should return the GCD ")
    public void testGCDWithOne(){
        assertEquals(1, MathUtils.gcd(7, 3));
    }

    @Test
    @DisplayName("Negative number should throw an exception")
    public void testThrowIllegalArgumentException() {

        assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.fibonacci(-1);
        });
    }

    @Test
    @DisplayName("Should return the nth Fibonacci number")
    public void testFibonacci(){
        assertEquals(0, MathUtils.fibonacci(0));
        assertEquals(1, MathUtils.fibonacci(1));
        assertEquals(1, MathUtils.fibonacci(2));
        assertEquals(2, MathUtils.fibonacci(3));
        assertEquals(3, MathUtils.fibonacci(4));
        assertEquals(5, MathUtils.fibonacci(5));

    }


}
