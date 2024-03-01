
public class ReverseVowels {

	public String reverseVowels(String s) {
		int stringLength = s.length();
		if (stringLength <= 1) {
			return s;
		}

		char[] charArray = s.toCharArray();

		int left = 0;
		int right = stringLength - 1;
		while (left <= right) {
			char currentLeftChar = charArray[left];
			if (isVowel(currentLeftChar)) {
				while (right > left) {
					char currentRightChar = s.charAt(right);
					if (isVowel(currentRightChar)) {
						charArray[left] = currentRightChar;
						charArray[right] = currentLeftChar;
						right--;
						break;
					}
					right--;
				}
			}
			left++;
		}
		StringBuilder stringBuilder = new StringBuilder(stringLength);
		for (int i = 0; i < stringLength; i++) {
			stringBuilder.append(charArray[i]);
		}
		return stringBuilder.toString();
	}

	public static boolean isVowel(char c) {
		return "AEIOUaeiou".indexOf(c) != -1;
	}
}