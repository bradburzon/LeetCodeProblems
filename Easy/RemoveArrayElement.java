public class RemoveArrayElement {

    public int removeElement(int[] nums, int val) {
        int pos = 0;
        int found = nums.length - 1;
        int match = 0;
        while (pos <= found) {
            int num = nums[pos];
            if (num != val) {
                pos++;
            } else {
                match++;
                nums[pos] = nums[found];
                nums[found] = num;
                found--;
            }
        }
        return nums.length - match;
    }
}