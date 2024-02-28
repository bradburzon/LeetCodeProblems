
public class GCDStrings {

	public String gcdOfStrings(String str1, String str2) {
		String divisor = str1.length() > str2.length() ? str2 : str1;
		String gcd = divisor;
		while (gcd.length() > 0) {
			if (str1.length() % gcd.length() == 0 && str2.length() % gcd.length() == 0) {
				StringBuilder gcd1 = new StringBuilder();
				int concatStr1 = str1.length() / gcd.length();
				for (int i = 0; i < concatStr1; i++) {
					gcd1.append(gcd);
				}
				if (str1.equals(gcd1.toString())) {
					StringBuilder gcd2 = new StringBuilder();
					int concatStr2 = str2.length() / gcd.length();
					for (int i = 0; i < concatStr2; i++) {
						gcd2.append(gcd);
					}
					if (str2.equals(gcd2.toString())) {
						return gcd;
					}
				}
			}
			gcd = gcd.substring(0, gcd.length() - 1);
		}
		return "";
	}
}