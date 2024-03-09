import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsSubsequenceTest {

    IsSubsequence isSubsequence;

    @Before
    public void setUp() {
        isSubsequence = new IsSubsequence();
    }

    @Test
    public void IsSubsequence_EmptySubSequence_ReturnTrue() {
        String search = "sample";
        String subSequence = "";

        boolean actual = isSubsequence.isSubsequence(subSequence, search);

        assertTrue(actual);
    }

    @Test
    public void IsSubsequence_SubsequenceLongerThanSearch_ReturnFalse() {
        String search = "s";
        String subSequence = "long";

        boolean actual = isSubsequence.isSubsequence(subSequence, search);

        assertFalse(actual);
    }

    @Test
    public void IsSubsequence_EqualLengthString_ReturnTrueIfStringMatch() {
        String search = "sample";
        String subSequence = "sample";

        boolean actual = isSubsequence.isSubsequence(subSequence, search);

        assertTrue(actual);
    }

    @Test
    public void IsSubsequence_SubSequenceDoesNotExist_ReturnFalse() {
        String search = "ahbgdc";
        String subSequence = "bb";

        boolean actual = isSubsequence.isSubsequence(subSequence, search);

        assertFalse(actual);
    }

    @Test
    public void IsSubsequence_SubSequenceExist_ReturnTrue() {
        String search = "sample";
        String subSequence = "sme";

        boolean actual = isSubsequence.isSubsequence(subSequence, search);

        assertTrue(actual);
    }

    @Test
    public void IsSubsequence_LargeStrings_ReturnTrue() {
        String search = "This is a larger test case with more complexity and longer length.";
        String subSequence = "larger test complexity";

        boolean actual = isSubsequence.isSubsequence(subSequence, search);

        assertTrue(actual);
    }

    @Test
    public void IsSubsequence_InterspersedSubSequence_ReturnTrue() {
        String search = "example string for testing";
        String subSequence = "expst";

        boolean actual = isSubsequence.isSubsequence(subSequence, search);

        assertTrue(actual);
    }

    @Test
    public void IsSubsequence_SubsequenceWithRepeatingCharacters_ReturnTrue() {
        String search = "programming";
        String subSequence = "gmm";

        boolean actual = isSubsequence.isSubsequence(subSequence, search);

        assertTrue(actual);
    }

    @Test
    public void IsSubsequence_SearchStringContainsDuplicatesNotInOrder_ReturnFalse() {
        String search = "abababab";
        String subSequence = "baba";

        boolean actual = isSubsequence.isSubsequence(subSequence, search);

        assertTrue(actual);
    }
}