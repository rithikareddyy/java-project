// StringRotationCheckerTest.java
package functionalInterfaces;
import org.junit.Test;
import static org.junit.Assert.*;

public class RotationTest {

    @Test
    public void testAreRotations_WithRotatedStrings() {
        assertTrue(Rotation.areRotations("abcd", "dabc"));
        assertTrue(Rotation.areRotations("hello", "lohel"));
        assertTrue(Rotation.areRotations("12345", "45123"));
    }

    @Test
    public void testAreRotations_WithNonRotatedStrings() {
        assertFalse(Rotation.areRotations("abcde", "edcba"));
    }

    @Test
    public void testAreRotations_WithDifferentLengthStrings() {
        assertFalse(Rotation.areRotations("abc", "defg"));
    }
}

