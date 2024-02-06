package exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringtoIntegerConverterTest {

    @Test
    public void testConvertStringToInt_ValidInteger() {
        String input = "23";
        int result = StringtoIntegerConverter.convertStringToInt(input);
        assertEquals(23, result);
    }

    @Test
    public void testConvertStringToInt_FloatNumber() {
        String input = "45.67";
        assertThrows(IllegalArgumentException.class, () ->
                StringtoIntegerConverter.convertStringToInt(input));
    }

    @Test
    public void testConvertStringToInt_NonNumericInput() {
        String input = "test";
        assertThrows(IllegalArgumentException.class, () ->
                StringtoIntegerConverter.convertStringToInt(input));
    }

    @Test
    public void testConvertStringToInt_MixedInput() {
        String input = "123f";
        assertThrows(IllegalArgumentException.class, () ->
                StringtoIntegerConverter.convertStringToInt(input));
    }

    @Test
    public void testConvertStringToInt_NullInput() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () ->
                StringtoIntegerConverter.convertStringToInt(input));
    }

    @Test
    public void testConvertStringToInt_EmptyInput() {
        String input = "";
        assertThrows(IllegalArgumentException.class, () ->
                StringtoIntegerConverter.convertStringToInt(input));
    }
}

