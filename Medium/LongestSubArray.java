public class LongestSubArray {
    //longest subarray of "1"s after deleting one element
    public int longestSubArray(int[] nums) {
        int longest = 0;
        int start = 0;
        int zeroCount = 0;

        for (int end = 0; end < nums.length; end++) {
            if(nums[end] == 0){
                zeroCount++;
            }

            while(zeroCount > 1){
                if(nums[start] == 0){
                    zeroCount--;
                }
                start++;
            }

            longest = Math.max(longest, end - start);
        }
        return longest;
    }
}