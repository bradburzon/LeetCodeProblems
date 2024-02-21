import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
	class Solution {
		public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			int num1Size = nums1.length;
			int num2Size = nums2.length;
			int median = (num1Size + num2Size) / 2;
			ArrayList<Integer> arr = new ArrayList<>();
			
			for (int n : nums1) {
				arr.add(n);
			}
			for (int n : nums2) {
				arr.add(n);
			}
			Collections.sort(arr);
			
			if ((num1Size + num2Size) % 2 == 0) {
				return (double) (arr.get(median) + arr.get(median - 1)) / 2.0;
			}
			return arr.get(median);
		}
	}
}
