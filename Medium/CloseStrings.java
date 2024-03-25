import java.util.HashMap;
import java.util.Map;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Map<Character, Integer> occurrence1 = getOccurrenceMap(word1);
        Map<Character, Integer> occurrence2 = getOccurrenceMap(word2);
        //Check if each letter int word1 exist in word2
        if (!occurrence1.keySet().equals(occurrence2.keySet())) {
            return false;
        }

        // Check if the multiset of occurrence counts is the same
        return occurrence1.values().stream().sorted().toList()
                .equals(occurrence2.values().stream().sorted().toList());
    }

    private Map<Character, Integer> getOccurrenceMap(String word) {
        Map<Character, Integer> occurrence = new HashMap<>();
        for (char c : word.toCharArray()) {
            occurrence.put(c, occurrence.getOrDefault(c, 0) + 1);
        }
        return occurrence;
    }
}