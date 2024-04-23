import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsToRemoveLessThanKTest {
    public static final int[] ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    OperationsToRemoveLessThanK operationsToRemoveLessThanK;

    @Before
    public void setUp() {
        operationsToRemoveLessThanK = new OperationsToRemoveLessThanK();
    }

    @Test
    public void minOperations_EmptyArray_ReturnZero() {
        int actual = operationsToRemoveLessThanK.minOperations(new int[]{}, 199);

        assertEquals(0, actual);
    }

    @Test
    public void minOperations_ArrayFilledWithLessThanK_ReturnLengthOfArray() {
        int actual = operationsToRemoveLessThanK.minOperations(ARRAY, 199);

        assertEquals(10, actual);
    }

    @Test
    public void minOperations_ArrayFilledWithGreaterThanK_ReturnZero() {
        int actual = operationsToRemoveLessThanK.minOperations(ARRAY, 0);

        assertEquals(0, actual);
    }

    @Test
    public void minOperations_MixedArray_ReturnCorrectOperations() {
        int actual = operationsToRemoveLessThanK.minOperations(new int[]{1, 5,8, 3, 5, 5, 0, 93, 40}, 4);

        assertEquals(3, actual);
    }
}