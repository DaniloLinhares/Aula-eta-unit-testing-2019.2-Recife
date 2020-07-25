package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    @Test
    public void checkYear_leapYearMult400_true(){
        int year = 2000;
        boolean result = LeapYear.checkYear(year);
        Assertions.assertTrue(result);
    }

    @Test
    public void checkYear_leapYearMult4_true(){
        int year = 2020;
        boolean result = LeapYear.checkYear(year);
        Assertions.assertTrue(result);
    }
    @Test
    public void checkYear_leapYearMult4e100_false(){
        int year = 100;
        boolean result = LeapYear.checkYear(year);
        Assertions.assertFalse(result);
    }

    @Test
    public void checkYear_nonLeapYear_false(){
        int year = 2014;
        boolean result = LeapYear.checkYear(year);
        Assertions.assertFalse(result);
    }
}
