
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void testTwoSumExample1() {
    	TwoSum ts = new TwoSum();
        TwoSum.Solution solution = ts.new Solution();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testTwoSumExample2() {
    	TwoSum ts = new TwoSum();
        TwoSum.Solution solution = ts.new Solution();
        
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testTwoSumExample3() {
    	TwoSum ts = new TwoSum();
        TwoSum.Solution solution = ts.new Solution();
        
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

}
