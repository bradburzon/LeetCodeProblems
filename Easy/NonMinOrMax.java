import java.util.Arrays;

public class NonMinOrMax {
    public int findNonMinorMax(int[] nums){
        if(nums.length <= 2){
            return -1;
        }
        int[] arr = Arrays.copyOf(nums, 3);
        Arrays.sort(arr);
        return arr[1];
    }
}