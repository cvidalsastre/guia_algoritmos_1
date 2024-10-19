package test.java.calcuEJemplo;

import main.java.calcuEjemplo.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcuTest {

    Calcu Calcu = new Calcu();

    @Test
    void testAdd() {
        assertEquals(7, Calcu.add(3, 4), "3 + 4 should be 7");
    }

    @Test
    void testSubtract() {
        assertEquals(2, Calcu.subtract(5, 3), "5 - 3 should be 2");
    }

    @Test
    void testMultiply() {
        assertEquals(15, Calcu.multiply(3, 5), "3 * 5 should be 15");
    }

    @Test
    void testDivide() {
        assertEquals(2, Calcu.divide(10, 5), "10 / 5 should be 2");
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calcu.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
