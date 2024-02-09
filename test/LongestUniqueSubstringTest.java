import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestUniqueSubstringTest {
	@Test
	void lengthOfLongestSubstring_emptyString_ShouldReturnOne() {
		LongestUniqueSubstring test = new LongestUniqueSubstring();
		String input = "";

		int outcome = test.lengthOfLongestSubstring(input);

		assertEquals(0, outcome);
	}

	@Test
	void lengthOfLongestSubstring_consecutiveUniqueLetters_ShouldReturnSize() {
		LongestUniqueSubstring test = new LongestUniqueSubstring();
		String input = "abcdefg";
		int size = input.length();
		
		int outcome = test.lengthOfLongestSubstring(input);
		
		assertEquals(size, outcome);
	}
	
	@Test
	void lengthOfLongestSubstring_alternatingUniqueLetters_ShouldReturnTwo() {
		LongestUniqueSubstring test = new LongestUniqueSubstring();
		String input = "abababab";
		
		int outcome = test.lengthOfLongestSubstring(input);
		
		assertEquals(2, outcome);
	}
	
	@Test
	void lengthOfLongestSubstring_threeAlternatingUniqueLetters_ShouldReturnTwo() {
		LongestUniqueSubstring test = new LongestUniqueSubstring();
		String input = "abcabcabcabc";
		
		int outcome = test.lengthOfLongestSubstring(input);
		
		assertEquals(3, outcome);
	}

	@Test
	void lengthOfLongestSubstring_repeatingLetter_ShouldReturnOne() {
		LongestUniqueSubstring test = new LongestUniqueSubstring();
		String input = "bbbbbb";
		int outcome = test.lengthOfLongestSubstring(input);
		assertEquals(1, outcome);
	}

}
