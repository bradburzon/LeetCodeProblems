import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxKSumPairsTest {

    MaxKSumPairs maxKSumPairs;

    @Before
    public void setup(){
        maxKSumPairs = new MaxKSumPairs();
    }

    @Test(expected = RuntimeException.class)
    public void maxOperations_EmptyArray_RuntimeException(){
        int[] kSum  = new int[]{};
        int k = 9;

       maxKSumPairs.maxOperations(kSum, k);
    }

    @Test(expected = RuntimeException.class)
    public void maxOperations_SingleElementArray_RuntimeException(){
        int[] kSum  = new int[]{10000};
        int k = 9;

       maxKSumPairs.maxOperations(kSum, k);
    }

    @Test
    public void maxOperations_NoKSum_ReturnZero(){
        int[] kSum  = new int[]{1,2};
        int k = 1000;

        int actual = maxKSumPairs.maxOperations(kSum, k);

        assertEquals(0, actual);
    }

    @Test
    public void maxOperations_OneKSum_ReturnOne(){
        int[] kSum  = new int[]{1,1,3,4,5};
        int k = 9;

        int actual = maxKSumPairs.maxOperations(kSum, k);

        assertEquals(1, actual);
    }

    @Test
    public void maxOperations_MultipleKSum_ReturnNumberOfMatchingPairs(){
        int[] kSum  = new int[]{1,1,3,4,5, 1, 1, 1, 1, 9, 1000};
        int k = 2;

        int actual = maxKSumPairs.maxOperations(kSum, k);

        assertEquals(3, actual);
    }
}