import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MedianOfTwoSortedArraysTest {
	
	MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
	MedianOfTwoSortedArrays.Solution solution = medianOfTwoSortedArrays.new Solution();
	
	@Test
	void givenTwoArraysWithOneElementEachWhenFindMedianSortedArraysIsCalledThenReturnSumDividedByTwo() {
		int[] array1 = {1};
		int[] array2 = {2}; 
		
		double actual = solution.findMedianSortedArrays(array1, array2);
		assertEquals(1.5, actual);
	}
	
	@Test
	void givenTwoArraysWithOneEmptyWhenFindMedianSortedArraysIsCalledThenReturnMedianOfNonEmptyArray() {
		int[] array1 = {3, 5, 6, 7, 8, 43, 90}; // 3, 5, 6, 7, 8, 43, 90
		int[] array2 = {}; 
		double actual = solution.findMedianSortedArrays(array1, array2);
		
		assertEquals(7, actual);
	}
	
	@Test
	void givenTwoLargeArraysWhenFindMedianSortedArraysIsCalledThenReturnMedianOfNonEmptyArray() {
		int[] array1 = {3, 17, 35, 50, 52, 62, 62, 86, 95, 105, 117, 123, 139, 143, 147, 155, 157, 170, 180, 183, 191, 196, 207, 209, 210, 235, 240, 246, 247, 278, 279, 299, 299, 311, 326, 329, 329, 374, 397, 405, 407, 421, 449, 455, 466, 474, 488, 502}; 
		int[] array2 = {515, 519, 522, 527, 532, 562, 574, 580, 598, 604, 606, 610, 612, 614, 640, 643, 649, 658, 664, 669, 676, 677, 692, 697, 698, 728, 737, 743, 747, 762, 770, 774, 781, 797, 811, 834, 843, 854, 868, 883, 886, 893, 912, 929, 955, 980, 986, 997, 997, 1004, 1006, 1012, 1037}; 
		
		double actual = solution.findMedianSortedArrays(array1, array2);
		
		assertEquals(522, actual);
	}
}
