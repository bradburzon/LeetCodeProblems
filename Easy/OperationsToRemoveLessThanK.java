public class OperationsToRemoveLessThanK {

    public int minOperations(int[] array, int k){
        int operations = 0;
        for(int n : array){
            if(n < k){
                operations++;
            }
        }
        return operations;
    }
}