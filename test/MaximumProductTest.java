import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductTest {

    MaximumProduct maximumProduct;

    @Before
    public void setup(){
        maximumProduct = new MaximumProduct();
    }

    @Test
    public void maxProduct_WithTwoElements_ReturnsCorrectResult() {
        int[] nums = {10, 2};
        
        int actual = maximumProduct.maxProduct(nums);
        
        assertEquals(9, actual);
    }

    @Test
    public void maxProduct_WithTypicalArray_ReturnsCorrectResult() {
        int[] nums = {3, 4, 5, 2};

        int actual = maximumProduct.maxProduct(nums);

        assertEquals(12, actual);
    }

    @Test
    public void maxProduct_WithAllEqualElements_ReturnsCorrectResult() {
        int[] nums = {1, 1, 1, 1};

        int actual = maximumProduct.maxProduct(nums);

        assertEquals(0, actual);
    }
    
    @Test
    public void maxProduct_WithIncreasingNumbers_ReturnsCorrectResult() {
        int[] nums = {1, 2, 3, 4};

        int actual = maximumProduct.maxProduct(nums);

        assertEquals(6, actual);
    }

    @Test
    public void maxProduct_WithLargeNumbers_ReturnsCorrectResult() {
        int[] nums = {1000, 999, 998, 997};

        int actual = maximumProduct.maxProduct(nums);

        assertEquals(997002, actual);
    }
}