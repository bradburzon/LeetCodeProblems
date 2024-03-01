
public class ReverseWordsInString {
	
	public String reverseWords(String s) {
		String reverse = "";
		String[] stringArray = s.split(" ");
		for (String n : stringArray) {
			reverse = (n + " " + reverse).trim();
		}

		return reverse;
	}
}