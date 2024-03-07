public class StringCompression {

    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int occurence = 1;
        char visitedChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (visitedChar == chars[i]) {
                occurence++;
            } else {
                if (occurence == 1) {
                    s.append(visitedChar);
                } else {
                    s.append(visitedChar).append(occurence);
                }
                visitedChar = chars[i];
                occurence = 1;
            }
        }
        if (occurence == 1) {
            s.append(visitedChar);
        } else {
            s.append(visitedChar).append(occurence);
        }
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}