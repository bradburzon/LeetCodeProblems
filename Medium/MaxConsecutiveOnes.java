public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int longest = 0;
        int start = 0;
        int zerosCount=0;

        for(int end = 0; end < nums.length; end++){
            if(nums[end] == 0){
                zerosCount++;
            }
            while(zerosCount > k){
                if(nums[start]==0){
                    zerosCount--;
                }
                start++;
            }
            longest = Math.max(longest, end - start + 1);
        }
        return longest;
    }
}