
public class LongestUniqueSubstring {
	/*
	 * string = "sbbasdd"
	 * 
	 */

	public static int lengthOfLongestSubstring(String s) {
		if(s.isEmpty()) {
			return 0;
		}
		return longestHelper(s, "", 0);
	}

	public static int longestHelper(String s, String ans, int largest) {
		if (s.isEmpty()) {
			return largest;
		} else if (ans.contains(s.charAt(0) + "")) {
			return longestHelper(s, "", (largest > ans.length()) ? largest : ans.length());
		} else {
			return longestHelper(s.substring(1), s.charAt(0) + ans, largest++);
		}
	}

	public static void main(String[] args) {
		String ex1 = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(ex1));
	}

}
