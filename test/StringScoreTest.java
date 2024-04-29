import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringScoreTest {
    StringScore stringScore;

    @Before
    public void setUp() {
        stringScore = new StringScore();
    }

    @Test
    public void scoreOfString_TwoSameLetter_ReturnZero() {
        String string = "ss";

        int actual = stringScore.scoreOfString(string);

        assertEquals(0, actual);
    }

    @Test
    public void scoreOfString_LongStringWithSameLetter_ReturnZero() {
        String string = "zzzzzzzzzzzz";

        int actual = stringScore.scoreOfString(string);

        assertEquals(0, actual);
    }

    @Test
    public void scoreOfString_LongStringWithDifferentLetter_ReturnCorrectScore() {
        String string = "hello from the future";

        int actual = stringScore.scoreOfString(string);

        assertEquals(527, actual);
    }
}