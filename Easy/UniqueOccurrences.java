import java.util.HashSet;
import java.util.Set;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        for(int n : arr){
            unique.add(n);
        }
        Set<Integer> occurrences = new HashSet<>();
        for(int n: unique){
            int count = 0;
            for(int m : arr){
                if( m == n){
                    count++;
                }
            }
            if(!occurrences.contains(count)){
                occurrences.add(count);
            } else {
                return false;
            }
        }
        return true;
    }
}