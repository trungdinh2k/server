import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOSECARLOS
 */
public class CalcTest {

    public CalcTest() {
    }

    /**
     * Test of add method, of class Calc.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = Calc.add(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 3;
        int b = 2;
        int expResult = 1;
        int result = Calc.subtract(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSubtractNegatives() {
        System.out.println("subtract negatives");
        int a = -3;
        int b = 2;
        int expResult = -5;
        int result = Calc.subtract(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 3;
        int b = 2;
        int expResult = 6;
        int result = Calc.multiply(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 10;
        int b = 2;
        double expResult = 5;
        double result = Calc.divide(a, b);
        assertEquals(expResult, result, 1);
    }

    @Test
    public void testDivideNonInteger() {
        System.out.println("divide non integer");
        int a = 5;
        int b = 2;
        double expResult = 5/2;
        double result = Calc.divide(a, b);
        assertEquals(expResult, result, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideZero() {
        System.out.println("divide by zero");
        int a = 10;
        int b = 0;
        double result = Calc.divide(a, b);
    }
}
