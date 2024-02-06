package loopconditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz_DivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void testFizzBuzz_DivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testFizzBuzz_DivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }
}
