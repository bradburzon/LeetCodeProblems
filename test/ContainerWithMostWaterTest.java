import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @Before
    public void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test(expected = RuntimeException.class)
    public void maxArea_SingleElementArray_ThrowException() {
        int[] height = new int[]{1};
        containerWithMostWater.maxArea(height);
    }

    @Test
    public void maxArea_DoubleElementArray_ReturnElementOneTimesElementTwo() {
        int[] height = new int[]{1, 2};
        int actual = containerWithMostWater.maxArea(height);
        assertEquals("The max area should be 1", 1, actual);
    }

    @Test
    public void maxArea_MultipleElementArray_ReturnCorrectMaxArea() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int actual = containerWithMostWater.maxArea(height);
        assertEquals("The max area should be 49", 49, actual);
    }
}
