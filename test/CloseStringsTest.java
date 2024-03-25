import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CloseStringsTest {

    CloseStrings closeStrings;

    @Before
    public void setUp() {
        closeStrings = new CloseStrings();
    }

    @Test
    public void closeStrings_TwoSameString_ReturnsTrue() {
        String word1 = "abc";
        
        assertTrue(closeStrings.closeStrings(word1, word1));
    }

    @Test
    public void closeStrings_DifferentLengthWords_ReturnsFalse() {
        String word1 = "abc";
        String word2 = "abcd";
        
        assertFalse(closeStrings.closeStrings(word1, word2));
    }

    @Test
    public void closeStrings_DifferentCharacters_ReturnsFalse() {
        String word1 = "abc";
        String word2 = "xyz";
        
        assertFalse(closeStrings.closeStrings(word1, word2));
    }

    @Test
    public void closeStrings_SameCharactersDifferentOccurrence_ReturnsTrue() {
        String word1 = "abbccc";
        String word2 = "cccbba";
        
        assertTrue(closeStrings.closeStrings(word1, word2));
    }

    @Test
    public void closeStrings_SameCharactersDifferentLength_ReturnsFalse() {
        String word1 = "aaabb";
        String word2 = "aab";
        
        assertFalse(closeStrings.closeStrings(word1, word2));
    }

    @Test
    public void closeStrings_EmptyStrings_ReturnsTrue() {
        String word1 = "";
        String word2 = "";
        
        assertTrue(closeStrings.closeStrings(word1, word2));
    }

    @Test
    public void closeStrings_SameLengthWordsWithSimilarOccurrences_ReturnsTrue() {
        String word1 = "abb";
        String word2 = "aab";
        
        assertTrue(closeStrings.closeStrings(word1, word2));
    }
}