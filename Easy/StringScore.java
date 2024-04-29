public class StringScore {

    public int scoreOfString(String string) {
        int score = 0;
        int currChar = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            int next = string.charAt(i);
            score += Math.abs(currChar - next);
            currChar = next;
        }
        return score;
    }
}
