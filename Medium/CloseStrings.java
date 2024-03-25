import java.util.*;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }

        Set<Character> letters1 = new HashSet<>();
        for(char n : word1.toCharArray()){
            letters1.add(n);
        }
        Set<Character> letters2 = new HashSet<>();
        for(char n : word2.toCharArray()){
            letters2.add(n);
        }

        if(!letters1.containsAll(letters2) || !letters2.containsAll(letters1)){
            return false;
        }

        Map<Character, Integer> occurrence1 = new HashMap<>();
        Map<Character, Integer> occurrence2 = new HashMap<>();
        for(char c : letters1){
            int count = 0;
            for(char letter : word1.toCharArray()){
                if(c == letter){
                    count++;
                }
            }
            occurrence1.put(c, count);
        }
        for(char c : letters2){
            int count = 0;
            for(char letter : word2.toCharArray()){
                if(c == letter){
                    count++;
                }
            }
            occurrence2.put(c, count);
        }

        Collection<Integer> mappedOccurrence1 = occurrence1.values();
        List<Integer> mapped1 = new ArrayList<>(mappedOccurrence1);
        Collection<Integer> mappedOccurrence2 = occurrence2.values();
        List<Integer> mapped2 = new ArrayList<>(mappedOccurrence2);
        Collections.sort(mapped2);
        Collections.sort(mapped1);
        for(int i = 0; i < mapped2.size(); i++){
            if(!Objects.equals(mapped1.get(i), mapped2.get(i))){
                return false;
            }
        }
        return true;
    }
}