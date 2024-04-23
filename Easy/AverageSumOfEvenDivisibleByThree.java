public class AverageSumOfEvenDivisibleByThree {

    public int averageValue(int[] array) {
        int divSums = 0;
        int divNums = 0;
        for (int n : array) {
            if (n % 3 == 0 && n % 2 == 0) {
                divSums += n;
                divNums++;
            }
        }
        if (divNums == 0) {
            return 0;
        }
        return divSums / divNums;
    }
}