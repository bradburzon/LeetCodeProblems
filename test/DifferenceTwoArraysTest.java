import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DifferenceTwoArraysTest {

    DifferenceTwoArrays differenceTwoArrays;

    @Before
    public void setUp(){
        differenceTwoArrays = new DifferenceTwoArrays();
    }

    @Test
    public void findDifference_TwoUniqueSingleElementArray_ReturnListWithListOfTwoUniqueElement(){
        int[] array1 = new int[]{1};
        int[] array2 = new int[]{2};

        List<List<Integer>> actual = differenceTwoArrays.findDifference(array1, array2);

        assertEquals(Arrays.asList(List.of(1), List.of(2)), actual);
    }

    @Test
    public void findDifference_TwoIdenticalSingleElementArray_ReturnEmptyList(){
        int[] array1 = new int[]{1};
        int[] array2 = new int[]{1};

        List<List<Integer>> actual = differenceTwoArrays.findDifference(array1, array2);

        assertEquals(Arrays.asList(List.of(), List.of()), actual);
    }

    @Test
    public void findDifference_TwoDifferentSingleElementArray_ReturnListWithFirstElementInFirstListAndSecondElementInSecondList(){
        int[] array1 = new int[]{1};
        int[] array2 = new int[]{2};

        List<List<Integer>> actual = differenceTwoArrays.findDifference(array1, array2);

        assertEquals(Arrays.asList(List.of(1), List.of(2)), actual);
    }

    @Test
    public void findDifference_EmptyArrays_ReturnEmptyLists(){
        int[] array1 = new int[]{};
        int[] array2 = new int[]{};

        List<List<Integer>> actual = differenceTwoArrays.findDifference(array1, array2);

        assertEquals(Arrays.asList(List.of(), List.of()), actual);
    }

    @Test
    public void findDifference_ArraysWithMultipleElements_ReturnListsWithDifference(){
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{2, 3, 4};

        List<List<Integer>> actual = differenceTwoArrays.findDifference(array1, array2);

        assertEquals(Arrays.asList(List.of(1), List.of(4)), actual);
    }

    @Test
    public void findDifference_ArraysWithDuplicateElements_ReturnListsWithDifference(){
        int[] array1 = new int[]{1, 2, 2, 3};
        int[] array2 = new int[]{2, 2, 3, 4};

        List<List<Integer>> actual = differenceTwoArrays.findDifference(array1, array2);

        assertEquals(Arrays.asList(List.of(1), List.of(4)), actual);
    }

    @Test
    public void findDifference_ArraysWithOverlappingElements_ReturnListsWithDifference(){
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{3, 4, 5};

        List<List<Integer>> actual = differenceTwoArrays.findDifference(array1, array2);

        assertEquals(Arrays.asList(List.of(1, 2), List.of(4, 5)), actual);
    }
}