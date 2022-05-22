import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import hello.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void initBeforeClass() {
        System.out.println("this is before class");
    }

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


     @Test()
     public void test_Multiply_With_Zero() {
         assertEquals(0, calculator.multiply(0, 5));
     }





     //test for the exceptions
     //fails if the method does not throw the exception
     //testing divide function in case of arithmetic exception
     @Test(expected = ArithmeticException.class)
     public void test_ArithmeticDivisionException() {

        int a=5;
        int b=0;
        calculator.divide(a,b);
     } 


     //test for the timeout
     //fails if the method takes longer then the mentioned time
     @Test(timeout = 1000)
     public void test_timeout_Computations(){
         int sum=0;
         for (int i = 0; i < 1000000; i++) {
             sum+=i;
         }
     }


     //test division method
     
     @Test
     public void test_divisionRoundFigure() {
        //  assertEquals(5, calculator.divide(10, 2));
        
         assertEquals(5, calculator.divide(10, 2),0.0);
     }

     //test for not round figure
     //here you can see delta is the number which is extra to the particlar division
     @Test
     public void test_NotRoundFigure() {
         assertEquals(5, calculator.divide(11,2), 0.5);
     }

     @AfterClass
     public static  void destroyAfterClass() {
         System.out.println("After class ends this will run");
     }


    
}
