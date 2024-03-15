import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxVowelSubStringOccurrenceTest {

    private MaxVowelSubStringOccurrence maxVowelSubStringOccurrence;

    @Before
    public void setup() {
        maxVowelSubStringOccurrence = new MaxVowelSubStringOccurrence();
    }

    @Test
    public void maxVowels_EmptyString_ReturnZero() {
        String s = "";
        int k = 1;

        int actual = maxVowelSubStringOccurrence.maxVowels(s, k);

        assertEquals(0, actual);
    }

    @Test
    public void maxVowels_AllVowels_ReturnK() {
        String s = "aeiou";
        int k = 3;

        int actual = maxVowelSubStringOccurrence.maxVowels(s, k);

        assertEquals(3, actual);
    }

    @Test
    public void maxVowels_NoVowels_ReturnZero() {
        String s = "bcdfg";
        int k = 3;

        int actual = maxVowelSubStringOccurrence.maxVowels(s, k);

        assertEquals(0, actual);
    }

    @Test
    public void maxVowels_MixedCharacters_ReturnMaxVowelsInK() {
        String s = "azerdii";
        int k = 3;

        int actual = maxVowelSubStringOccurrence.maxVowels(s, k);

        assertEquals(2, actual);
    }

    @Test
    public void maxVowels_StringShorterThanK_ReturnAllVowelsCount() {
        String s = "aei";
        int k = 5;

        int actual = maxVowelSubStringOccurrence.maxVowels(s, k);

        assertEquals(3, actual);
    }
}