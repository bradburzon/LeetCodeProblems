
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class TwoSumTest {

	TwoSum twoSum = new TwoSum();

	@Test
	void testTwoSumExample1() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] actual = twoSum.twoSum(nums, target);

		int[] expected = { 0, 1 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void testTwoSumExample2() {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] actual = twoSum.twoSum(nums, target);

		int[] expected = { 1, 2 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void testTwoSumExample3() {
		int[] nums = { 3, 3 };
		int target = 6;
		int[] actual = twoSum.twoSum(nums, target);

		int[] expected = { 0, 1 };
		assertArrayEquals(expected, actual);
	}
}