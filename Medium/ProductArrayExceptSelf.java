public class ProductArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product = 1;

        for (int num : nums) {
            if (num != 0) {
                product *= num;
            } else {
                zeroCount++;
            }
        }

        if (zeroCount >= 2) {
            return new int[nums.length];
        }

        int[] productArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 0) {
                productArray[i] = product / nums[i];
            } else if (nums[i] == 0) {
                productArray[i] = product;
            }
        }
        return productArray;
    }
}