package solutions;

public class TakeATenMinutesWalk {
    public boolean isValid(char[] walk) {
        int directionNS = 0;
        int directionWE = 0;

        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
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