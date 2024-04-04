import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {
    MergeSortedArray mergeSortedArray;

    @Before
    public void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    public void merge_TwoEmptyArray_Num1ShouldBeEmpty() {
        int[] empty1 = new int[]{};
        int[] empty2 = new int[]{};

        mergeSortedArray.merge(empty1, 0, empty2, 0);

        assertEquals(0, empty1.length);
    }

    @Test
    public void merge_FirstArrayEmpty_Nums1ShouldContainNums2() {
        int[] nums1 = new int[3];
        int[] nums2 = {1, 2, 3};

        mergeSortedArray.merge(nums1, 0, nums2, 3);

        assertArrayEquals(new int[]{1, 2, 3}, nums1);
    }

    @Test
    public void merge_SecondArrayEmpty_Nums1ShouldRemainUnchanged() {
        int[] nums1 = {1, 3};
        int[] nums2 = new int[0];

        mergeSortedArray.merge(nums1, 2, nums2, 0);

        assertArrayEquals(new int[]{1, 3}, nums1);
    }

    @Test
    public void merge_NonEmptyArrays_SortedMergeIntoNums1() {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};

        mergeSortedArray.merge(nums1, 3, nums2, 3);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    public void merge_Nums2LargerThanNums1_SortedMergeIntoNums1() {
        int[] nums1 = {2, 0, 0, 0};
        int[] nums2 = {1, 3, 4};

        mergeSortedArray.merge(nums1, 1, nums2, 3);

        assertArrayEquals(new int[]{1, 2, 3, 4}, nums1);
    }
}