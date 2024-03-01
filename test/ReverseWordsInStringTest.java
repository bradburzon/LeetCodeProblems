import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseWordsInStringTest {

	private ReverseWordsInString reverseWordsInString;

	@Before
	public void setUp() {
		reverseWordsInString = new ReverseWordsInString();
	}

	@Test
	public void reverseWords_EmptyString_ReturnEmptyString() {
		String actual = reverseWordsInString.reverseWords("");

		assertEquals("", actual);
	}

	@Test
	public void reverseWords_StringWithOnlySpaces_ReturnEmptyString() {
		String actual = reverseWordsInString.reverseWords("    ");

		assertEquals("", actual);
	}

	@Test
	public void reverseWords_SingleWord_ReturnSameWord() {
		String actual = reverseWordsInString.reverseWords("hello");
		assertEquals("hello", actual);
	}

	@Test
	public void reverseWords_SimpleSentence_ReturnWordsReverse() {
		String actual = reverseWordsInString.reverseWords("the sky is blue");

		assertEquals("blue is sky the", actual);
	}

	@Test
	public void reverseWords_LeadingAndTrailingSpaces_ReturnSpacesTrimmedAndWordsReversed() {
		String actual = reverseWordsInString.reverseWords("  hello world  ");

		assertEquals("world hello", actual);
	}

	@Test
	public void reverseWords_MultipleSpacesBetweenWords_ReturnSingleSpaceWords() {
		String actual = reverseWordsInString.reverseWords("a good   example");

		assertEquals("example good a", actual);
	}

	@Test
	public void reverseWords_SentenceWithPunctuation_ReturnPunctuationPreservedWords() {
		String actual = reverseWordsInString.reverseWords("Hello, world!");

		assertEquals("world! Hello,", actual);
	}
}