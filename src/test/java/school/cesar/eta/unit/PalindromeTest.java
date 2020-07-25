package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    private Palindrome palindrome;
    @BeforeEach
        public void setupTest(){
            palindrome = new Palindrome();
    }

    @Test
    public void palindrome_singleLetter_true(){
        boolean result = palindrome.check("a");
        Assertions.assertTrue(result);
    }
    @Test
    public void palindrome_PalindromeWord_false(){
        boolean result = palindrome.check("ab");
        Assertions.assertFalse(result);
    }
    @Test
    public void palindrome_PalindromeWord_true(){
        boolean result = palindrome.check("renner");
        Assertions.assertTrue(result);
    }
}
