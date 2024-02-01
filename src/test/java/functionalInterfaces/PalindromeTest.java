package functionalInterfaces;
import static org.junit.Assert.*;
import org.junit.Test;


public class PalindromeTest {

    @Test
    public void testPalindrome(){
        assertTrue(Palindrome.isPalindrome(121));
        assertTrue(Palindrome.isPalindrome(787));
        assertFalse(Palindrome.isPalindrome(8543));

    }
}

