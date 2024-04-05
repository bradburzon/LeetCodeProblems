import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunningArraySumTest {

    RunningArraySum runningArraySum;

    @Before
    public void setup(){
        runningArraySum = new RunningArraySum();
    }

    @Test
    public void runningSum_SingleElement_ReturnSame(){
        int[] array = new int[]{1};

        int[] actual = runningArraySum.runningSum(array);

        assertEquals(1, actual.length);
        assertEquals(1, actual[0]);
    }

    @Test
    public void runningSum_EmptyArray_ReturnEmptyArray(){
        int[] array = new int[]{};

        int[] actual = runningArraySum.runningSum(array);

        assertEquals(0, actual.length);
    }

    @Test
    public void runningSum_MultipleOneElement_ReturnIncreasingByOneArray(){
        int[] array = new int[]{1, 1, 1, 1, 1};

        int[] actual = runningArraySum.runningSum(array);

        assertEquals(5, actual.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
    }

    @Test
    public void runningSum_RandomNumbersArray_ReturnCorrectArray(){
        int[] array = new int[]{2, 1, 5, 30, 10};

        int[] actual = runningArraySum.runningSum(array);

        assertEquals(5, actual.length);
        assertArrayEquals(new int[]{2, 3, 8, 38, 48}, actual);
    }

    @Test
    public void runningSum_ZeroArray_ReturnZeroOnlyArray(){
        int[] array = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] actual = runningArraySum.runningSum(array);

        assertEquals(11, actual.length);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, actual);
    }
}