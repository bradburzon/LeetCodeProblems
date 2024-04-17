import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthTribonacciTest {
    NthTribonacci nthTribonacci;

    @Before
    public void setUp() {
        nthTribonacci = new NthTribonacci();
    }

    @Test
    public void tribonacci_One_ReturnOne() {
        int actual = nthTribonacci.tribonacci(1);

        assertEquals(1, actual);
    }

    @Test
    public void tribonacci_Two_ReturnOne() {
        int actual = nthTribonacci.tribonacci(2);

        assertEquals(1, actual);
    }

    @Test
    public void tribonacci_Three_ReturnTwo() {
        int actual = nthTribonacci.tribonacci(3);

        assertEquals(2, actual);
    }

    @Test
    public void tribonacci_Four_ReturnFour() {
        int actual = nthTribonacci.tribonacci(4);

        assertEquals(4, actual);
    }

    @Test
    public void tribonacci_Five_ReturnSeven() {
        int actual = nthTribonacci.tribonacci(5);

        assertEquals(7, actual);
    }
}