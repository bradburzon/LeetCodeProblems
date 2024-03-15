import java.util.Arrays;

public class MaxKSumPairs {
    public int maxOperations(int[] nums, int k) {
        if (nums.length <= 1) {
            throw new RuntimeException("nums must be greater than 1");
        }
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int numberOfPairs = 0;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == k) {
                numberOfPairs++;
                start++;
                end--;
            } else if (sum < k) {
                start++;
            } else {
                end--;
            }
        }
        return numberOfPairs;
    }
}