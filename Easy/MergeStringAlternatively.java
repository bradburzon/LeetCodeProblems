
public class MergeStringAlternatively {

	public String mergeAlternately(String word1, String word2) {
		StringBuilder stringBuilder = new StringBuilder();
		int i = 0;
		int j = 0;
		int word1Length = word1.length();
		int word2Length = word2.length();

		while (i < word1Length || j < word2Length) {
			if (i == word1Length) {
				stringBuilder.append(word2.substring(j));
				return stringBuilder.toString();
			} else {
				stringBuilder.append(word1.charAt(i));
				i++;
				if (j == word2Length) {
					stringBuilder.append(word1.substring(i));
					return stringBuilder.toString();
				} else {
					stringBuilder.append(word2.charAt(j));
					j++;
				}
			}
		}
		return stringBuilder.toString();
	}
}