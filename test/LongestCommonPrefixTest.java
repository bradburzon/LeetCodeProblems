import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {
	private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

	@Test
    public void givenOneElementInStringArrayWhenLongestCommonPrefixIsCalledThenReturnTheElement() {
		String[] array = { "Element" };

		String actual = longestCommonPrefix.longestCommonPrefix(array);

		assertEquals("Element", actual);
	}

	@Test
    public void givenAnArrayThatContainsEmptyStringWhenLongestCommonPrefixIsCalledThenReturnEmptyString() {
		String[] array = { "Element", "", "a", "abc" };

		String actual = longestCommonPrefix.longestCommonPrefix(array);

		assertEquals("", actual);
	}

	@Test
    public void givenAnArrayThatContainsSameStringWhenLongestCommonPrefixIsCalledThenReturnTheString() {
		String[] array = { "Element", "Element", "Element" };

		String actual = longestCommonPrefix.longestCommonPrefix(array);

		assertEquals("Element", actual);
	}
}
