import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AntOnBoundaryTest {

    AntOnBoundary antOnBoundary;

    @Before
    public void setup() {
        antOnBoundary = new AntOnBoundary();
    }

    @Test
    public void returnToBoundaryCount_EmptyArray_ReturnZero() {
        int[] array = new int[]{};

        int actual = antOnBoundary.returnToBoundaryCount(array);

        assertEquals(0, actual);
    }

    @Test
    public void returnToBoundaryCount_AllPositiveArray_ReturnZero() {
        int[] array = new int[]{1, 2, 3, 4, 5};

        int actual = antOnBoundary.returnToBoundaryCount(array);

        assertEquals(0, actual);
    }

    @Test
    public void returnToBoundaryCount_AllNegativeArray_ReturnZero() {
        int[] array = new int[]{-5, -300, -2222};

        int actual = antOnBoundary.returnToBoundaryCount(array);

        assertEquals(0, actual);
    }

    @Test
    public void returnToBoundaryCount_MixedSignArray_ReturnCorrectBoundaryCount() {
        int[] array = new int[]{-5, 10, -5};

        int actual = antOnBoundary.returnToBoundaryCount(array);

        assertEquals(1, actual);
    }

    @Test
    public void returnToBoundaryCount_AnotherMixedSignArray_ReturnCorrectBoundaryCount() {
        int[] array = new int[]{-1, 6, -4, 5, 7, -12, 5, -3, 5};

        int actual = antOnBoundary.returnToBoundaryCount(array);

        assertEquals(0, actual);
    }
}