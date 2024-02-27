
public class MergeStringAlternatively {

	public String mergeAlternately(String word1, String word2) {
		int word1Length = word1.length(), word2Length = word2.length();
		int maxLength = Math.max(word1Length, word2Length);
		String mergedString = "";
		for (int i = 0; i < maxLength; i++) {
			if (i < word1Length) {
				mergedString += word1.charAt(i);
			}
			if (i < word2Length) {
				mergedString += word2.charAt(i);
			}
		}
		return mergedString;
	}
}