package solutions;

public class NumberOfTrailingZerosOfNFactorial {
    public int zeros(int n){
        int num = (int)(Math.log(n)/Math.log(5));
        int count = 0;
        for (int i = 1; i <= num; i++){
            count += n / Math.pow(5, i);
        }
        return count;
    }
}