import java.util.Arrays;

public class LuckyInteger {
    public int findLucky(int[] array){
       int lucky = -1;
        Arrays.sort(array);
        int current = array[0];
        int currentCount = 0;

        for (int j : array) {
            if (j == current) {
                currentCount++;
            } else {
                if (currentCount == current) {
                    lucky = current;
                }
                current = j;
                currentCount = 1;
            }
        }
        if (currentCount == current) {
            lucky = current;
        }
        return lucky;
    }
}