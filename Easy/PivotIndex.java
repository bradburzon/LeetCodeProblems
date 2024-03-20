import java.util.Arrays;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = Arrays.stream(nums).reduce(0, Integer::sum); // (subtotal, element) -> subtotal + element);
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }
}