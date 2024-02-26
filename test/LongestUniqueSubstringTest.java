import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestUniqueSubstringTest {

	private LongestUniqueSubstring longestSubstring = new LongestUniqueSubstring();

	@Test
	void givenEmptyStringWhenLengthOfLongestSubstringIsCalledThenReturnZero() {
		String input = "";

		int outcome = longestSubstring.lengthOfLongestSubstring(input);

		assertEquals(0, outcome);
	}

	@Test
	void givenConsecutiveUniqueLettersWhenLongestSubstringIsCalledThenReturnLength() {
		String input = "abcdfghijklmnop";

		int outcome = longestSubstring.lengthOfLongestSubstring(input);

		assertEquals(input.length(), outcome);
	}

	@Test
	void givenConcesutiveLettersWhenLongestStringIsCalledThenReturnOne() {
		String input = "aaaaaaaaaaaaaaaa";

		int outcome = longestSubstring.lengthOfLongestSubstring(input);

		assertEquals(1, outcome);
	}
}