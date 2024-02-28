import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GCDStringsTest {

	private GCDStrings gcdStrings = new GCDStrings();

	@Test
	public void GcdStrings_TwoEmptyStrings_ReturnEmptyString() {
		String actual = gcdStrings.gcdOfStrings("", "");

		assertEquals("", actual);
	}

	@Test
	public void GcdStrings_OneEmptyString_ReturnEmptyString() {
		String actual = gcdStrings.gcdOfStrings("ABC", "");

		assertEquals("", actual);
	}

	@Test
	public void GcdStrings_IdenticalStrings_ReturnSameString() {
		String actual = gcdStrings.gcdOfStrings("ABC", "ABC");

		assertEquals("ABC", actual);
	}

	@Test
	public void GcdStrings_NoCommonDivisor_ReturnEmptyString() {
		String actual = gcdStrings.gcdOfStrings("ABC", "DEF");

		assertEquals("", actual);
	}

	@Test
	public void GcdStrings_CommonDivisor_ReturnGCDString() {
		String actual = gcdStrings.gcdOfStrings("ABCABC", "ABC");

		assertEquals("ABC", actual);
	}

	@Test
	public void GcdStrings_AnotherCommonDivisor_ReturnGCDString() {
		String actual = gcdStrings.gcdOfStrings("ABABAB", "ABAB");

		assertEquals("AB", actual);
	}

	@Test
	public void GcdStrings_LongStringsCommonDivisor_ReturnGCDString() {
		String actual = gcdStrings.gcdOfStrings("123123123123", "123123");

		assertEquals("123123", actual);
	}

	@Test
	public void GcdStrings_ComplexNoCommonDivisor_ReturnEmptyString() {
		String actual = gcdStrings.gcdOfStrings("ABABABAB", "ABABABC");

		assertEquals("", actual);
	}
}