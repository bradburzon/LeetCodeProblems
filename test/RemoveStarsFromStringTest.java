import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveStarsFromStringTest {

    private RemoveStarsFromString removeStarsFromString;

    @Before
    public void setUp() {
        removeStarsFromString = new RemoveStarsFromString();
    }

    @Test
    public void removeStars_NoStars_ReturnsOriginalString() {
        String input = "abcdef";

        String actual = removeStarsFromString.removeStars(input);

        assertEquals("abcdef", actual);
    }

    @Test
    public void removeStars_SingleStarAtEnd_RemovesLastChar() {
        String input = "abcde*";

        String actual = removeStarsFromString.removeStars(input);

        assertEquals("abcd", actual);
    }

    @Test
    public void removeStars_SingleStarAtStart_RemovesFirstChar() {
        String input = "*bcde";

        String actual = removeStarsFromString.removeStars(input);

        assertEquals("bcde", actual);
    }

    @Test
    public void removeStars_ConsecutiveStars_RemovesMultipleChars() {
        String input = "abc***f";

        String actual = removeStarsFromString.removeStars(input);

        assertEquals("f", actual);
    }

    @Test
    public void removeStars_StarsSpreadOut_RemovesCorrectChars() {
        String input = "a*bc*de**";

        String actual = removeStarsFromString.removeStars(input);

        assertEquals("b", actual);
    }

    @Test
    public void removeStars_AllStars_EmptyString() {
        String input = "******";

        String actual = removeStarsFromString.removeStars(input);

        assertEquals("", actual);
    }

    @Test
    public void removeStars_EmptyString_EmptyString() {
        String input = "";

        String actual = removeStarsFromString.removeStars(input);

        assertEquals("", actual);
    }

    @Test
    public void removeStars_StarsWithNoPrecedingChars_IgnoredStars() {
        String input = "***";

        String actual = removeStarsFromString.removeStars(input);

        assertEquals("", actual);
    }

    @Test
    public void removeStars_ComplexString_CorrectOutput() {
        String input = "he**l*lo";

        String actual = removeStarsFromString.removeStars(input);

        assertEquals("lo", actual);
    }
}