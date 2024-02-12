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

	@Test
	void isPalindrome_singleDigit_shouldReturnTrue() {
		NumberPalindrome np = new NumberPalindrome();
		NumberPalindrome.Solution solution = np.new Solution();
		
		boolean outcome = solution.isPalindrome(1);
		boolean outcome2 = solution.isPalindrome(2);
		boolean outcome3 = solution.isPalindrome(3);
		
		assertTrue(outcome);
		assertTrue(outcome2);
		assertTrue(outcome3);
	}
	
	@Test
	void isPalindrome_doubleUniqueNumbers_shouldReturnFalse() {
		NumberPalindrome np = new NumberPalindrome();
		NumberPalindrome.Solution solution = np.new Solution();
		
		boolean outcome = solution.isPalindrome(12);
		boolean outcome2 = solution.isPalindrome(83);
		boolean outcome3 = solution.isPalindrome(74);
		
		assertFalse(outcome);
		assertFalse(outcome2);
		assertFalse(outcome3);
	}
	
	@Test
	void isPalindrome_doubleSameNumbers_shouldReturnTrue() {
		NumberPalindrome np = new NumberPalindrome();
		NumberPalindrome.Solution solution = np.new Solution();
		
		boolean outcome = solution.isPalindrome(22);
		boolean outcome2 = solution.isPalindrome(88);
		boolean outcome3 = solution.isPalindrome(77);
		
		assertTrue(outcome);
		assertTrue(outcome2);
		assertTrue(outcome3);
	}
	
	@Test
	void isPalindrome_alternatingOddNumberSize_shouldReturnTrue() {
		NumberPalindrome np = new NumberPalindrome();
		NumberPalindrome.Solution solution = np.new Solution();
		
		boolean outcome = solution.isPalindrome(121);
		boolean outcome2 = solution.isPalindrome(45454);
		boolean outcome3 = solution.isPalindrome(474747474);
		
		assertTrue(outcome);
		assertTrue(outcome2);
		assertTrue(outcome3);
	}
	
	@Test
	void isPalindrome_negativeNumbers_shouldReturnTrue() {
		NumberPalindrome np = new NumberPalindrome();
		NumberPalindrome.Solution solution = np.new Solution();
		
		boolean outcome = solution.isPalindrome(-121);
		boolean outcome2 = solution.isPalindrome(-2);
		boolean outcome3 = solution.isPalindrome(-555555);
		
		assertFalse(outcome);
		assertFalse(outcome2);
		assertFalse(outcome3);
	}

}
