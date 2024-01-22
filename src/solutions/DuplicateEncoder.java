package solutions;

public class DuplicateEncoder {
    public String encode(String word) {
        char[] charArr = word.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            int count = 0;
            char current = charArr[i];
            for (int j = 0; j < word.length(); j++) {
                if (Character.toLowerCase(current) == Character.toLowerCase(word.charAt(j))) {
                    count++;
                    if (count == 1) {
                        charArr[i] = '(';
                    } else {
                        charArr[i] = ')';
                    }
                }
            }
        }
        return String.valueOf(charArr);
    }
}