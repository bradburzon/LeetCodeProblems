import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestUniqueSubstringTest {
	@Test
	void testEmptyString() {
		String example1 = "";
		assertEquals(0, LongestUniqueSubstring.lengthOfLongestSubstring(example1));
	}

	@Test
	void testExample() {
		String example1 = "abcabcbb";
		assertEquals(3, LongestUniqueSubstring.lengthOfLongestSubstring(example1));
	}
	
	@Test
	void testExample2() {
		String example2 = "bbbbbb";
		assertEquals(1, LongestUniqueSubstring.lengthOfLongestSubstring(example2));
	}
	
	@Test
	void testExample3() {
		String example3 = "pwwkew";
		assertEquals(3, LongestUniqueSubstring.lengthOfLongestSubstring(example3));
	}

}
