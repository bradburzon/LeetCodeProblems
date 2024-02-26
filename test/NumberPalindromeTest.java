import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * AAA 
 * Arrange
 * 
 * Act
 * 
 * Assert
 */
class NumberPalindromeTest {

	private static NumberPalindrome numberPalindrome = new NumberPalindrome();

	@Test
	void givenSingleNumberWhenIsPalindromeIsCalledThenReturnTrue() {
		boolean outcome = numberPalindrome.isPalindrome(1);
		boolean outcome2 = numberPalindrome.isPalindrome(2);
		boolean outcome3 = numberPalindrome.isPalindrome(3);

		assertTrue(outcome);
		assertTrue(outcome2);
		assertTrue(outcome3);
	}

	@Test
	void givenUniqueConsecutiveNumbersWhenIsPalindromeIsCalledThenReturnFalse()  {

		boolean outcome = numberPalindrome.isPalindrome(123456);
		boolean outcome2 = numberPalindrome.isPalindrome(83267);
		boolean outcome3 = numberPalindrome.isPalindrome(74321);

		assertFalse(outcome);
		assertFalse(outcome2);
		assertFalse(outcome3);
	}

	@Test
	void givenSameConsecutiveNumbersWhenIsPalindromeIsCalledThenReturnTrue() {
		boolean outcome = numberPalindrome.isPalindrome(222222);
		boolean outcome2 = numberPalindrome.isPalindrome(88888);
		boolean outcome3 = numberPalindrome.isPalindrome(77);

		assertTrue(outcome);
		assertTrue(outcome2);
		assertTrue(outcome3);
	}

	@Test
	void givenNegativeNumbersWhenIsPalindromeIsCalledThenReturnFalse() {
		boolean outcome = numberPalindrome.isPalindrome(-121);
		boolean outcome2 = numberPalindrome.isPalindrome(-2);
		boolean outcome3 = numberPalindrome.isPalindrome(-555555);

		assertFalse(outcome);
		assertFalse(outcome2);
		assertFalse(outcome3);
	}
}