
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TwoSumTest {

	TwoSum twoSum = new TwoSum();

	@Test
	public void givenNoSolutionWhenTwoSumIsCalledThenReturnArrayWithZeroAndLengthMinusOneAsElement() {
		int[] numbers = { 1, 2, 3, 4 };
		int target = 9;
		int[] actual = twoSum.twoSum(numbers, target);

		int[] expected = { 0, numbers.length - 1 };
		assertArrayEquals(expected, actual);
	}

	@Test
	public void givenSolutionWhenTwoSumIsCalledThenReturnArrayWithRightIndices() {
		int[] numbers = { 3, 2, 4 };
		int target = 6;
		int[] actual = twoSum.twoSum(numbers, target);

		int[] expected = { 1, 2 };
		assertArrayEquals(expected, actual);
	}
}