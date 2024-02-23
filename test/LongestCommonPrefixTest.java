import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class LongestCommonPrefixTest {
	private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
	private LongestCommonPrefix.Solution solution = longestCommonPrefix.new Solution();
	@Test 
	void givenOneElementInStringArrayWhenLongestCommonPrefixIsCalledThenReturnTheElement() {
		String[] array = {"Element"};
		
		String actual = solution.longestCommonPrefix(array);
		
		assertEquals("Element", actual);
	}
	
	@Test 
	void givenAnArrayThatContainsEmptyStringWhenLongestCommonPrefixIsCalledThenReturnEmptyString() {
		String[] array = {"Element", "", "a", "abc"};
		
		String actual = solution.longestCommonPrefix(array);
		
		assertEquals("", actual);
	}
	
	@Test 
	void givenAnArrayThatContainsSameStringWhenLongestCommonPrefixIsCalledThenReturnTheString() {
		String[] array = {"Element", "Element", "Element"};
		
		String actual = solution.longestCommonPrefix(array);
		
		assertEquals("Element", actual);
	}
}
