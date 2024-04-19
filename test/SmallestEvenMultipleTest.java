import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestEvenMultipleTest {
    SmallestEvenMultiple  smallestEvenMultiple;

    @Before
    public void setUp() {
        smallestEvenMultiple = new SmallestEvenMultiple();
    }

    @Test
    public void smallestEvenMultiple_One_ReturnTwo() {
        int actual = smallestEvenMultiple.smallestEvenMultiple(1);

        assertEquals(2, actual);
    }

    @Test
    public void smallestEvenMultiple_Three_ReturnSix() {
        int actual = smallestEvenMultiple.smallestEvenMultiple(3);

        assertEquals(6, actual);
    }

    @Test
    public void smallestEvenMultiple_Five_ReturnTen() {
        int actual = smallestEvenMultiple.smallestEvenMultiple(5);

        assertEquals(10, actual);
    }

    @Test
    public void smallestEvenMultiple_Seventeen_ReturnThirtyFour() {
        int actual = smallestEvenMultiple.smallestEvenMultiple(17);

        assertEquals(34, actual);
    }
}