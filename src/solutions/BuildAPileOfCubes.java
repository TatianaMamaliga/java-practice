package solutions;

public class BuildAPileOfCubes {
    public long findNb(long m) {
        long n = 1;
        long sum = 0;

        while (true) {
            sum += (long) Math.pow(n, 3);
            if (sum == m) {
                return n;
            } else if (sum > m) {
                return -1;
            }
            n++;
        }
    }
}