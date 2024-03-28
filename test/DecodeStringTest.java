import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecodeStringTest {

    private DecodeString decodeString;

    @Before
    public void setup() {
        decodeString = new DecodeString();
    }

    @Test
    public void decodeString_OneDigitAndOneString_ReturnStringRepeatingBasedOnDigit() {
        String encoded = "3[a]";

        String actual = decodeString.decodeString(encoded);

        assertEquals("aaa", actual);
    }

    @Test
    public void decodeString_MultipleDigitsAndOneString_ReturnStringRepeatingBasedOnDigits() {
        String encoded = "10[b]";

        String actual = decodeString.decodeString(encoded);

        assertEquals("bbbbbbbbbb", actual);
    }

    @Test
    public void decodeString_OneDigitAndMultipleStrings_ReturnConcatenatedStringRepeatingBasedOnDigit() {
        String encoded = "2[ab]";

        String actual = decodeString.decodeString(encoded);

        assertEquals("abab", actual);
    }

    @Test
    public void decodeString_NestedEncodedStrings_ReturnDecodedString() {
        String encoded = "2[a2[b]]";

        String actual = decodeString.decodeString(encoded);

        assertEquals("abbabb", actual);
    }

    @Test
    public void decodeString_EmptyString_ReturnEmptyString() {
        String encoded = "";

        String actual = decodeString.decodeString(encoded);

        assertEquals("", actual);
    }

    @Test
    public void decodeString_StringWithoutEncoding_ReturnOriginalString() {
        String encoded = "abc";

        String actual = decodeString.decodeString(encoded);

        assertEquals("abc", actual);
    }

    @Test
    public void decodeString_ComplexNestedEncodedStrings_ReturnDecodedString() {
        String encoded = "3[a2[c]]";

        String actual = decodeString.decodeString(encoded);

        assertEquals("accaccacc", actual);
    }

    @Test
    public void decodeString_EncodedStringWithDigitsInside_ReturnDecodedString() {
        String encoded = "2[3[a]b]";
        String actual = decodeString.decodeString(encoded);
        assertEquals("aaabaaab", actual);
    }
}