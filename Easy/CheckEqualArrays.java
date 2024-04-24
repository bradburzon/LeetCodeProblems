import java.util.HashMap;

public class CheckEqualArrays {

    public boolean canBeEqual(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (!countMap.containsKey(num) || countMap.get(num) == 0) {
                return false;
            }
            countMap.put(num, countMap.get(num) - 1);
        }
        return true;
    }
}