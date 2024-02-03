package solutions;

public class DiceGameGreedIsGood {
    /*
 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
     */
    public int getScore(int[] dice) {
        int score = 0;
        int[] counts = new int[7];

        for (int die : dice) {
            counts[die]++;
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 3) {
                if (i == 1) {
                    score += 1000;
                } else {
                    score += i * 100;
                }
                counts[i] -= 3;
            }
        }

        score += counts[1] * 100;
        score += counts[5] * 50;
        return score;
    }
}