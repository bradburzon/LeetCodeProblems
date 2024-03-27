public class RemoveStarsFromString {

    public String removeStars(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int position = s.length() - 1;
        int lettersToSkip = 0;
        while (position >= 0) {
            char currentChar = s.charAt(position);
            if (currentChar == '*') {
                lettersToSkip++;
                position--;
                continue;
            } else {
                if (lettersToSkip > 0) {
                    lettersToSkip--;
                    position--;
                    continue;
                }
            }
            stringBuilder.append(currentChar);
            position--;
        }
        return stringBuilder.reverse().toString();
    }
}