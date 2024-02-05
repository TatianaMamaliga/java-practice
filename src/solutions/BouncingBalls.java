package solutions;

public class BouncingBalls {

    /*
    Context: https://www.codewars.com/kata/5544c7a5cb454edb3c000047/java
     */

    public int bouncingBall(double h, double bounce, double window) {
        if (h < 0 || bounce < 0 || bounce > 1 || window > h) {
            return -1;
        }
        int count = -1;
        double bouncingHeight = h;

        while (bouncingHeight > window) {
            count += 2;
            bouncingHeight *= bounce;
        }
        return count;
    }
}