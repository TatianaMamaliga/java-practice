package solutions;

import java.util.ArrayList;
import java.util.Collections;

public class NextBiggerNumberWithTheSameDigits {

    public long getNumber(long n) {
        if (n < 10) {
            return -1;
        }

        char[] digits = Long.toString(n).toCharArray();

        for (int i = digits.length - 1; i > 0; i--) {
            int leftDigit = Character.getNumericValue(digits[i - 1]);
            int rightDigit = Character.getNumericValue(digits[i]);

            if (leftDigit < rightDigit) {
                int smallestLargerDigit = 9;
                int indexOfSmallestLargerDigit = 0;

                for (int j = i; j < digits.length; j++) {
                    int actualDigit = Character.getNumericValue(digits[j]);
                    if (actualDigit > leftDigit && actualDigit <= smallestLargerDigit) {
                        smallestLargerDigit = actualDigit;
                        indexOfSmallestLargerDigit = j;
                    }
                }

                digits[i - 1] = (char) (smallestLargerDigit + '0');
                digits[indexOfSmallestLargerDigit] = (char) (leftDigit + '0');

                ArrayList<Integer> rightDigits = new ArrayList<>();
                for (int j = i; j < digits.length; j++) {
                    rightDigits.add(Character.getNumericValue(digits[j]));
                }
                Collections.sort(rightDigits);

                StringBuilder result = new StringBuilder(new String(digits, 0, i));
                for (int digit : rightDigits) {
                    result.append(digit);
                }

                return Long.parseLong(result.toString());
            }
        }

        return -1;
    }
}