import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsMaxCandies {
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> kidMax = new ArrayList<>();
		if(candies.length == 0) {
			return kidMax;
		}
		int[] sorted = candies.clone();
		Arrays.sort(sorted);
		int max = sorted[sorted.length - 1];
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				kidMax.add(true);
			} else {
				kidMax.add(false);
			}
		}
		return kidMax;
	}
}