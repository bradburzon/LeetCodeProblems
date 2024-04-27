import java.util.Arrays;

public class SmallerCountThanCurrentElement {

    public int[] smallerNumbersThanCurrent(int[] array){
        int[] smallers = new int[array.length];
        for(int i = 0; i < array.length; i++){
            int num = array[i];
            smallers[i] = Arrays.stream(array).reduce(0, (total, element) -> num > element ? total + 1 : total);
        }
        return smallers;
    }
}