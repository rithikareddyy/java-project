package functionalInterfaces;
import static org.junit.Assert.*;
import org.junit.Test;
public class SwappingTest {
        @Test
        public void testSwap(){
            int x = 200;
            int y = 300;
            Swapping.Swap(x,y);

            // Perform the swap
            assertEquals(300,x);
            assertEquals(200,y);

        }
    }

