import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hello.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator=new Calculator();
    }


    @Test
    public void test_PostiveNumber_Multiplication() {

        int answer=calculator.multiply(5, 7);
        
        assertEquals("multiply postitive number",35,answer);


    }


    @Test
   public void test_Two_NegativeValues_Multiplication() {
        assertEquals(35, calculator.multiply(-5,-7));
    }


    @Test
    public void test_OnePostivie_And_OneNegative_Multiplication() {
         assertEquals(-35, calculator.multiply(5,-7));
     }



    
}
