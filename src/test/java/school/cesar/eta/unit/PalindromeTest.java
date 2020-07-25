package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    public void palindrome_singleLetter_true(){
        boolean result = Palindrome.check("a");
        Assertions.assertTrue(result);
    }
    @Test
    public void palindrome_notPalindromeWord_false(){
        boolean result = Palindrome.check("ab");
        Assertions.assertFalse(result);
    }
    @Test
    public void palindrome_notPalindromeWord_true(){
        boolean result = Palindrome.check("renner");
        Assertions.assertTrue(result);
    }
}
