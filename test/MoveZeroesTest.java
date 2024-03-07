import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void moveZeroes_MixedArray_MovedZeroesToEnd() {
        int[] input = new int[]{0, 1, 0, 3, 12};

        moveZeroes.moveZeroes(input);

        int[] expected = new int[]{1, 3, 12, 0, 0};
        assertArrayEquals(expected, input);
    }

    @Test
    public void moveZeroes_AllZeros_Unchanged() {
        int[] input = new int[]{0, 0, 0, 0};

        moveZeroes.moveZeroes(input);

        int[] expected = new int[]{0, 0, 0, 0};
        assertArrayEquals(expected, input);
    }

    @Test
    public void moveZeroes_NoZeros_Unchanged() {
        int[] input = new int[]{1, 2, 3, 4};

        moveZeroes.moveZeroes(input);

        int[] expected = new int[]{1, 2, 3, 4};
        assertArrayEquals(expected, input);
    }

    @Test
    public void moveZeroes_ZeroAtStart_MovedToEnd() {
        int[] input = new int[]{0, 1, 2, 3, 4};

        moveZeroes.moveZeroes(input);

        int[] expected = new int[]{1, 2, 3, 4, 0};
        assertArrayEquals(expected, input);
    }

    @Test
    public void moveZeroes_ZerosInMiddle_MovedToEnd() {
        int[] input = new int[]{1, 0, 2, 0, 3};

        moveZeroes.moveZeroes(input);

        int[] expected = new int[]{1, 2, 3, 0, 0};
        assertArrayEquals(expected, input);
    }
}