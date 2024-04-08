import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordPrefixTest {

    public static final String SENTENCE = "hello from the other side";
    WordPrefix wordPrefix;
    
    @Before
    public void setup(){
        wordPrefix = new WordPrefix();
    }
    
    @Test
    public void isPrefixOfWord_PrefixPresent_ReturnsCorrectIndex() {
        String searchWord = "oth";

        int actual = wordPrefix.isPrefixOfWord(SENTENCE, searchWord);

        assertEquals(4, actual);
    }

    @Test
    public void isPrefixOfWord_PrefixAbsent_ReturnsNegativeOne() {
        String searchWord = "xyz";

        int actual = wordPrefix.isPrefixOfWord(SENTENCE, searchWord);

        assertEquals(-1, actual);
    }

    @Test
    public void isPrefixOfWord_PrefixIsFirstWord_ReturnsOne() {
        String searchWord = "hel";

        int actual = wordPrefix.isPrefixOfWord(SENTENCE, searchWord);

        assertEquals(1,actual);
    }

    @Test
    public void isPrefixOfWord_PrefixIsLastWord_ReturnsIndexOfLastWord() {
        String searchWord = "sid";

        int actual = wordPrefix.isPrefixOfWord(SENTENCE, searchWord);

        assertEquals(5, actual );
    }

    @Test
    public void isPrefixOfWord_EmptySentence_ReturnsNegativeOne() {
        String searchWord = "anything";

        int actual = wordPrefix.isPrefixOfWord(SENTENCE, searchWord);

        assertEquals(-1, actual);
    }

    @Test
    public void isPrefixOfWord_EmptySearchWord_ReturnsOne() {
        int actual = wordPrefix.isPrefixOfWord(SENTENCE, "");

        assertEquals(1, actual);
    }
}