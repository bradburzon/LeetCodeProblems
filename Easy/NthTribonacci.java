public class NthTribonacci {

    public int tribonacci(int n) {
        int[] calculatedTribonacci = new int[n + 3];
        calculatedTribonacci[0] = 0;
        calculatedTribonacci[1] = 1;
        calculatedTribonacci[2] = 1;
        for (int i = 0; i < calculatedTribonacci.length - 3; i++) {
            calculatedTribonacci[i + 3] = calculatedTribonacci[i] + calculatedTribonacci[i + 1] + calculatedTribonacci[i + 2];
        }
        return calculatedTribonacci[n];
    }
}