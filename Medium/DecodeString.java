import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString.toString());
                k = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {

                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                int count = countStack.pop();
                decodedString.append(currentString.toString().repeat(Math.max(0, count)));
                currentString = new StringBuilder(decodedString.toString());
            } else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}