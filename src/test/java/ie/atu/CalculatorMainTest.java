package ie.atu;


        import org.junit.jupiter.api.AfterEach;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class CalculatorMainTest{

    Add addTotal;
    Subtract subTotal;
    Multiply Mul;
    Divide Div;

    @BeforeEach
    void setUp() {
        addTotal = new Add();
        subTotal = new Subtract();
        Mul = new Multiply();
        Div = new Divide();
    }

    @Test
    void testAdd(){assertEquals(2,addTotal.add(1,1));}

    @Test
    void testSubtract(){assertEquals(0,subTotal.subtract(1,1));}

    @Test
    void testDivide(){assertEquals(1, Div.divide(1,1));}

    @Test
    void testMultiply(){assertEquals(0,Mul.multiply(0,3));}

    @AfterEach
    void tearDown() {
    }
}