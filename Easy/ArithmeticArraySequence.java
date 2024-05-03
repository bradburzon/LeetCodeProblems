import java.util.Arrays;

public class ArithmeticArraySequence {

    public boolean canMakeArithmeticProgression(int[] array) {
        if (array.length < 2) {
            return false;
        }
        Arrays.sort(array);
        int difference = array[1] - array[0];
        for (int i = 1; i + 1 < array.length ; i++) {
            if (array[i + 1] - array[i] != difference) {
                return false;
            }

        }
        return true;
    }
}