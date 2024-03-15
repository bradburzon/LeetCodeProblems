import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAvgSubArrayTest {

    MaxAvgSubArray maxAvgSubArray;

    @Before
    public void setUp(){
        maxAvgSubArray = new MaxAvgSubArray();
    }

    @Test (expected = RuntimeException.class)
    public void findMaxAverage_EmptyArray_RuntimeException(){
         int[] empty = new int[] {};
         int k = 1000;

        maxAvgSubArray.findMaxAverage(empty,k) ;
    }

    @Test (expected = RuntimeException.class)
    public void findMaxAverage_ArrayLengthLessThanK_RuntimeException(){
        int[] array = new int[] {1};
        int k = 1000;

        maxAvgSubArray.findMaxAverage(array,k) ;
    }

    @Test
    public void findMaxAverage_SameLengthArrayAndK_ReturnAverage(){
        int[] array = new int[] {1,1,1,1};
        int k = 4;

        double actual = maxAvgSubArray.findMaxAverage(array,k) ;

        assertEquals(1, actual, 0);
    }

    @Test
    public void findMaxAverage_BigArray_ReturnAverage(){
        int[] array = new int[] {3, 4,6,7, 433, 32, 44, 5,346,3,42,4,35};
        int k = 4;

        double actual = maxAvgSubArray.findMaxAverage(array,k) ;

        assertEquals(129, actual, 0);
    }
}