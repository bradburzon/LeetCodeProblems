import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestUniqueSubstringTest {

	private final LongestUniqueSubstring longestSubstring = new LongestUniqueSubstring();

	@Test
    public void givenEmptyStringWhenLengthOfLongestSubstringIsCalledThenReturnZero() {
		String input = "";

		int outcome = longestSubstring.lengthOfLongestSubstring(input);

		assertEquals(0, outcome);
	}

	@Test
    public void givenConsecutiveUniqueLettersWhenLongestSubstringIsCalledThenReturnLength() {
		String input = "abcdfghijklmnop";

		int outcome = longestSubstring.lengthOfLongestSubstring(input);

		assertEquals(input.length(), outcome);
	}

	@Test
    public void givenConcesutiveLettersWhenLongestStringIsCalledThenReturnOne() {
		String input = "aaaaaaaaaaaaaaaa";

		int outcome = longestSubstring.lengthOfLongestSubstring(input);

		assertEquals(1, outcome);
	}
}