public class DivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                num1 += i;
            }
        }
        return num1 - ((n * (n + 1) / 2) - num1);
    }
}