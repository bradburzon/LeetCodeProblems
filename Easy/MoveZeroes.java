public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (end > 0) {
            if (nums[end] == 0) {
                end--;
                continue;
            }
            if (start > end) {
                break;
            }
            if (nums[start] != 0) {
                start++;
            } else {
                while (start < end) {
                    int temp = nums[start];
                    nums[start] = nums[start + 1];
                    nums[start + 1] = temp;
                    start++;
                }
                start = 0;
                end--;
            }
        }
    }
}