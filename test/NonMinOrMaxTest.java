import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonMinOrMaxTest {
    NonMinOrMax nonMinOrMax;

    @Before
    public void setUp() {
        nonMinOrMax = new NonMinOrMax();
    }

    @Test
    public void findNonMinorMax_SingleElementArray_ReturnNegativeOne() {
        int actual = nonMinOrMax.findNonMinorMax(new int[]{1});

        assertEquals(-1, actual);
    }

    @Test
    public void findNonMinorMax_DoubleElementArray_ReturnNegativeOne() {
        int actual = nonMinOrMax.findNonMinorMax(new int[]{1, 2});

        assertEquals(-1, actual);
    }

    @Test
    public void findNonMinorMax_MediumArray_ReturnNegativeOne() {
        int actual = nonMinOrMax.findNonMinorMax(new int[]{1, 2, 3, 5});

        assertEquals(2, actual);
    }
}