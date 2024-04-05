public class AntOnBoundary {

    public int returnToBoundaryCount(int[] nums){
        int boundary = 0;
        for(int i = 0, balance = 0; i < nums.length; i++){
            balance += nums[i];
            if(balance == 0){
                boundary++;
            }
        }
        return boundary;
    }
}