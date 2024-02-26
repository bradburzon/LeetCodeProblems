/*
 *  Status: Accepted
 *  
 *  From: https://leetcode.com/problems/palindrome-number/description/
 *  
 *  Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class NumberPalindrome {

	/*
	 * input: integer x 
	 * output - boolean
	 * 
	 * checks if given integer is a palindrome
	 * 
	 * 121
	 * > true
	 * 10
	 * > false
	 * -121
	 * > false
	 * 474747474
	 * > true
	 */

	public boolean isPalindrome(int x) {
		// O(N) space
		String xString = String.valueOf(x);

		// O(N/2) time
		for (int i = 0; i < xString.length() / 2; i++) {
			if (xString.charAt(i) != xString.charAt((xString.length() - 1) - i)) {
				return false;
			}
		}

		return true;
	}
}