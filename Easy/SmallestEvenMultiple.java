public class SmallestEvenMultiple {

    public int smallestEvenMultiple(int n){
       if(n % 2 != 0){
            n += n;
        }
        return n;
    }
}
