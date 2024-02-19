import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

	class Solution {
		// Optimizing with dynamic sliding window
		public int lengthOfLongestSubstring(String s) {
			int left = 0;
			int longest = 0;  //Window
			Set<Character> seen = new HashSet<Character>();
			for (int right = 0; right < s.length(); right++) {
				char letter = s.charAt(right);
				while (seen.contains(letter)) {
					seen.remove(s.charAt(left));
					left++;
				}
				seen.add(letter);
				longest = Math.max(longest, right - left + 1);
			}
			return longest;
		}
	}
}
