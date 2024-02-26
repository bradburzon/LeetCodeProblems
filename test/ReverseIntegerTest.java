import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {
	
	ReverseInteger reverseInteger = new ReverseInteger();

	@Test
	void givenZeroWhenReverseIsCalledThenReturnZero() {
		int actual = reverseInteger.reverse(0);
		
		assertEquals(0, actual);
	}
	
	@Test
	void givenRepeatingPositiveIntegerWhenReverseIsCalledThenReturnTheSameNumber() {
		int actual = reverseInteger.reverse(111111);
		
		assertEquals(111111, actual);
	}
	
	@Test
	void givenNegativeIntegerWhenReverseIsCalledThenReturnReversedNegativeInteger() {
		int actual = reverseInteger.reverse(-1234);
		
		assertEquals(-4321, actual);
	}
	
	@Test
	void givenNumberGreaterThanMaxIntegerWhenReverseIsCalledThenReturn0() {
		int actual = reverseInteger.reverse(-1534236469);
		
		assertEquals(0, actual);
	}
}