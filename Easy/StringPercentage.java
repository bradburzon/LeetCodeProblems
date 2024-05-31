public class StringPercentage {
    public int percentageLetter(String string, char letter) {
        double occurence = 0;
        for (char n : string.toCharArray()) {
            if (n == letter) {
                occurence++;
            }
        }
       return (int)Math.floor( (occurence / string.length()) * 100);
    }
}