import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndeces {
    public int[] targetIndeces(int[] array, int target) {
        List<Integer> targetIndeces = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                targetIndeces.add(i);
            }
        }
        return targetIndeces.stream().mapToInt(Integer::intValue).toArray();
    }
}