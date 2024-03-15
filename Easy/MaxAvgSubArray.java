public class MaxAvgSubArray {

    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0 || nums.length < k - 1) {
            throw new RuntimeException("nums length must be greater or equal than k");
        }
        double avg = Integer.MIN_VALUE;
        int tempSum = 0;
        int startingWindow = 0;
        int temp = 0;

        while (temp < startingWindow + k) {
            tempSum += nums[temp];
            temp++;
        }
        avg = Math.max(avg, (double) tempSum / k);

        while (startingWindow < nums.length - k) {
            int endWindow = startingWindow + k;
            tempSum -= nums[startingWindow];
            tempSum += nums[endWindow];
            avg = Math.max(avg, (double) tempSum / k);
            startingWindow++;
        }
        return avg;
    }
}