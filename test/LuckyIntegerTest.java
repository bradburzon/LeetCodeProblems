import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LuckyIntegerTest {

    LuckyInteger luckyInteger;

    @Before
    public void setup(){
        luckyInteger = new LuckyInteger();
    }

    @Test
    public void findLucky_SingleElementOne_ReturnOne(){
        int[] array = new int[]{1};

        int actual = luckyInteger.findLucky(array);

        assertEquals(1, actual);
    }


    @Test
    public void findLucky_NoLuckyNumber_ReturnNegativeOne(){
        int[] array = new int[]{2, 2, 3, 4, 2};

        int actual = luckyInteger.findLucky(array);

        assertEquals(-1, actual);
    }

    @Test
    public void findLucky_MultipleLuckyNumbers_ReturnLargest(){
        int[] array = new int[]{2, 2, 3, 3, 3};

        int actual = luckyInteger.findLucky(array);

        assertEquals(3, actual);
    }

    @Test
    public void findLucky_AllSameNumberNotLucky_ReturnNegativeOne(){
        int[] array = new int[]{5, 5, 5, 5};

        int actual = luckyInteger.findLucky(array);

        assertEquals(-1, actual);
    }

    @Test
    public void findLucky_AllNumbersAreLucky_ReturnLastNumber(){
        int[] array = new int[]{1, 2, 2, 3, 3, 3};

        int actual = luckyInteger.findLucky(array);

        assertEquals(3, actual);
    }

    @Test
    public void findLucky_LargeArrayWithOneLuckyNumber_ReturnThatNumber(){
        int[] array = new int[]{4, 111, 4, 1,111, 4, 11, 11, 4,};

        int actual = luckyInteger.findLucky(array);

        assertEquals(4, actual);
    }
}