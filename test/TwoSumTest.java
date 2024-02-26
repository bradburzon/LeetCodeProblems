
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class TwoSumTest {

	TwoSum twoSum = new TwoSum();

	@Test
	void givenNoSolutionWhenTwoSumIsCalledThenReturnArrayWithZeroAndLenghtMinusOneAsElement() {
		int[] nums = { 1, 2, 3, 4 };
		int target = 9;
		int[] actual = twoSum.twoSum(nums, target);

		int[] expected = { 0, nums.length - 1 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void givenSolutionWhenTwoSumIsCalledThenReturnArrayWithRightIndeces() {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] actual = twoSum.twoSum(nums, target);

		int[] expected = { 1, 2 };
		assertArrayEquals(expected, actual);
	}
}