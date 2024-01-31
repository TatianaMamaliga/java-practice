package solutions;

public class FindTheStrayNumber {
    public int stray(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            // Bitwise XOR assignment operator
            result ^= number;
        }
        return result;
    }
}