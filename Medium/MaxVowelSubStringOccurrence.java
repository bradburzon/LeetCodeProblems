public class MaxVowelSubStringOccurrence {

    public int maxVowels(String s, int k) {
        int slidingWindow = 0;
        if(s.isEmpty() ){
            return slidingWindow;
        }
        char[] charArray = s.toCharArray();
        for (int i = 0; i < Math.min(k, s.length()); i++) {
            if (isVowel(charArray[i])) {
                slidingWindow++;
            }
        }
        int maxVowelOccurence = slidingWindow;
        for (int i = k; i < charArray.length; i++) {
            int temp = isVowel(charArray[i - k]) ? -1 : 0;
            temp += isVowel(charArray[i]) ? 1 : 0;
            slidingWindow += temp;
            maxVowelOccurence = Math.max(maxVowelOccurence, slidingWindow);

        }
        return maxVowelOccurence;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

}
