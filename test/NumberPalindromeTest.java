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
	void isPalindrome_singleDigit_shouldReturnTrue() {
		boolean outcome = numberPalindrome.isPalindrome(1);
		boolean outcome2 = numberPalindrome.isPalindrome(2);
		boolean outcome3 = numberPalindrome.isPalindrome(3);

		assertTrue(outcome);
		assertTrue(outcome2);
		assertTrue(outcome3);
	}

	@Test
	void isPalindrome_doubleUniqueNumbers_shouldReturnFalse() {

		boolean outcome = numberPalindrome.isPalindrome(12);
		boolean outcome2 = numberPalindrome.isPalindrome(83);
		boolean outcome3 = numberPalindrome.isPalindrome(74);

		assertFalse(outcome);
		assertFalse(outcome2);
		assertFalse(outcome3);
	}

	@Test
	void isPalindrome_doubleSameNumbers_shouldReturnTrue() {
		boolean outcome = numberPalindrome.isPalindrome(22);
		boolean outcome2 = numberPalindrome.isPalindrome(88);
		boolean outcome3 = numberPalindrome.isPalindrome(77);

		assertTrue(outcome);
		assertTrue(outcome2);
		assertTrue(outcome3);
	}

	@Test
	void isPalindrome_alternatingOddNumberSize_shouldReturnTrue() {
		boolean outcome = numberPalindrome.isPalindrome(121);
		boolean outcome2 = numberPalindrome.isPalindrome(45454);
		boolean outcome3 = numberPalindrome.isPalindrome(474747474);

		assertTrue(outcome);
		assertTrue(outcome2);
		assertTrue(outcome3);
	}

	@Test
	void isPalindrome_negativeNumbers_shouldReturnTrue() {
		boolean outcome = numberPalindrome.isPalindrome(-121);
		boolean outcome2 = numberPalindrome.isPalindrome(-2);
		boolean outcome3 = numberPalindrome.isPalindrome(-555555);

		assertFalse(outcome);
		assertFalse(outcome2);
		assertFalse(outcome3);
	}
}