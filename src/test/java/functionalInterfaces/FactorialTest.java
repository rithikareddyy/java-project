package functionalInterfaces;
import static org.junit.Assert.*;


import org.junit.Test;



public class FactorialTest {
    @Test
    public void testfactorial(){

        assertEquals(120,Factorial.FindFactorial(5));
        assertEquals(1,Factorial.FindFactorial(0));
        assertEquals(720,Factorial.FindFactorial(6));


    }
}
