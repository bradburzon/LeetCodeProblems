
public class LongestUniqueSubstring {

	class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        String longest = "";
	        for (int i = 0; i < s.length(); i++) {
	            String substring = "";
	            for (int j = i; j < s.length(); j++) {
	                if (s.length() == 1) {
	                    if (!substring.contains(s.charAt(j) + "")) {
	                        substring += s.charAt(j);
	                    }
	                } else if (!substring.contains(s.charAt(j) + "")) {
	                    substring += s.charAt(j);
	                } else {

	                    break;
	                }
	            }
	            longest = longest.length() < substring.length() ? substring : longest;
	            substring = "";
	        }
	        return longest.length();
	    }
	}

}
