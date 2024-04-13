public class ArrayConcatenation {

    public int[] getConcatenation(int[] nums){
        int numsLength = nums.length;
        int[] ans = new int[numsLength* 2];
        for(int i = 0; i < numsLength; i++){
            ans[i] = nums[i];
            ans[numsLength + i] = nums[i];
        }
        return ans;
    }
}