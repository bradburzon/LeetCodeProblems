public class CountEvenDigitElements {
    public int findNumbers(int[] nums){
        int evenDigits = 0;
        for(int n : nums){
            int digit = 0;
            while(n > 0){
                digit++;
                n /= 10;
            }
            if(digit % 2 == 0){
                evenDigits++;
            }
        }

        return evenDigits;
    }
}