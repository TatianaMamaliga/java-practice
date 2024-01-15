package solutions;

public class TakeATenMinutesWalk {
    public boolean isValid(char[] walk) {
        int directionNS = 0;
        int directionWE = 0;

        for (char c : walk) {
            switch (c) {
                case 'n':
                    directionNS++;
                    break;
                case 's':
                    directionNS--;
                    break;
                case 'e':
                    directionWE++;
                    break;
                case 'w':
                    directionWE--;
                    break;
            }
        }
        return walk.length == 10 && directionNS == 0 && directionWE == 0;
    }
}