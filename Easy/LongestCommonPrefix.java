
public class LongestCommonPrefix {

	class Solution {

		public String longestCommonPrefix(String[] strs) {
	    	 String prefix = "";
	         if (strs.length == 1) {
	             return strs[0];
	         }
	         int minLength = Math.min(strs[0].length(), strs[1].length());
	         for (int i = 0; i < strs.length; i++) {
	             minLength = Math.min(minLength, strs[i].length());
	         }
	         if (minLength == 0) {
	             return prefix;
	         }
	      
	         for(int i = 0; i < minLength; i++) {
	        	 char prefixChar = strs[0].charAt(i);
	        	 for(String string : strs) {
	        		 if(string.charAt(i) != prefixChar){
	        			 return prefix;
	        		 }
	        	 }
	        	prefix += prefixChar;
	         }
	         return prefix;
	    }
	}
}