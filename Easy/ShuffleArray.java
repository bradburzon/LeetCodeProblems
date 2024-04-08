public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int ansIndex = 0;
        for (int col = 0; col < n; col++) {
            for (int i = col; i < nums.length; i += n) {
                ans[ansIndex++] = nums[i];
            }
        }
        return ans;
    }
}