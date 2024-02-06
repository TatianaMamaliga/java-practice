package solutions;

import java.util.Arrays;
import java.util.HashSet;

public class TwoToOne {
    public String longest(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s1.toCharArray()) {
            set.add(c);
        }
        for (char c : s2.toCharArray()) {
            set.add(c);
        }

        Character[] arr = set.toArray(new Character[0]);

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }

        return sb.toString();
    }
}