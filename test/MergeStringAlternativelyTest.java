import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MergeStringAlternativelyTest {

	MergeStringAlternatively mergeStringAlternatively = new MergeStringAlternatively();
	@Test
	public void givenTwoEmptyStringWhenmergeAlternatelyIsCalledThenReturnEmptyString() {
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
	public void givenEmptyAndNonEmptyStringWhenmergeAlternatelyIsCalledThenReturnNonEmptyString() {
		String word1 = "";
		String word2 = "abc";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals(word2, actual);
	}

	@Test
	public void givenNonEmptyAndEmptyStringWhenmergeAlternatelyIsCalledThenReturnNonEmptyString() {
		String word1 = "abc";
		String word2 = "";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals(word1, actual);
	}

	@Test
	public void givenTwoNonEmptySameSizeStringWhenmergeAlternatelyIsCalledThenReturnAlternateMergedString() {
		String word1 = "abc";
		String word2 = "xyz";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals("axbycz", actual);
	}
	
	@Test
	public void givenTwoNonEmptyStringWithDifferentSizeWhenmergeAlternatelyIsCalledThenReturnAlternateMergedString() {
		String word1 = "a";
		String word2 = "lmnopqrstuvwxyz";

		String actual = mergeStringAlternatively.mergeAlternately(word1, word2);

		assertEquals("almnopqrstuvwxyz", actual);
	}
}