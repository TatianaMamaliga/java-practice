package solutions;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String number = Integer.toString(num);
        char[] charArr = number.toCharArray();

        Arrays.sort(charArr);

        StringBuilder resultBuilder = new StringBuilder(new String(charArr));
        resultBuilder.reverse();

        return Integer.parseInt(resultBuilder.toString());
    }
}