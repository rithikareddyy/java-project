package functionalInterfaces;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void Calculatesum() {
        int[] a = {1, 3, 5, 7, 9};
        assertEquals(25, ArraySum.Sum(a));

    }
    @Test
    public void Calculatesum1 ()
    {
        int[] a = {1, -3, 5, 7, -9};
        assertEquals(1, ArraySum.Sum(a));




    }


}
