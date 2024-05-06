import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharArray {
    public char repeatedChar(String string) {
        if (string.length() < 2) {
            throw new RuntimeException("string must have at least 2 letters");
        }
        Set<Character> letters = new HashSet<>();
        for (char c : string.toCharArray()) {
            if (letters.contains(c)) {
                return c;
            } else {
                letters.add(c);
            }
        }
        return '0';
    }
}