import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator myTotal;
    Multiply Mul;
    Divide Div;

    @BeforeEach
    void setUp() {
        Mul = new Multiply();
        Div = new Divide();
    }

    @Test
    void testAdd(){assertEquals(2,myTotal.add(1,1));}

    @Test
    void testSubtract(){assertEquals(0,myTotal.subtract(1,1));}

    @Test
    void testDivide(){assertEquals(1, Div.divide(1,1));}

    @Test
    void testMultiply(){assertEquals(0,Mul.multiply(0,3));}

    @AfterEach
    void tearDown() {
    }
}
