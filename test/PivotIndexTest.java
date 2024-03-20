import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PivotIndexTest {
    private PivotIndex pivotIndex;

    @Before
    public void setUp() {
        pivotIndex = new PivotIndex();
    }

    @Test
    public void testPivotIndex_PivotIndexExists_ReturnsCorrectIndex() {
        int[] nums = {1, 7, 3, 6, 5, 6};

        int result = pivotIndex.pivotIndex(nums);

        assertEquals("Pivot index exists at index 3", 3, result);
    }

    @Test
    public void testPivotIndex_NoPivotIndex_ReturnsNegativeOne() {
        int[] nums = {1, 7, 3, 7, 7, 6};

        int result = pivotIndex.pivotIndex(nums);

        assertEquals("No pivot index found, expected -1", -1, result);
    }

    @Test
    public void testPivotIndex_SingleElementArray_ReturnsZero() {
        int[] nums = {5};

        int result = pivotIndex.pivotIndex(nums);

        assertEquals("Single element array should return 0", 0, result);
    }

    @Test
    public void testPivotIndex_EmptyArray_ReturnsNegativeOne() {
        int[] nums = {};

        int result = pivotIndex.pivotIndex(nums);

        assertEquals("Empty array should return -1", -1, result);
    }
}