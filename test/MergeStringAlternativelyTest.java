import static junit.framework.TestCase.assertEquals;


import org.junit.Test;

public class MergeStringAlternativelyTest {

	MergeStringAlternatively mergeStringAlternatively = new MergeStringAlternatively();
	@Test
	public void givenTwoEmptyStringWhenMergeAlternatelyIsCalledThenReturnEmptyString() {
		String word1 = "";
		String word2 = "";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals("", actual);
	}

	@Test
	public void givenTwoSingleCharacterStringWhenMergeAlternatelyIsCalledThenReturnConcatenatedString() {
		String word1 = "a";
		String word2 = "d";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals("a" + "d", actual);
	}
	

	@Test
	public void givenEmptyAndNonEmptyStringWhenMergeAlternatelyIsCalledThenReturnNonEmptyString() {
		String word1 = "";
		String word2 = "abc";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals(word2, actual);
	}

	@Test
	public void givenNonEmptyAndEmptyStringWhenMergeAlternatelyIsCalledThenReturnNonEmptyString() {
		String word1 = "abc";
		String word2 = "";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals(word1, actual);
	}

	@Test
	public void givenTwoNonEmptySameSizeStringWhenMergeAlternatelyIsCalledThenReturnAlternateMergedString() {
		String word1 = "abc";
		String word2 = "xyz";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals("axbycz", actual);
	}
	
	@Test
	public void givenTwoNonEmptyStringWithDifferentSizeWhenMergeAlternatelyIsCalledThenReturnAlternateMergedString() {
		String word1 = "a";
		String word2 = "lmnopqrstuvwxyz";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals("almnopqrstuvwxyz", actual);
	}
}