import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEqualArraysTest {
    CheckEqualArrays checkEqualArrays;

    @Before
  public void setup(){
      checkEqualArrays = new CheckEqualArrays();
    }

    @Test
  public void canBeEqual_TwoEqualSingleElementArrays_ReturnTrue(){
      int[] arr1 = new int[]{1};
      int[] arr2 = new int[]{1};

      boolean actual = checkEqualArrays.canBeEqual(arr1, arr2);

      assertTrue(actual);
    }

    @Test
    public void canBeEqual_TwoDifferentSingleElementArrays_ReturnsFalse() {
        int[] arr1 = {1};
        int[] arr2 = {2};

        boolean actual = checkEqualArrays.canBeEqual(arr1, arr2);
        
        assertFalse(actual);
    }

    @Test
    public void canBeEqual_TwoEqualMultiElementArrays_ReturnsTrue() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};

        boolean actual = checkEqualArrays.canBeEqual(arr1, arr2);

        assertTrue(actual);
    }

    @Test
    public void canBeEqual_TwoDifferentMultiElementArrays_ReturnsFalse() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        boolean actual = checkEqualArrays.canBeEqual(arr1, arr2);
        
        assertFalse(actual);
    }

    @Test
    public void canBeEqual_TwoEmptyArrays_ReturnsTrue() {
        int[] arr1 = {};
        int[] arr2 = {};

        boolean actual = checkEqualArrays.canBeEqual(arr1, arr2);

        assertTrue(actual);
    }

    @Test
    public void canBeEqual_SameElementsDifferentFrequency_ReturnsFalse() {
        int[] arr1 = {1, 1, 2};
        int[] arr2 = {1, 2, 2};

        boolean actual = checkEqualArrays.canBeEqual(arr1, arr2);
        
        assertFalse(actual);
    }
}