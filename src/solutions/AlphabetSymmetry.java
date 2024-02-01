package solutions;

public class AlphabetSymmetry {
    public static int[] solve(String[] words) {
        int[] result = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            int count = 0;

            for (int j = 0; j < words[i].length(); j++) {
                char currentChar = words[i].charAt(j);
                int positionInAlphabet = Character.toLowerCase(currentChar) - 'a' + 1;

                if (positionInAlphabet == j + 1) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}