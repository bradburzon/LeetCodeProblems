import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticArraySequenceTest {
    ArithmeticArraySequence arithmeticArraySequence;

    @Before
    public void setUp() {
        arithmeticArraySequence = new ArithmeticArraySequence();
    }

    @Test
    public void canMakeArithmeticProgression_EmptyArray_ReturnFalse() {
        boolean actual = arithmeticArraySequence.canMakeArithmeticProgression(new int[]{});

        assertFalse(actual);
    }

    @Test
    public void canMakeArithmeticProgression_SingleElementArray_ReturnFalse() {
        int[] array = new int[]{1};

        boolean actual = arithmeticArraySequence.canMakeArithmeticProgression(array);

        assertFalse(actual);
    }

    @Test
    public void canMakeArithmeticProgression_DoubleElementArray_ReturnTrue() {
        int[] array = new int[]{1, 2};

        boolean actual = arithmeticArraySequence.canMakeArithmeticProgression(array);

        assertTrue(actual);
    }

    @Test
    public void canMakeArithmeticProgression_ArrayWithSequence_ReturnTrue() {
        int[] array = new int[]{3, 5, 1, 7};

        boolean actual = arithmeticArraySequence.canMakeArithmeticProgression(array);

        assertTrue(actual);
    }

    @Test
    public void canMakeArithmeticProgression_ArrayWithNoSequence_ReturnFalse() {
        int[] array = new int[]{2, 4, 1, 8};

        boolean actual = arithmeticArraySequence.canMakeArithmeticProgression(array);

        assertFalse(actual);
    }
}