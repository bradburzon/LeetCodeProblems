import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestUniqueSubstringTest {
	
	private LongestUniqueSubstring longestSubstring = new LongestUniqueSubstring();
	private LongestUniqueSubstring.Solution solution = longestSubstring.new Solution();

	@Test
	void givenEmptyStringWhenLengthOfLongestSubstringIsCalledThenReturnZero() {
		String input = "";

		int outcome = solution.lengthOfLongestSubstring(input);

		assertEquals(0, outcome);
	}

	@Test
	void givenConsecutiveUniqueLettersWhenLongestSubstringIsCalledThenReturnLength() {
		String input = "abcdfghijklmnop";

		int outcome = solution.lengthOfLongestSubstring(input);

		assertEquals(input.length(), outcome);
	}
	
	@Test
	void givenConcesutiveLettersWhenLongestStringIsCalledThenReturnOne() {
		String input = "aaaaaaaaaaaaaaaa";

		int outcome = solution.lengthOfLongestSubstring(input);

		assertEquals(1, outcome);
	}
}
