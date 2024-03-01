import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ReverseVowelsTest {

	private ReverseVowels reverseVowels;

	@Before
	public void setUp() {
		reverseVowels = new ReverseVowels();
	}

	@Test
	public void reverseVowels_EmptyString_EmptyString() {
		String actual = reverseVowels.reverseVowels("");
		
		assertEquals("", actual);
	}

	@Test
	public void reverseVowels_SingleCharacter_SameCharacter() {
		String actual = reverseVowels.reverseVowels("a");
		
		assertEquals("a", actual);
	}

	@Test
	public void reverseVowels_SingleConsonant_SameConsonant() {
		String actual = reverseVowels.reverseVowels("b");
		
		assertEquals("b", actual);
	}

	@Test
	public void reverseVowels_ContainsVowels_ReversedVowels() {
		String actual = reverseVowels.reverseVowels("hello");
		
		assertEquals("holle", actual);
	}

	@Test
	public void reverseVowels_ContainsNoVowels_UnchangedString() {
		String actual = reverseVowels.reverseVowels("bcdfg");
		
		assertEquals("bcdfg", actual);
	}

	@Test
	public void reverseVowels_MultipleOccurrencesOfTheSameVowel_ReversedVowels() {
		String actual = reverseVowels.reverseVowels("eEbA");
		
		assertEquals("AEbe", actual);
	}

	@Test
	public void reverseVowels_LongStringWithMixedCases_ReversedVowelsWithSameCases() {
		String actual = reverseVowels.reverseVowels("leetcode");
		
		assertEquals("leotcede", actual);
	}
}