import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPercentageTest {
    StringPercentage stringPercentage;

    @Before
    public void setUp() {
        stringPercentage = new StringPercentage();
    }

    @Test
    public void percentageLetter_ZeroMatch_ReturnZero() {
        String string = "Hello";
        char letter = 'c';

        int actual = stringPercentage.percentageLetter(string, letter);

        assertEquals(0, actual);
    }

    @Test
    public void percentageLetter_HalfMatch_ReturnFifty() {
        String string = "Jull";
        char letter = 'l';

        int actual = stringPercentage.percentageLetter(string, letter);

        assertEquals(50, actual);
    }

    @Test
    public void percentageLetter_ThirdMatch_ReturnThirtyThree() {
        String string = "Jullpo";
        char letter = 'l';

        int actual = stringPercentage.percentageLetter(string, letter);

        assertEquals(33, actual);
    }

    @Test
    public void percentageLetter_SixthMatch_ReturnSixteen() {
        String string = "oherty";
        char letter = 'o';

        int actual = stringPercentage.percentageLetter(string, letter);

        assertEquals(16, actual);
    }
}