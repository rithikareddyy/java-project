package loopconditions;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FibonacciSeriesTest {

    @Test
    public void testPrintFibonacciSeries_N5() {
        int n = 5;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        FibonacciSeries.printFibonacciSeries(n);
        assertEquals("0 1 1 2 3 ", outContent.toString());
    }

    @Test
    public void testPrintFibonacciSeries_N10() {
        int n = 10;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        FibonacciSeries.printFibonacciSeries(n);
        assertEquals("0 1 1 2 3 5 8 13 21 34 ", outContent.toString());
    }
}

