
public class LongestUniqueSubstring {
	/*
	 * string = "sbbasdd"
	 * 
	 */

	public int lengthOfLongestSubstring(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		return longestHelper(s, "", 0);
	}

	public int longestHelper(String s, String ans, int largest) {
		if (s.isEmpty()) {
			return ((largest > ans.length()) ? largest : ans.length());
		} else if (ans.contains(s.charAt(0) + "")) {
			return longestHelper(s, "", (largest > ans.length()) ? largest : ans.length());
		} else {
			return longestHelper(s.substring(1), s.charAt(0) + ans, largest++);
		}
	}

	public static void main(String[] args) {
		LongestUniqueSubstring test = new LongestUniqueSubstring();
		String ex1 = "abc";
		System.out.println(test.lengthOfLongestSubstring(ex1));
	}

}
