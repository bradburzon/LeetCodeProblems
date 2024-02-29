import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;
import java.util.Arrays;

public class KidsMaxCandiesTest {

	KidsMaxCandies kidMaxCandies = new KidsMaxCandies();

	@Test
	public void KidsWithCandies_EmptyArray_ReturnEmptyArray() {
		int[] empty = {};
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(empty, 0);
		
		assertEquals(Arrays.asList(), actual);
	}

	@Test
	public void KidsWithCandies_SingleChild_ReturnTrue() {
		int[] candies = { 5 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 3);
		
		assertEquals(Arrays.asList(true), actual);
	}

	@Test
	public void KidsWithCandies_MultipleChildren_SomeCanHaveMax() {
		int[] candies = { 2, 3, 5, 1, 3 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 3);
		
		assertEquals(Arrays.asList(true, true, true, false, true), actual);
	}

	@Test
	public void KidsWithCandies_OneChildCanHaveMax_ReturnAllFalse() {
		int[] candies = { 4, 2, 1, 1, 2 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 1);
		
		assertEquals(Arrays.asList(true, false, false, false, false), actual);
	}

	@Test
	public void KidsWithCandies_ExtraCandiesMakeAllMax_ReturnAllTrue() {
		int[] candies = { 1, 2, 3, 4, 5 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 10);
		
		assertEquals(Arrays.asList(true, true, true, true, true), actual);
	}

	@Test
	public void KidsWithCandies_AllChildrenEqual_ReturnAllTrue() {
		int[] candies = { 3, 3, 3, 3 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 0);
		
		assertEquals(Arrays.asList(true, true, true, true), actual);
	}
}