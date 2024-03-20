import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxConsecutiveOnesTest {
    private MaxConsecutiveOnes longestOnes;

    @Before
    public void setUp() {
        longestOnes = new MaxConsecutiveOnes();
    }

    @Test
    public void testLongestOnes_NoZerosChangedAllowedWithZeroOnes_ReturnZero() {
        int[] nums = {0, 0, 0, 0};
        int k = 0;

        int result = longestOnes.longestOnes(nums, k);

        assertEquals(0, result);
    }

    @Test
    public void testLongestOnes_OneZerosChangedAllowedWithZeroOnes_ReturnOne() {
        int[] nums = {0, 0, 0, 0};
        int k = 1;

        int result = longestOnes.longestOnes(nums, k);

        assertEquals(1, result);
    }

    @Test
    public void testLongestOnes_OneZerosChangedAllowedWithOneNonZero_ReturnTwo() {
        int[] nums = {1, 0, 0, 0};
        int k = 1;

        int result = longestOnes.longestOnes(nums, k);

        assertEquals(2, result);
    }

    @Test
    public void testLongestOnes_MultipleZeroesWithMixedArray_ReturnConsecutiveOnes() {
        int[] nums = {1, 0, 1, 0, 1, 1, 1, 1, 0 , 0 , 0, 1};
        int k = 3;

        int result = longestOnes.longestOnes(nums, k);

        assertEquals(9, result);
    }
}