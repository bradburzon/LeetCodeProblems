import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestSubArrayTest {
    private LongestSubArray longestSubArray;

    @Before
    public void setUp() {
        longestSubArray = new LongestSubArray();
    }

    @Test
    public void longestSubArray_AllZeros_ReturnsZero() {
        int[] nums = {0, 0, 0, 0, 0};

        int result = longestSubArray.longestSubArray(nums);

        assertEquals(0, result);
    }

    @Test
    public void longestSubArray_NoZeros_ReturnsArrayLengthMinusOne() {
        int[] nums = {1, 1, 1, 1, 1};

        int result = longestSubArray.longestSubArray(nums);

        assertEquals(4, result);
    }

    @Test
    public void longestSubArray_OneZero_ReturnsArrayLengthMinusOne() {
        int[] nums = {1, 1, 0, 1, 1};

        int result = longestSubArray.longestSubArray(nums);
        
        assertEquals(4, result);
    }

    @Test
    public void longestSubArray_MultipleZeros_ReturnsLongestSubArrayLength() {
        int[] nums = {1, 0, 1, 0, 1, 1, 0, 1, 1, 1};

        int result = longestSubArray.longestSubArray(nums);

        assertEquals(5, result);
    }
}