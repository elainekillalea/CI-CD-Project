import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator myTotal;

    @BeforeEach
    void setUp() {
        myTotal = new Calculator();
    }

    @Test
    void testAdd(){assertEquals(2,myTotal.add(1,1));}

    @Test
    void testSubtract(){assertEquals(0,myTotal.subtract(1,1));}

    @Test
    void testDivide(){assertEquals(1,myTotal.divide(1,1));}

    @Test
    void testMultiply(){assertEquals(0,myTotal.multiply(0,3));}

    @AfterEach
    void tearDown() {
    }
}
