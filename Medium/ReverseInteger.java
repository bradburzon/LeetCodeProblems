
public class ReverseInteger {
	public int reverse(int x) {
		String xString;
		boolean isNegative = false;
		if (x < 0) {
			xString = String.valueOf(x);
			xString = xString.substring(1);
			isNegative = true;
		} else if (x == 0) {
			return 0;
		} else {
			xString = String.valueOf(x);
		}

		String ans = "";
		for (char letter : xString.toCharArray()) {
			ans = letter + ans;
		}
		if (isNegative) {
			ans = "-" + ans;
		}
		long number = Long.valueOf(ans);
		if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) number;
	}
}
