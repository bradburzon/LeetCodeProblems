import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleArrayTest {
    private ShuffleArray shuffleArray;

    @Before
    public void setup() {
        shuffleArray = new ShuffleArray();
    }

    @Test
    public void shuffle_SimpleCase_ReturnsShuffledArray() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] actual = shuffleArray.shuffle(nums, n);

        int[] expected = {2, 3, 5, 4, 1, 7};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shuffle_EmptyArray_ReturnsEmptyArray() {
        int[] nums = {};
        int n = 0;

        int[] actual = shuffleArray.shuffle(nums, n);

        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shuffle_SingleElement_ReturnsSameArray() {
        int[] nums = {1};
        int n = 1;

        int[] actual = shuffleArray.shuffle(nums, n);

        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shuffle_TwoElements_ReturnsShuffledArray() {
        int[] nums = {1, 2};
        int n = 1;

        int[] actual = shuffleArray.shuffle(nums, n);

        int[] expected = {1, 2};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shuffle_LargeN_ReturnsShuffledArray() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 4;

        int[] actual = shuffleArray.shuffle(nums, n);

        int[] expected = {1, 5, 2, 6, 3, 7, 4, 8};
        assertArrayEquals(expected, actual);
    }
}