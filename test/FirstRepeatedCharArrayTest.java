import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstRepeatedCharArrayTest {
    FirstRepeatedCharArray firstRepeatedCharArray;

    @Before
    public void setUp() {
        firstRepeatedCharArray = new FirstRepeatedCharArray();
    }

    @Test(expected = RuntimeException.class)
    public void repeatedChar_StringWithLessThanTwoLetters_ThrowException() {
        String string = "a";

        firstRepeatedCharArray.repeatedChar(string);
    }

    @Test
    public void repeatedChar_StringWithOnlyOneUniqueChar_ReturnChar() {
        String string = "aaa";

        char actual = firstRepeatedCharArray.repeatedChar(string);

        assertEquals('a', actual);
    }

    @Test
    public void repeatedChar_MixedString_ReturnCorrectChar() {
        String string = "abdccdo";

        char actual = firstRepeatedCharArray.repeatedChar(string);

        assertEquals('c', actual);
    }

    @Test
    public void repeatedChar_LongerMixedString_ReturnCorrectChar() {
        String string = "ydfpnbiwvlqxydfpnbiwvlqxteoszcujmrkagh\nh\n";

        char actual = firstRepeatedCharArray.repeatedChar(string);

        assertEquals('y', actual);
    }
}