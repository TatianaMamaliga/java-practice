package solutions;

public class DisemvowelTrolls {
    public String disemvowel(String str) {

        char[] charArr = str.toCharArray();
        char[] vowels = {'a', 'e', 'u', 'i', 'o'};

        StringBuilder result = new StringBuilder();

        for (char c : charArr) {
            boolean isVowel = false;
            for (char vowel : vowels) {
                if (Character.toLowerCase(c) == vowel) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) {
                result.append(c);
            }
        }
        return result.toString();
    }
}